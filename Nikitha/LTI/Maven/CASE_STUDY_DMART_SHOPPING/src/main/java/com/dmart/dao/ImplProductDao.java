package com.dmart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dmart.dbutil.DBUtil;
import com.dmart.entity.Product;

public class ImplProductDao implements IProductDao {

	static List<Product> prdList = new ArrayList<>();
	private EntityManager em= DBUtil.getEntityManager();
	
	@Override
	public String addProduct(Product p) {
		
		/*EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();*/
		
		em= DBUtil.getEntityManager();
	    try {
	          em.getTransaction().begin();
	          em.persist(p);
	          em.getTransaction().commit();
	      }
	    catch (Exception ex) 
	    {
	        if(em.getTransaction() != null && em.getTransaction().isActive())        
	                    em.getTransaction().rollback();     
	        //transaction becomes inactive,             
	    }
	      finally
	      {
	          em.close();
	          //Transaction no longer exists 
	      }
	
	
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		return "Product Added";
	}
	
	@Override
	public List<Product> getAllProducts() {
		
		return prdList;
}
}
