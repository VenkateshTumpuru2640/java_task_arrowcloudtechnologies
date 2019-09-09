package com.appname.arrowcloud_technologies_task;

import java.util.*;

public class Check_for_Paranthesis_and_Pemicolon {
	public static void takeInput(String[] str1) {
		String ch = ";";
		for (int i = 0; i < str1.length; i++) {
			for (int k = 0; k < str1[i].length(); k++) {
				if (str1[i].charAt(i) == ')' || str1[i].charAt(i + 1) != ';') {
					
					str1[i] = str1[i] + ch;
					break;

				} else {
					System.out.println("Its Correct Syntax");
					break;

				}
			}
		}
		for (String new_string : str1) {
			System.out.println(new_string);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give your input: ");

		String str = new String();
		str=sc.nextLine();
		String[] str1 = str.split(" ");

		takeInput(str1);
	}
}
