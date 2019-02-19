package com.ctrl.domains.stock;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ctrl.domains.StringPrefixedSequenceIdGenerator2;

@Entity
public class Product {

	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(updatable = false, nullable = false)*/
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
	@GenericGenerator(name = "prod_seq", strategy = "com.ctrl.domains.StringPrefixedSequenceIdGenerator2", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator2.VALUE_PREFIX_PARAMETER, value = "PROD_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INCREMENT_PARAMETER, value = "1"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INITIAL_VALUE, value = "PROD_1")
			})
	private String id;
	@Column(nullable = false)
	private String productCode;
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private double price;
	@Column(nullable = false)
	private double sellingprice;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = true)
	private Date expiryDate;
	@Column(nullable = false)
	private boolean active;
	
	@Column(name="created_at", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;

	@PrePersist
	protected void onCreate() {
	    createdAt = new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(double sellingprice) {
		this.sellingprice = sellingprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productCode=" + productCode + ", category=" + category + ", name=" + name
				+ ", price=" + price + ", sellingprice=" + sellingprice + ", quantity=" + quantity + ", expiryDate="
				+ expiryDate + ", active=" + active + "]";
	}
}
