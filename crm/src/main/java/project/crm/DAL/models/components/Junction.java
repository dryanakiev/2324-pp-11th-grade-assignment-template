package project.crm.DAL.models.components;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.lang.reflect.Field;

@Embeddable
public class Junction<T extends BaseModel, U extends BaseModel>{


    @ManyToOne
    private T entity1;

    @ManyToOne
    private U entity2;

    private static final String name1 = entity1.getClass().getSimpleName().toLowerCase() + "_id";

    void getSimpleName() {};

    @AttributeOverride(name = name1)

    public Junction() {
    }

    public Junction(T entity1, U entity2) {
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


    private void setColumnNames() {
        try {
            Field entity1Field = Junction.class.getDeclaredField("entity1");
            Column entity1Column = entity1Field.getAnnotation(Column.class);
            if (entity1Column != null && entity1 != null) {
                //entity1Column.name(entity1.getClass().getSimpleName().toLowerCase() + "_id");
            }

            Field entity2Field = Junction.class.getDeclaredField("entity2");
            Column entity2Column = entity2Field.getAnnotation(Column.class);
            if (entity2Column != null && entity2 != null) {
                //entity2Column.name(entity2.getClass().getSimpleName().toLowerCase() + "_id");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
