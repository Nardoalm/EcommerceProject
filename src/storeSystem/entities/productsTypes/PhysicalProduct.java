package storeSystem.entities.productsTypes;

import storeSystem.entities.Product;

public final class PhysicalProduct extends Product {
    private final double shippingCost;

    public PhysicalProduct(String name, double price, int id, double shippingCost){
        super(name, price, id);
        this.shippingCost = shippingCost;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + shippingCost;
    }
}
