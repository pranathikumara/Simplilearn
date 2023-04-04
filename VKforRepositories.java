package com.vkr123;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class VKforRepositories {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int choice;
		char ch;
		Fileoperations1 f1 = new Fileoperations1();
		Fileoperations2 f2 = new Fileoperations2();
		WelcomeClass ws = new WelcomeClass();
		
		ws.WelcomeClass();
		
		Scanner sc=new Scanner(System.in);
		try {
		do
		{
		System.out.println("************************************************");
		System.out.println("1. List all the files from current directory");
		System.out.println("2. The details of the user interface");
		System.out.println("3. exit");
		System.out.println("************************************************");
		System.out.println("Enter your option");
		System.out.println("************************************************");
		
		 choice= sc.nextInt();
		System.out.println("************************************************");
		switch(choice)
		{
		
		case 1:
		      f2.search();	
		      break;
			
		
		case 2:
		{
			f1.Option21();
			break;
		}
		case 3:
			System.out.println("Thank you for using this application");
			break;
			
		default:
			
			System.out.println("your choice is incorrect. ");
			break;
		}
		
		System.out.println("********************************************************");
		System.out.println("Do you want to continue Application Operations(Y/N)");
		System.out.println("********************************************************");
		 ch= sc.next().charAt(0);
		 
		}while(ch=='y'|| ch=='Y');
		}catch(InputMismatchException e) {
			System.out.println("Enter choice other than numbers");
		}
		sc.close();
		
		
	}
}

