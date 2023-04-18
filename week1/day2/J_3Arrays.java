package week1.day2;

import java.util.Arrays;

public class J_3Arrays {
	public static void main(String[] args) {

		String name = "Veeraiah";
		String[] arrNme = { "Srikanth", "Kanth", "Pranav", "Abhi", "Charish" };
		System.out.println(arrNme[0]);
		//array lenght
		int lenght=arrNme.length;
		//iterate all arrNme
		for (int i = 0; i < arrNme.length; i++) {
			System.out.println(arrNme[i]);
		}
		//last element
		System.out.println("Last Element:" + arrNme[lenght-1]);
		
		//First element
		System.out.println("First Element:"+arrNme[0]);
		
//to store value inside a array
		int[] sal=new int[5];
		sal[0]=80000;
		sal[1]=30000;
		sal[2]=50000;
		sal[3]=60000;
		
		//sort the array
		Arrays.sort(sal);   //sort is Predefined method
		
		for (int i = 0; i < sal.length; i++) {
			System.out.println(sal[i]);
		}
	}
}