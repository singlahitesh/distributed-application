package com.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hitesh.singla
 */

@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue
  @Column(name ="id")
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name= "last_name")
  private String lastName;

  protected Customer(){}

  public Customer(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
