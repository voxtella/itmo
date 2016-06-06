package com.test;

import java.util.Scanner;


public class MyClassServlet {
	private static final String ProductI = null;
	public static String description = "To get more information on this app, enter -all.";
	public static String descriptionCommand = "-d";

	public static String Product = "If you want to get information about our products, plase, visit our official site http://www.etudehouse.com/." ;
	public static String ProductICommand = "-product";
	public static String sayThx = "Thank you for visit!";
	
	public static String buyCommand = "-buy";
	public static String buy = "You can buy our products on our site http://www.etudehouse.com/";
	
	public static String infoCommand = "-info";
	public static String info = "AllCommands";
	public static String infoText = "All commands";
	
	public static String name;
	
	public static String[][] commands;
	
	public static Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		createAllCommands();
		
		
		if(args.length !=0) {
			
			if(args[0].equals(descriptionCommand)) {
				
				getDescription();
				
			} else if (args[0].equals(ProductICommand)) {
				
				Product();
				
			} else if(args[0].equals(buyCommand)) {
				
				buy();
				
			} else if(args[0].equals(infoCommand)) {
				
				info();
				
			} 
		}
	}


	private static void createAllCommands() {

		commands = new String[4][2];
		
		commands[0][0] = descriptionCommand;
		commands[0][1] = description;
		
		commands[1][0] = ProductICommand;
		commands[1][1] = ProductI;
		
		commands[2][0] = buyCommand;
		commands[2][1] = buy;
		
		commands[3][0] = infoCommand;
		commands[3][1] = info;
		
	}


	private static void info() {
		
		System.out.println(infoText);
		
		for(String[] s : commands) {
			System.out.println(s[0] + ": "+s[1]);
		}
		
	}

	private static void buy() {

		System.out.print(buy);
		
	}


	private static void Product() {
		System.out.print(Product);
		System.out.print(sayThx);
		
	}


	private static void getDescription() {
		System.out.print("Description: "+description);
	}
	}

