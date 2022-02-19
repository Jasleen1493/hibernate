import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {
        Name studentName = new Name("Ram","Mohan","Roy");

        Student student= new Student();
        student.setRollNo(1);
        student.setGender("Male");
        student.setName(studentName);
        student.setMarks(81);

        Name employeeName = new Name("Ritu","","Verma");

        Employee employee = new Employee();
        employee.setId(101);
        employee.setName(employeeName);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                                      .addAnnotatedClass(Employee.class).addAnnotatedClass(Library.class)
                                      .addAnnotatedClass(Book.class).addAnnotatedClass(Issuer.class)
                                        .addAnnotatedClass(Department.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();
        session.close();
    }
}
