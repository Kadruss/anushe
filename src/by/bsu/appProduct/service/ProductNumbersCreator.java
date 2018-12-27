package by.bsu.appProduct.service;

import java.util.Scanner;

import by.bsu.appProduct.exception.ProductNumberException;


public class ProductNumbersCreator {
	public static int create(Scanner scan) throws ProductNumberException {
		

		System.out.println(" ");
		try {
	
			int n;
			n = scan.nextInt();
			return n;

		} catch (Exception e) {
			//System.out.println("������. ���������� ������� ������ ���� ������.");
			String temp = scan.next();
			throw new ProductNumbersException(e);
			
			
			   
		}
	}
	

}
