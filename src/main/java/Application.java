import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application {

    public static void main(String[] args) {
        Student student= new Student();
        student.setRollNo(1);
        student.setName("Jas");
        student.setMarks(80);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();
       // session.close();
    }
}
