package question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Construction {
	public static void orderOfConstruction(int arr[], int totalFloor) {
		LinkedList<Integer> li = new LinkedList();
		int temp = totalFloor;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == temp) {
				System.out.println("Day:" + (i + 1) + " ");
				System.out.print(arr[i] + " ");

				temp--;

				int top = li.peek();
				while (top == temp) {
					System.out.print(temp + " ");
					top = li.poll();
					if (!li.isEmpty()) {
						top = li.peek();
					}
					temp--;

				} 

				Object[] a = li.toArray();
				
				System.out.println(" ");

			} else {
				li.add(arr[i]);
				Collections.sort(li, Collections.reverseOrder());
				Object[] a = li.toArray();
				System.out.println("Day:" + (i + 1) + " ");
			}

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalFloor = sc.nextInt();
		int [] arr = new int[totalFloor];
		int totalDays = 1;
		while(totalDays <= totalFloor) {
			System.out.println("enter the floor size given on day : "+ totalDays);
			int floorSize = sc.nextInt();
			arr[totalDays - 1] = floorSize;
			totalDays++;
		}
		orderOfConstruction(arr, totalFloor);
	}

}
 