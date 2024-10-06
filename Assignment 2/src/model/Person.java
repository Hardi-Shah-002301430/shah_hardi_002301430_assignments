/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hardishah
 */
public class Person {
    public String firstName;
    public String lastName;
    public String ssn;
    public byte age;
    
    public HomeAddress homeAddress = new HomeAddress();
                 
    public class HomeAddress {
                public String street;
                public String city;
                public long phone;
                public short unit; 
                public int zip;
                public String state;

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }


                public long getPhone() {
                    return phone;
                }

                public short getUnit() {
                    return unit;
                }

                public void setUnit(short unit) {
                    this.unit = unit;
                }

                public void setPhone(long phone) {
                    this.phone = phone;
                }

                public int getZip() {
                    return zip;
                }

                public void setZip(int zip) {
                    this.zip = zip;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

            }
    public WorkAddress workAddress = new WorkAddress();
                 
    public class WorkAddress {
    public String street;
    public String city;
    public long phone;
    public int zip;
    public String state;
    public int unit;

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String street, String state, int zip, String city, short unit, long phone) {
        this.homeAddress.setStreet(street);
        this.homeAddress.setCity(city);
        this.homeAddress.setState(state);
        this.homeAddress.setZip(zip);
        this.homeAddress.setPhone(phone);
        this.homeAddress.setUnit(unit);
    }

    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String street, String state, int zip, String city, short unit, long phone) {
        this.workAddress.setStreet(street);
        this.workAddress.setCity(city);
        this.workAddress.setState(state);
        this.workAddress.setZip(zip);
        this.workAddress.setPhone(phone);
        this.workAddress.setUnit(unit);
    }
    
}
