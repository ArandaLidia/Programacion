package model;

import java.util.Date;

public class Orders {
    private int idOrder;
    private double totalOrder;
    private Date dateOrder;
    private String idCustomer;
    private int idProduct;

    public Orders() {
    }

    public Orders(int idOrder, double totalOrder, Date dateOrder, String idCustomer, int idProduct) {
        this.idOrder = idOrder;
        this.totalOrder = totalOrder;
        this.dateOrder = dateOrder;
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public double getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(double totalOrder) {
        this.totalOrder = totalOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
}
