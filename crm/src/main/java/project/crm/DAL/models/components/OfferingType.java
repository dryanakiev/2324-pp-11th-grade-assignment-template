package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OfferingType {

    public OfferingType(String typeName) {
        this.typeName = typeName;
    }

    public OfferingType() {
    }

    @Column(name = "type_name")
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "OfferingType{" +
                "typeName='" + typeName + '\'' +
                '}';
    }
}
