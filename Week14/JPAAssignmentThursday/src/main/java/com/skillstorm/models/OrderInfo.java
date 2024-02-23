package com.skillstorm.models;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderInfo {

	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name="scheduled_time")
	private LocalDateTime scheduledTime;
	
	@ManyToOne
	@JoinColumn(name="customer")
	private Customer customer;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(LocalDateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, orderId, scheduledTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderInfo other = (OrderInfo) obj;
		return Objects.equals(customer, other.customer) && orderId == other.orderId
				&& Objects.equals(scheduledTime, other.scheduledTime);
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", scheduledTime=" + scheduledTime + ", customer=" + customer + "]";
	}
}
