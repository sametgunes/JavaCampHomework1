
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo",15000,"16 GB RAM");
		
		
		Product product2 = new Product();
		product2.id=1;
		product2.name="HP";
		product2.unitPrice=15000;
		product2.detail="16 GB RAM";
		
		Product product3 = new Product();
		product3.id=1;
		product3.name="Dell";
		product3.unitPrice=15000;
		product3.detail="16 GB RAM";
		
		Product[] products= {
		product1,product2,product3		
		};
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Ev / Bahçe";
		
		
		ProductManager productManager = new ProductManager();
	productManager.addToCart(product1);
	productManager.addToCart(product2);
	productManager.addToCart(product3);

	}

}
