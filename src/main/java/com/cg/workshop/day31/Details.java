package com.cg.workshop.day31;

public class Details {


    public Details(int id, String firstName, String lastName, long phoneNumber, String emailId, String address, String city, String state, long zipCode, String type, String personName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.type = type;
        this.personName = personName;
    }

    private int id;
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailId;
    private String address;
    private String city;
    private String state;
    private long zipCode;
    private String type;
    private String personName;
    private String date;


    public Details(int id, String firstName, String lastName, long phoneNumber,
                   String emailId, String address, String city, String state, long zipCode, String type, String personName, String date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.type = type;
        this.personName = personName;
        this.date = date;
    }

    public Details(String firstName, String lastName, long phoneNumber, String emailId, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.date = date;
    }

    public Details(String firstName, String lastName, long phoneNumber, String emailId, String address, String city, String state, long zipCode, String type, String personName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.personName = personName;
        this.type = type;
    }
    public Details(String firstName, String lastName, long phoneNumber, String emailId, String address, String state, long zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.state = state;
        this.zipCode = zipCode;
        this.address = address;
    }


    public Details(String firstName, String lastName, long phoneNumber, String emailId, String address, String city,
                   String state, long zipCode) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.address = address;
    }
    public Details() {
        super();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName(){
        return firstName + lastName;
    }
}
