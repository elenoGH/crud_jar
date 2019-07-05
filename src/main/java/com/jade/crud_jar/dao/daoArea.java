
package com.jade.crud_jar.dao;

import com.jade.crud_jar.model.CtArea;
import com.jade.crud_jar.repository.DaoRepository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class daoArea implements DaoRepository<CtArea, String>{

    private Session currentSession;
    private Transaction currentTransaction;
    
    public daoArea() {
    }
    
    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }
 
    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
     
    public void closeCurrentSession() {
        currentSession.close();
    }
     
    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
     
    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
 
    public Session getCurrentSession() {
        return currentSession;
    }
 
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }
 
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
 
    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }
    
    public void persist(CtArea entity) {
        getCurrentSession().save(entity);
    }
 
    public void update(CtArea entity) {
        getCurrentSession().update(entity);
    }
 
    public CtArea findById(String id) {
        CtArea book = (CtArea) getCurrentSession().get(CtArea.class, id);
        return book; 
    }
 
    public void delete(CtArea entity) {
        getCurrentSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<CtArea> findAll() {
        List<CtArea> books = (List<CtArea>) getCurrentSession().createQuery("from Book").list();
        return books;
    }
 
    public void deleteAll() {
        List<CtArea> entityList = findAll();
        for (CtArea entity : entityList) {
            delete(entity);
        }
    }

}
