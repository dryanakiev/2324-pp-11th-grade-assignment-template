package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offering {

    @Column(name = "offer_name")
    private String offerName;

    @Column(name = "price")
    private double price;

}
