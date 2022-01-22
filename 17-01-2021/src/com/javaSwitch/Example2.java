package com.javaSwitch;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the input value:");
		String str = scn.next();
		switch(str)
		{
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			System.out.println("Your character is Digit");
			break;
		case "a":	
		case "A":
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
		case "f":
		case "F":
		case "g":
		case "G":
			System.out.println("The given character is ALPHABET");
			break;
			
			default:
				System.out.println("The given character is special character");
				break;
		}
			
	}

}
