/*Criteria API -alternative way for building dynamic queries,  based on Java objects that represent query elements (replacing string based JPQL).
It is the alternative way of defining a JPQL query. These queries are type-safe, and portable and easy to modify by changing the syntax. 
The major advantage of the criteria API is that errors can be detected earlier during compile time.
 String based JPQL queries and JPA criteria based queries are same in performance and efficiency.
The criteria API is included into all versions of JPA
*/

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.lti.entity.Employee;

public class TestCriteriaQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("Criteria Query Example");
		//1
		/*CriteriaBuilder cb= em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> e = cq.from(Employee.class);  //"SELECT e FROM Employee e"
		CriteriaQuery<Employee> myqry=cq.select(e); 
		
		TypedQuery<Employee> q=em.createQuery(myqry);
		List<Employee> list = q.getResultList();
		System.out.println(list);*/
		
		//2
		/*CriteriaBuilder cb = em.getCriteriaBuilder();		 
        // Making The Query Object From The 'CriteriaBuilder' Instance
        CriteriaQuery<Object> cq = cb.createQuery();
        Root<Employee> from = cq.from(Employee.class);
         // Step #1 - Displaying All Records
        System.out.println("\n! Display All Records For The 'Employee' Table !\n");
        CriteriaQuery<Object> selectQuery = cq.select(from);
        TypedQuery<Object> typedQuery = em.createQuery(selectQuery);
        List<Object> employeeList = typedQuery.getResultList();
 
        if(employeeList != null && employeeList.size() > 0) {
            for(Object obj : employeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        }*/
		
		//3
		CriteriaBuilder cb = em.getCriteriaBuilder();		
		CriteriaQuery<Object> queryObj = cb.createQuery();
	    Root<Employee> e = queryObj.from(Employee.class); // "FROM EMPLOYEE e"
		System.out.println("\n! Displaying All Records For The 'Employee' Table In An Asc. Order !\n");
       
		CriteriaQuery<Object> ascSelectQuery = queryObj.select(e);  //"SELECT e FROM EMPLOYEE e"   
		
        ascSelectQuery.orderBy(cb.asc(e.get("ename")));//"SELECT e FROM EMPLOYEE e ORDER BY e.ename ASC"  
        
        
        TypedQuery<Object> ascTypedQuery = em.createQuery(ascSelectQuery);
        List<Object> ascEmployeeList = ascTypedQuery.getResultList();
 
        if(ascEmployeeList != null && ascEmployeeList.size() > 0) {
            for(Object obj : ascEmployeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        }
		
		
		
		em.getTransaction().commit();
		em.close();
		em.getEntityManagerFactory().close();
	}
}
