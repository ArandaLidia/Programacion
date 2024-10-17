package model;

public class Customers {
    private String idCustomer;
    private String name, lastname, address, email;
    private String password;
    private int phone;


    public Customers() {
    }

    public Customers(String idCustomer, String name, String lastname, String address, String email, String password, int phone) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getId() {
        return idCustomer;
    }

    public void setId(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
