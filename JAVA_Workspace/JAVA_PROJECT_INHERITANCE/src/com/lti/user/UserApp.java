package com.lti.user;

import com.lti.entity.IPerson;
import com.lti.entity.PermEmpImpl;
import com.lti.entity.TempEmpImpl;

public class UserApp {
	public static void main(String[] args) {
	
       PermEmpImpl pe= new PermEmpImpl(101,5000);
       pe.calc();
       System.out.println(pe);
       
     TempEmpImpl te=new TempEmpImpl(102,10,2000);
     te.calc();
     System.out.println("*********");
	
     //superclass
     
     IPerson ip= new PermEmpImpl();
     ip.calc();
     
     /*IPerson i;
     i=pe;
     i.calc();*/
	}

}
