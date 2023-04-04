package com.vkr123;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Fileoperations2 {
	public void printfileNames(File[] a,int i, int lvi) {
		if(i==a.length)
		{
			return;
		}
		if (a[i].isFile())
		{
			System.out.println(a[i].getName());
		}
		printfileNames(a,i+1,lvi);
	}
	
	public void search() {
		String path="C:\\Users\\Admin\\Documents\\file handling";
		File directory= new File(path);
		String contents[] = directory.list();
		ArrayList<String> ar = new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<contents.length; i++) {
			  ar.add(contents[i]);  
		      }
		  ar.sort(Comparator.naturalOrder());
    System.out.println("List of files and directories in the specified directory:");
    Iterator<String> itr = ar.iterator();
    while(itr.hasNext()) {
  	  System.out.println(itr.next());
	    }
		

	}

	
}
