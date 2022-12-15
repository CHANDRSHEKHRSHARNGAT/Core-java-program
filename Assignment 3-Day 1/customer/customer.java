// Write a java program to store details of customer , customer id , customer name , customer address
// 1. create Customer class with attribute  customerId of int type , customerName of type String , customerAddress of type String
// 2. add get/set method  constructor  / param constructor with 3 parameters
// 4. add equals and hashcode method in the customer class
// 5. Add toString() method in the customer class
// 4. Create  CustomerTest class with main method 
//     i. Create two different objects of customer  
//    ii. Check the objects are equal or not 
//  iii. Print the object details of both the object - 
//  iV. Print message  "objects are equal "  or "objects are not equal " after checking for equality 



package customer;

import java.util.Objects;

public class customer {
    //Attributes
    private int customerId;
    private String customerName;
    private String customerAddress;
    
    //Constructor
    public customer() {
      this.customerId = 0;
      this.customerName = "";
      this.customerAddress = "";
    }
    
    //Parameterized constructor
    public customer(int customerId, String customerName, String customerAddress) {
      this.customerId = customerId;
      this.customerName = customerName;
      this.customerAddress = customerAddress;
    }
    
    //Getters and setters
    public int getCustomerId() {
      return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
      this.customerId = customerId;
    }
    
    public String getCustomerName() {
      return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
      this.customerName = customerName;
    }
    
    public String getCustomerAddress() {
      return this.customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress) {
      this.customerAddress = customerAddress;
    }
    
    //equals and hashCode methods
    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      customer customer = (customer) o;
      return customerId == customer.customerId &&
             Objects.equals(customerName, customer.customerName) &&
             Objects.equals(customerAddress, customer.customerAddress);
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(customerId, customerName, customerAddress);
    }
    
    //toString method
    @Override
    public String toString() {
      return "Customer{" +
             "customerId=" + customerId +
             ", customerName='" + customerName + '\'' +
             ", customerAddress='" + customerAddress + '\'' +
             '}';
    }
  }
  
  class CustomerTest {
    public static void main(String[] args) {
      //Create two different objects of customer
      customer customer1 = new customer(1, "chandrashekhar", "123 Main St.");
      customer customer2 = new customer(2, "Jane", "456 Park Ave.");
      
      //Check if the objects are equal
      if (customer1.equals(customer2)) {
        System.out.println("Objects are equal");
      } else {
        System.out.println("Objects are not equal");
      }
      
      //Print the object details of both the objects
      System.out.println("Details of customer1: " + customer1.toString());
      System.out.println("Details of customer2: " + customer2.toString());
    }
  }
  
