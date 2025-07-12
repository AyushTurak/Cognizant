package com.ishanya.employee.orm;

import com.ishanya.employee.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibernate {
    /* Method to CREATE an employee in the database */
    public Integer addEmployee(Employee employee) {
        SessionFactory factory = new MetadataSources(new StandardServiceRegistryBuilder()
                .configure()
                .build())
                .buildMetadata()
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
