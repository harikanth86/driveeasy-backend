
package com.driveeasy.app;
import jakarta.persistence.*;
import lombok.Data;
@Entity @Data
public class Car {
 @Id @GeneratedValue
 private Long id;
 private String name;
 private double price;
 private boolean available=true;
}
