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
struct list * findAndPushBack(int n, struct list * node){

  struct list *current,*after,*previous=node,*last=node;

  current=node;

  while(current->value != n && current!=NULL){
        current=current->next;



  if(current->next==NULL && current->value != n){
      printf("\nThe number was not found.\n");
      return node;

    }
  }
  if(current->next==NULL && current->value==n){
      printf("\nThe number found in last position and remained intact.\n");
      return node;
    }

  if(current->value<current->next->value && current->next != NULL && current->value==n){
    
    if(previous->value==n){
      while(last->next != NULL){
        last=last->next;
      }
      node=previous->next;

      current->next=NULL;


        last->next=current;
    }else{

      while(previous->next != current){
        previous=previous->next;
      }

      after=node;

	    while(after->value != n){
        after=after->next;
	    }

	    after=after->next;

	    while(last->next != NULL){
        last=last->next;
	    }
      
      last->next=current;
      current->next=NULL;
      previous->next=after;

    }


	  printf("\nThe number was found and pushed to the last position.\n");
	  return node;
  }

  if(current->value>current->next->value){
    printf("\nThe number was found but next value was not greater.\n");
    return node;
  }

  return node;
}


int main()
{
  struct list *head;
  int value,N,num,i=1;

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

  printf("\nGive the number you want to find in the list:");
  scanf("%d", &num);

  head=findAndPushBack(num,head);
  printList(head);

return 0;
}
