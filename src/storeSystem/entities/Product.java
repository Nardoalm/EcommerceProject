package storeSystem.entities;

public abstract class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateFinalPrice();

    public String showData(){
        return "Product data:\nName: " +
                getName() +
                "\nPrice: " +
                getPrice() +
                "\nID: " +
                getId();
    }

    public String toString(){
        return getName();
    }
}
