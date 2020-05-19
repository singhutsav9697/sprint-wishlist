package org.cap.wishlistmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wishedItems")
public class WishListDTO {

	@Id
	@GeneratedValue
	private int id; 

	private String productId;
	private String productName;
	private String userId;

	public WishListDTO(String userId, String productId, String productName) {
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
	}

	public WishListDTO() {

		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
