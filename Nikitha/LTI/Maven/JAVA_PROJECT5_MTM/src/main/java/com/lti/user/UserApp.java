package com.lti.user;

import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;
import com.lti.entity.Customer;
import com.lti.entity.Scheme;

public class UserApp {

	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		
		//1
		/*Customer cust1 = dao.getCustomerDetails(101);
		System.out.println(cust1);
		System.out.println(cust1.getCustId() + " : "+ cust1.getSchemes());*/
	//2
	Scheme scheme = dao.getSchemeDetails(1);
	System.out.println(scheme);
	System.out.println(scheme.getCustList());
		
	
		
	}
}
