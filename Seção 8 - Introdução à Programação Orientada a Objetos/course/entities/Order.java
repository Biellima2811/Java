<<<<<<< HEAD
package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product produt;
	public Order(Date date, Product produt) {
		super();
		this.date = date;
		this.produt = produt;
		this.produt.name = "Mp3";
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Product getProdut() {
		return produt;
	}
	
	public void setProdut(Product produt) {
		this.produt = produt;
	}
	
}
=======
package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product produt;
	public Order(Date date, Product produt) {
		super();
		this.date = date;
		this.produt = produt;
		this.produt.name = "Mp3";
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Product getProdut() {
		return produt;
	}
	
	public void setProdut(Product produt) {
		this.produt = produt;
	}
	
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
