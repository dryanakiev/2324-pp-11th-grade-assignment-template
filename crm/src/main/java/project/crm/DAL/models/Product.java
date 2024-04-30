package project.crm.DAL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.crm.DAL.models.components.BaseModel;
import project.crm.DAL.models.components.Offering;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {

    @Embedded
    private Offering product;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

}
