package org.o7planning.tutorial.model;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;

    public Person(String fullname, String address, String city, String phone, String email){
        this.setName(fullname);
        this.setAddress(address);
        this.setCity(city);
        this.setPhone(phone);
        this.setEmail(email);
    }

    public String getName() {
        return fullname;
    }

    public void setName(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
}