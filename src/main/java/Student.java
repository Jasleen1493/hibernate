import javax.persistence.*;

@Entity
@Table(name= "StudentTable")
public class Student {
    @Id
    int rollNo;

    //@Transient
    String gender;

    @Column(name = "StudentName")
    StudentName name;

    float marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}