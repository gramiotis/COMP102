package tuc.ece.cs102.company.main;

import tuc.ece.cs102.list.Node;
import tuc.ece.cs102.list.SortedList;
import tuc.ece.cs102.list.Item;

public class VehicleSortedList extends SortedList{
	
	public VehicleSortedList() {
		super();
	}
	
	public Item search(String key){
		Node tmpNode = getFirst();
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(key)){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	public void printItemsInHierarchy(String className){
		Node tmp = getFirst();
		try{
			while (tmp!=null){
				Item item = tmp.getValue();				
				if (Class.forName("tuc.ece.cs102.company.model.Vehicle." + className).isInstance(item.getData())){
					item.print();
				}
				tmp = tmp.getNext();
			}
		}catch (ClassNotFoundException ex){
			System.out.println("This class "+className+" does not exist...");
		}		
	}
	
	

}