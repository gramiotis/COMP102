#include <stdio.h>
#include <stdlib.h>


struct list{
  int value;
  struct list *next;
};

struct list **searchNextNodeList(int v, struct list **ptr) {
	if (*ptr == NULL)
		return ptr;
	return searchNextNodeList(v, &((*ptr)->next) );
}

void insertNodeList(int v, struct list **l) {
	struct list *node;
	struct list **node2 = searchNextNodeList(v, l);
	node = (struct list *)malloc(sizeof(struct list));
	node->value = v;
	node->next = *node2;
	*node2 = node;
}

void printList(struct list *l){

	while(l != NULL){
		printf("%d ", l->value);
		l = l->next;
  }
}

int checkModuloOfSum(struct list* node){
  struct list* tmp=node;
  int sum=0,n=0;
  tmp=tmp->next;

  if(tmp!=NULL){
    sum=checkModuloOfSum(node->next);
    sum=sum+tmp->value;
    n=(sum % node->value);
  }

  if(n==0){
    printf("%d[%d](YES)",node->value,sum);
    printf(" ");
  }

  if(n!=0){
    printf("%d[%d](NO)",node->value,sum);
    printf(" ");
  }


  return sum;
}

int main()
{
  struct list *head;
  int value,N,i=0;

  head=NULL;

  printf("\nGive the number of integers you want to enter:");
  scanf("%d", &N);
  for(i=1;i<=N;i++){
    printf("\nGive the value for the #%d list:",i);
    scanf("%d",&value);
    insertNodeList(value,&head);
  }

  printList(head);
  printf("\n");
  checkModuloOfSum(head);
return 0;
}
