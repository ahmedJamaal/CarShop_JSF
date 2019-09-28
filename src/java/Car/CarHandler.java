/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import Com.NewCar;
import Com.NewHibernateUtil;
import Com.UsedCar;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ahmed
 */
public class CarHandler {
    
     public ArrayList<NewCar> getNewCar()
    {
     
        ArrayList<NewCar> list= new ArrayList<>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
       String hql=" from NewCar";
        Query query =session.createQuery(hql);
        list= (ArrayList<NewCar> )query.list();
        session.close();
        
        return list;
    }
    
    public void AddNewCar(NewCar newcar)
    {
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(newcar);
        transaction.commit();
        session.close();
    }
    
    public NewCar getNewCarbyID(int id)
    {
     
       NewCar obj=new NewCar();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        obj = (NewCar) session.get(NewCar.class,id);
        
        session.close();
        
        return obj;
    }
     public void Edit(NewCar obj)
    {
       
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
       
        session.update(obj);
        transaction.commit();
        
        session.close();
        
        
    }
         public void Delete(NewCar obj)
    {
       
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        
        session.close();
            
    }
         public NewCar getNewCar(long id)
         {
           NewCar obj=new NewCar();
              Session session = NewHibernateUtil.getSessionFactory().openSession();
        // create transaction //
        Transaction transaction = session.beginTransaction();
        
        obj = (NewCar) session.get(NewCar.class, id);
        
        session.close();
        
        return obj;
             
         }

    //////////////////////UsedCAR///////////////////////////////////////////////////
         
         
          public ArrayList<UsedCar> getUsedCar()
    {
     
        ArrayList<UsedCar> list= new ArrayList<>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
       String hql=" from UsedCar";
        Query query =session.createQuery(hql);
        list= (ArrayList<UsedCar> )query.list();
        session.close();
        
        return list;
    }
    
    public void AddUsedCar(UsedCar usedcar)
    {
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(usedcar);
        transaction.commit();
        session.close();
    }
    
    public UsedCar getUsedCarbyID(int id)
    {
     
       UsedCar obj=new UsedCar();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        obj = (UsedCar) session.get(UsedCar.class,id);
        
        session.close();
        
        return obj;
    }
     public void EditUsedCar(UsedCar obj)
    {
       
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
       
        session.update(obj);
        transaction.commit();
        
        session.close();
        
        
    }
         public void DeleteUsedCar(UsedCar obj)
    {
       
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        
        session.close();
            
    }
         public UsedCar getUsedCar(long id)
         {
           UsedCar obj=new UsedCar();
              Session session = NewHibernateUtil.getSessionFactory().openSession();
        // create transaction //
        Transaction transaction = session.beginTransaction();
        
        obj = (UsedCar) session.get(UsedCar.class, id);
        
        session.close();
        
        return obj;
             
         }

}
