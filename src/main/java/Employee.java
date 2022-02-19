import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;

    private Name name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
