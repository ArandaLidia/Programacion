package dataBase;

public interface EsquemaDB {
    // Base de datos
    String DB_NAME = "tienda";
    // Tabla de productos
    String TAB_PRODUCTS = "products";
    String COL_PRODUCT_ID = "idProduct";
    String COL_PRODUCT_NAME = "productName";
    String COL_PRODUCT_DESCRIPTION = "description";
    String COL_PRODUCT_PRICE = "price";
    String COL_PRODUCT_CATEGORY = "category";
    // Tabla de pedidos
    String TAB_ORDERS = "orders";
    String COL_ORDER_ID = "idOrder";
    String COL_ORDER_TOTAL = "totalOrder";
    String COL_ORDER_DATE = "dateOrder";
    String COL_ORDER_CUSTOMER_ID = "idCustomer";
    String COL_ORDER_PRODUCT_ID = "idProduct";
    // Tabla de clientes
    String TAB_CUSTOMERS = "customers";
    String COL_CUSTOMER_ID = "idCustomer";
    String COL_CUSTOMER_NAME = "customerName";
    String COL_CUSTOMER_LASTNAME = "lastname";
    String COL_CUSTOMER_EMAIL = "email";
    String COL_CUSTOMER_PHONE = "phone";
    String COL_CUSTOMER_PASSWORD="password";
}
