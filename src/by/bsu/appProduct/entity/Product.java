package by.bsu.appProduct.entity;

public class Product {
	
		private int id;
		private String name;
		private Integer UPS;
		private int price;
		//private String shelLife;
		private int amout;
		private int shelfLife;//days
		
		//TODO:add constructors 

		public Product(int id, String name, Integer UPS,
				int price, int shelfLife,
				int amout) {
			super();
			this.id = id;
			this.name = name;
			this.UPS = UPS;
			this.price = price;
			this.shelfLife = shelfLife;
			this.amout = amout;
			
		}
	

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getUPS() {
			return UPS;
		}


		public void setUPS(Integer uPS) {
			UPS = uPS;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getShelfLife() {
			return shelfLife;
		}


		public void setShelfLife(int shelfLife) {
			this.shelfLife = shelfLife;
		}


		public int getAmout() {
			return amout;
		}


		public void setAmout(int amout) {
			this.amout = amout;
		}


		@Override
		public String toString() {
			return "Product [id=" + id + ", name ="
					+ name  + ", UPS =" + UPS
					+ ", price =" + price
					+ ", shelfLife =" + shelfLife
					+ ", amout =" + amout ;
		}
}



       


      
















		
		
		
	
		
	
