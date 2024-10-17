package service;

import dataBase.DBConnection;
import model.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceProducts {
    Connection connection= DBConnection.getConnection();
    public void  insertProduct(Products products){
        connection=DBConnection.getConnection();
        PreparedStatement preparedStatement= null;
        String query = "INSERT INTO products (name, description, price, category) VALUES (?,?,?,?,?)";
        try {
            preparedStatement=connection.prepareStatement(query);
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,products.getName());
            preparedStatement.setString(2,products.getDescription());
            preparedStatement.setDouble(3,products.getPrice());
            preparedStatement.setString(4,products.getCategory());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia");
            System.out.println(e.getMessage());

        }finally {
            DBConnection.closeConnection();
        }


    }

    public void updateProducts(Products products){
        connection=DBConnection.getConnection();
        PreparedStatement preparedStatement= null;
        String query =" UPDATE  products SET name = ?, description= ?, price = ?, category = ? WHERE idProduct= ?";
        try {
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, products.getName());
            preparedStatement.setString(2, products.getDescription());
            preparedStatement.setDouble(3,products.getPrice());
            preparedStatement.setString(4, products.getCategory());
            preparedStatement.setInt(4,products.getIdProduct());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia");
        }finally {
            DBConnection.closeConnection();
        }

    }

    public void deleteProducts (Products products){
        connection=DBConnection.getConnection();
        PreparedStatement preparedStatement= null;
        String query = "DELETE FROM products WHERE idProduct = ?";
        try {
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1, products.getIdProduct());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error al borrar.");
        }finally {
            DBConnection.closeConnection();
        }


    }

    public void mostrarDatos(){
        connection=DBConnection.getConnection();
    }
}
