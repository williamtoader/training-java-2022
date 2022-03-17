package shop;

public class Product implements Comparable<Product>{

    private int id;
    private double price;
    private String name;


    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    public double getPrice() {
    	return this.price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
    
}
