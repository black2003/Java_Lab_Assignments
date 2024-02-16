package assignment3;

public class Book 
{
	
	private int bkid;
	private String bkName;
	private double bkPrice;
	public int getBkid() {
		return bkid;
	}
	public void setBkid(int bkid) {
		this.bkid = bkid;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	public double getBkPrice() {
		return bkPrice;
	}
	public void setBkPrice(double bkPrice) {
		this.bkPrice = bkPrice;
	}
	
	public Book(int id, String name, double p) {
		bkid = id;
		bkName = name;
		bkPrice = p;
	}
	
}
