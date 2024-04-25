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
        double discount = price * percent / 100;
        price -= discount; 
    }
}
