package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {
	Scanner input = new Scanner(System.in);
	public List<String> toDoList = new ArrayList<String>();
	
	public void addItem(String item) {
		if(item == "" || item == " ") {
			System.out.println("You must type something to add to your to-do list!");
			return;
		} else {
			toDoList.add(item);
			System.out.println(item + " was added to your to-do list");
		}

	} //end of adding method
	
	public void displayList() {
		if (toDoList.isEmpty()) {
			System.out.println("Your to-do list is empty! Add items to the list to display them");
			return;
		} else {
			for(String listItem : toDoList) {
				int index = (toDoList.indexOf(listItem) + 1);
				System.out.println("	" + index + ". " + listItem);
			}
		}
	} //end of display method
	
	public void removeItem() {
		//checking if list is empty
		if(toDoList.isEmpty()) {
			System.out.println("there is nothing to remove! Add items to remove them");
			return;
		} else {
			System.out.println("Please input the number of the item you want to remove from your list");
			displayList();
			int indexToRemove = input.nextInt();
			input.nextLine();
			//checking if number entered is valid list option
			if (toDoList.size() < indexToRemove || indexToRemove < 1) {
				System.out.println("That is not a valid choice");
				return;
			}
			int itemIndex = indexToRemove - 1;
			String itemToRemove = toDoList.get(itemIndex);
			//checking if item to remove is in the list
			if (toDoList.contains(itemToRemove)){
				toDoList.remove(itemIndex);
				System.out.println(itemToRemove + " has been removed from your to-do list");
			}
		}
	}
}
