package controller;

/**
 *
 * @author Jurijs
 */
import javax.persistence.*;
import model.Product;
import model.Supplier;

public class TestShop {

    /**
     * @param args the command line arguments
     */
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("ShopPU");
        em = emf.createEntityManager();

        em.getTransaction().begin();
        
        
        
        
        
        
        
        //*****Supplier - Product*****
        Supplier s1 = new Supplier(1, "Star", "fake st", "7979898798");
        em.persist(s1);
        
        Product p1 = new Product(1, "shoes", 23.99, "a1");
        p1.addSupplier(s1);
        //*****Supplier - Product*****
        
        
        
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        

    }

}
