package by.bsu.appProduct;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


import by.bsu.appProduct.entity.Product;
import by.bsu.appProduct.entity.ProductList;
import by.bsu.appProduct.exception.ProductNumberException;
import by.bsu.appProduct.service.ProductCreator;
import by.bsu.appProduct.service.ProductNumbersCreator;
import by.bsu.appTrain.exception.TrainNumberException;
import by.bsu.appTrain.service.TrainNumbersCreator;




public class Runner {

	public static void main(String[] args) throws ParseException, IOException {
		
		
		int n = 0;
		
		
		Product prod = new Product(1,"Hleb",123564,123,56,23);
		System.out.println(prod.toString());
		System.out.println(" Введите количество продукта: ");
		Scanner scan = new Scanner(System.in);
		boolean isError = true;
		while (isError) {
			try {
		        n = ProductNumbersCreator.create(scan);
		        isError = false; // то есть уже нет ошибки
		    
		    } catch (ProductNumberException e) {
					   
		    }
		ProductList productList = new ProductList(n);

		for (int i = 0; i < n; i++) {
	    
		   
			prod = ProductCreator.create(scan);
			productList.add(prod);

		}
		
		System.out.println("���������� �������:");

		for (int i = 0; i < n; i++) {

			prod = productList.read(i);

			System.out.println(prod.toString());

		}
	}
}
		}
}