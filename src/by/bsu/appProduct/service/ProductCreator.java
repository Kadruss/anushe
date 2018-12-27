package by.bsu.appProduct.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import by.bsu.appProduct.entity.Product;


public class ProductCreator {
public static Product createFake(){
		
	Product prod = new Product(1,"Hleb",123564,123,56,23);
		
		return prod;
		
	}
	
  public static Product create(Scanner scan) throws ParseException, IOException{
	/*
	 * 
	 *  int id;
		String name;
		Integer UPS;
		int price;
		String shelLife;
		int amout;
		String shelfLife;
	 * 
	 * 
	 * */
	    int id;
		String name;
		Integer UPS;
		int price;
		int amout;
		int shelfLife ;
	  
	  System.out.println("Введите id: ");
	  id = scan.nextInt();
	  
	  System.out.println("Введите имя: ");
	  name = scan.next();
	  
	  System.out.println("Введите универсальный код продукта: ");
	  UPS = scan.nextInt();
	  
	  System.out.println("Введите цена: ");
	  price = scan.nextInt();
	  
	  System.out.println("Введите shelLife: ");
	  shelfLife = scan.nextInt();
	  
	  System.out.println("Введите количество: ");
	  amout = scan.nextInt();
	  
	  
	  Product prod = new Product(id, name, UPS,price,shelfLife, amout);
	  return prod;
	  
  }
} 


