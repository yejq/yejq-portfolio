package org.yejq.util;

public class MathUtils {

	public static int randomInt(int size){
		return (int)(Math.random() * size);
	}
	
	public static void main(String[] args) {
		System.out.println(randomInt(3));		
	}
}
