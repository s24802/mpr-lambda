package model;
public class Address {

    private String streetName;
    private Integer houseNumber;
    private Integer flatNumber;
    private String city;
    private String postCode;
    private String country;

    public String getStreetName() {
        return streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String streetName) {
        this.streetName = streetName;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
