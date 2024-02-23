package com.skillstorm.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="grocery_item")
public class GroceryItem {

	@Id
	@Column(name="grocery_id")
	private int groceryId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn
	private OrderInfo order;

	public int getGroceryId() {
		return groceryId;
	}

	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderInfo getOrder() {
		return order;
	}

	public void setOrder(OrderInfo order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, groceryId, order, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		return Objects.equals(description, other.description) && groceryId == other.groceryId
				&& Objects.equals(order, other.order) && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "GroceryItem [groceryId=" + groceryId + ", description=" + description + ", quantity=" + quantity
				+ ", order=" + order + "]";
	}
}
