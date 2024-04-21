package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Offering {

    public Offering(String offerName, double price) {
        this.offerName = offerName;
        this.price = price;
    }

    public Offering() {

    }

    @Column(name = "offer_name")
    private String offerName;
    @Column(name = "price")
    private double price;

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Offering{" +
                "offerName='" + offerName + '\'' +
                ", price=" + price +
                '}';
    }
}
