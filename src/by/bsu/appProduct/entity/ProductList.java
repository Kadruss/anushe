package by.bsu.appProduct.entity;



public class ProductList {
	private Product[] productList;
	int number ;
	int currentNumber=0;
	public ProductList(int n){
		productList = new Product[n];
		number = n;
	}
   public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
public void add(Product prod){
	 productList[currentNumber ++] = prod;
   }
   
   public Product read(int i){
		 return productList[i] ;
	   }
public int getCurrentNumber() {
	return currentNumber;
}
}