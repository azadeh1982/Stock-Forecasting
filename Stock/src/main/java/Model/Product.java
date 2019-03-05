package Model;

public class Product {
private int SKU;
private String productName;
private String storeName;
private int Quantity;


public Product(int SKU, String productName, String storeName,int quantity) {
	super();
	this.SKU = SKU;
	this.productName = productName;
	this.storeName = storeName;
	this.Quantity = Quantity;
}
private int getSKU() {
	return SKU;
}
private void setSKU(int sKU) {
	SKU = sKU;
}
private String getProductName() {
	return productName;
}
private void setProductName(String productName) {
	this.productName = productName;
}
private String getStoreName() {
	return storeName;
}
private void setStoreName(String storeName) {
	this.storeName = storeName;
}
private int getQuantity() {
	return Quantity;
}
private void setQuantity(int quantity) {
	Quantity = quantity;
}
}


