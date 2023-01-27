package week2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Todo todo = new Todo();
		//List<String> todoList = todo.toDoList;
		boolean on = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! Welcome to your to-do list app!");
		do {
			System.out.println(" please select an option \n"
					+ "	1.add a something to your to-do list \n"
					+ "	2.display your to-do list \n"
					+ "	3.remove an item from your to-do list \n"
					+ "	4. exit");
			
			int option = input.nextInt();
			input.nextLine(); //to account for next line not provided by calling nextInt above
			switch (option) {
			case 1:
				System.out.println("please type your task and hit enter");
				String taskToAdd = input.nextLine();
				todo.addItem(taskToAdd);
				break;
			case 2:
				System.out.println("Here is your todo list: ");
				todo.displayList();
				break;
			case 3:
				todo.removeItem();
				break;
			case 4:
				System.out.println("are you sure you want to exit? all your list items will be lost! \n"
						+ "	1.y \n"
						+ "	2.n ");
				String response = input.nextLine();
				if(response.equalsIgnoreCase("n")) {
					break;
				} else if(response.equalsIgnoreCase("y")) {
					System.out.println("Alright then, thats all folks! Thanks for playing");
					on = false;
					break;
				} else {
					System.out.println("Someone cant follow instructions... why dont we try that again?");
					break;
				}
			default: 
				System.out.println("Maybe try something off the menu idk...");
			}
		} while (on);
		input.close();
		System.exit(0);
	}

}
