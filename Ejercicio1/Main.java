package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 2, 1200.0f);
        Product product2 = new Product("Mouse", 5, 25.0f);

        Invoice invoice = new Invoice("John Doe");
        invoice.add(product1);
        invoice.add(product2);

        System.out.println("Total de la factura: $" + invoice.total());
    }
}