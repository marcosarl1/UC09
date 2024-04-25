package model.entities;

public class Sale {
    
    private Double price;

    public Sale(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
    
    public void requestDiscount(double percent){
        if(percent < 0 || percent > 100){
            throw new IllegalArgumentException("Desconto deve estar entre 0 e 100 por cento");
        }
        double discount = price * percent / 100;
        price -= discount; 
    }
}
