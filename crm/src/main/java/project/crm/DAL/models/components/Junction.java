package project.crm.DAL.models.components;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.lang.reflect.Field;

@Embeddable
public class Junction<T extends BaseModel, U extends BaseModel> implements Serializable {

    @ManyToOne
    @JoinColumn(name = "default_entity1_id")
    private T entity1;

    @ManyToOne
    @JoinColumn(name = "default_entity2_id")
    private U entity2;


    public Junction() {
    }

    public Junction(String entity1ColumnName, String entity2ColumnName) {
        this.entity1 = entity1;
        this.entity2 = entity2;
    }


    public T getEntity1() {
        return entity1;
    }

    public void setEntity1(T entity1) {
        this.entity1 = entity1;
    }

    public U getEntity2() {
        return entity2;
    }

    public void setEntity2(U entity2) {
        this.entity2 = entity2;
    }
}