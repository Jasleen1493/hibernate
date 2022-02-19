import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Library {

    @Id
    private int id;
    private String name;
   /* private List<Book> books;
    private List<Student> students;
    private List<Employee> employees;
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
