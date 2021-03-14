package client;

import java.util.Scanner;

import bus.DataCollection;
import bus.Shape;
import bus.Circle;
import bus.EnumColor;
import bus.EnumName;
import bus.IShape2D;
import bus.Square;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputKey;
		
		do {
			System.out.println("1 - Create and add a square into the data collection of IShape2D");
			System.out.println("2 - Create and add a circle into the data collection of IShape2D");
			System.out.println("3 - Display all the squares from the data collection of IShape2D");
			System.out.println("4 - Search for a square by serial number");
			System.out.println("5 - Remove a square from the data collection of IShape2D");
			System.out.println("6 - Display all the circles from the data collection of IShape2D");
			System.out.println("7 - Search for a circle by serial number");
			System.out.println("8 - Remove a circle from the data collection of IShape2D");
			System.out.println("9 - Exit");
			System.out.print("\t Enter your option: ");
			
			
			inputKey = scanner.next();
			switch (inputKey) {
				case "1": {
					System.out.print("Enter your desired Serial Number: ");
					String sn = scanner.next();
					
					EnumColor color  = EnumColor.Undefined;	
					System.out.println("color ? : ");
					System.out.println(" \t 1- Dark color");
					System.out.println(" \t 2- Blue color");
					System.out.println(" \t 3- Red color");
					System.out.println("  \t\t Choose your color [1-Dark, 2-Blue, 3-Red]");	
					  switch(scanner.nextInt())
						{
						case 1 :
							color = EnumColor.Dark;
							break;					
						case 2:
							color = EnumColor.Blue;
							break;
						case 3:
							color = EnumColor.Red;
							break;
						default:
							color = EnumColor.Undefined;
							break;
						}
					  
					 System.out.print("Enter your desired square side (e.g. 12.15): ");
					 double side = scanner.nextDouble();
						
					IShape2D square = null;
					square = new Square(sn, color, EnumName.Square, side);
					DataCollection.add(square);
					System.out.println("\n\n\n\n\n\n");
					break;
				}
				case "2": {
					System.out.print("Enter your desired Serial Number: ");
					String sn = scanner.next();
					
					EnumColor color  = EnumColor.Undefined;	
					System.out.println("color ? : ");
					System.out.println(" \t 1- Dark color");
					System.out.println(" \t 2- Blue color");
					System.out.println(" \t 3- Red color");
					System.out.println("  \t\t Choose your color [1-Dark, 2-Blue, 3-Red]");	
					  switch(scanner.nextInt())
						{
						case 1 :
							color = EnumColor.Dark;
							break;					
						case 2:
							color = EnumColor.Blue;
							break;
						case 3:
							color = EnumColor.Red;
							break;
						default:
							color = EnumColor.Undefined;
							break;
						}
					  
					 System.out.print("Enter your desired circle radius (e.g. 12.15): ");
					 double side = scanner.nextDouble();
						
					IShape2D circle = null;
					circle = new Circle(sn, color, EnumName.Circle, side);
					DataCollection.add(circle);
					
					System.out.println("\n\n\n\n\n\n");
					break;
				}
				case "3": {
					System.out.println(DataCollection.getSquare());
					System.out.println("\n\n");
					break;
				}
				case "4": {
					System.out.print("Enter the Square Serial Number you want to search: ");
					String sn = scanner.next();
					System.out.println(DataCollection.search(sn));
					System.out.println("\n\n");
					break;
				}
				case "5": {
					System.out.print("Enter the Square Serial Number you want to delete: ");
					String sn = scanner.next();
					DataCollection.remove(sn);
					break;
				}
				case "6": {
					System.out.println(DataCollection.getCircle());
					System.out.println("\n\n");
					break;
				}
				case "7": {
					System.out.print("Enter the Circle Serial Number you want to search: ");
					String sn = scanner.next();
					System.out.println(DataCollection.search(sn));
					System.out.println("\n\n");
					break;
				}
				case "8": {
					System.out.print("Enter the Square Serial Number you want to delete: ");
					String sn = scanner.next();
					DataCollection.remove(sn);
					break;
				}
				case "9": {
					System.out.println("Option 9 is entered...");
					break;
				}
				
				
				default:
					System.out.println("No Valid Input Entered!!\n\n");
					continue;
				}
		} while (!inputKey.equals("9"));
		
		System.out.println("Application is closed successfuly!");
		
		
		
		scanner.close();
	}

}