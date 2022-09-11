package tableperclassInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//CREATE EMPLOYEE
		Employee e=new Employee();
		e.setName("Mayuri");
	    e.setSalary(30000);
	    em.persist(e);

	  //CREATE EMPLOYEE
	  		Employee e1=new Employee();
	  		e1.setName("Ravina");
	  	    e1.setSalary(40000);
	  	    em.persist(e1);
	  	    
	  	    //create a manager
	  	    Manager m=new Manager();
	  	    m.setName("Saurabh");
	  	    m.setSalary(80000);
	  	    m.setDeptname("Information Technology");
	  	    em.persist(m);
	  	    
	  	    em.getTransaction().commit();
	  	    System.out.println("The data is added");
	  	    em.close();
	  	    factory.close();
	  	    
	}

}
