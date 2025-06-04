package com.Assignments;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int i = rnd.nextInt(10);	
		//This will generate any value in the range of 0 to 9
		System.out.println(i);
	}

}
