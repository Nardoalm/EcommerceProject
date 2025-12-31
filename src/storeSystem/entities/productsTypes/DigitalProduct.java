package storeSystem.entities.productsTypes;

import storeSystem.entities.Product;

public final class DigitalProduct extends Product {
    private final double downloadFee;

    public DigitalProduct(String name, double price, int id, double downloadFee) {
        super(name, price, id);
        this.downloadFee = downloadFee;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + downloadFee;
    }
}
