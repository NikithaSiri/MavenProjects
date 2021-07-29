package com.lti.sorting;

import java.util.Comparator;

public class EmpSortBySal implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getEmpSal()>e2.getEmpSal())
		{
			return 1;
		}
		return -1;
	}
	

	
}
