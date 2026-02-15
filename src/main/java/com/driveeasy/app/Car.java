
package com.driveeasy.app;
import jakarta.persistence.*;
import lombok.Data;
@Entity
public class Car {
 @Id @GeneratedValue
 private Long id;
 private String name;
 private double price;
 private boolean available=true;
 public Long getId() {
	return id;
 }
 public void setId(Long id) {
	this.id = id;
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
 public boolean isAvailable() {
	return available;
 }
 public void setAvailable(boolean available) {
	this.available = available;
 }
}
