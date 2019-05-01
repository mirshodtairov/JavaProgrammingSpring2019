package homeWork;

import java.util.Scanner;

public class LapTopConfigurator {

	public static void main(String[] args) {
	double screenSize;
	String CPU;
	int RAM;
	String storageType;
	int memorySize;
	String resolution;
	double laptopPrice = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Select screen size: ");
	screenSize=scan.nextDouble();
	
	System.out.println("Select CPU type: ");
	CPU = scan.next();
	
	System.out.println("Select RAM size: ");
	RAM = scan.nextInt();
	
	System.out.println("Select storage type: ");
	storageType = scan.next();
	
	System.out.println("Enter memory size:");
	memorySize = scan.nextInt();
	
	System.out.println("Enter screen resolution: ");
	resolution = scan.next();
	
	
	
	if (screenSize==13.3) {
		laptopPrice = 200;}
	if (screenSize==15.0) {
		laptopPrice=300;}
	if (screenSize==17.3) {
		laptopPrice=400;}
	if (CPU.equalsIgnoreCase("i3")) {
		laptopPrice = (laptopPrice+150)+RAM/4*50;}
	if (CPU.equalsIgnoreCase("i5")) {
		laptopPrice = (laptopPrice+250)+RAM/4*50;}
	if (CPU.equalsIgnoreCase("i7")) {
		laptopPrice = (laptopPrice+350)+RAM/4*50;}
	if (storageType.equalsIgnoreCase("ssd")) {
		laptopPrice=laptopPrice+(memorySize/500)*100;}
	if (storageType.equalsIgnoreCase("hdd")) {
		laptopPrice=laptopPrice+(memorySize/500)*50;}
	if (resolution.equalsIgnoreCase("FULLHD")) {
		laptopPrice=laptopPrice+100;}
	if (resolution.equalsIgnoreCase("4k")) {
		laptopPrice=laptopPrice+200;}
		
	System.out.println("Laptop price is: "+laptopPrice);
	}
}


	

	
		
	
	

	


