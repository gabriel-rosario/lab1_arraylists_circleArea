package lab1_circle_arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsJava {
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter desired number of requests: ");
	int totalRequests = input.nextInt();
	int counter = 0;
	int request = 0;
	
	while(counter < totalRequests){
		System.out.print("Enter \"1\" to add a number. Enter \"2\" to remove a number. Enter \"3\" to print size of array. ");
		System.out.println();
		request = input.nextInt();
		
		
		if(request == 1){
			System.out.print("Enter value to add to Array: ");
			int number = input.nextInt();
			arr.add(number);
			for(int i = 0; i<arr.size();i++){
				System.out.print(arr.get(i) + " ");
			}
			counter++;
			System.out.println();
		}else if(request == 2){
			System.out.print("Enter value to remove from the array: ");
			int number = input.nextInt();
			for(int i=0;i<arr.size();i++){
				if(number == arr.get(i)){
					arr.remove(i);
					i--;
				}
			}
			for(int i = 0; i<arr.size();i++){
				System.out.print(arr.get(i) + " ");
			}
			counter++;
			System.out.println();
		}else if(request == 3){
			System.out.println("The size of the Array List: "+arr.size());
			counter++;
		}
	}
	
	}
}
