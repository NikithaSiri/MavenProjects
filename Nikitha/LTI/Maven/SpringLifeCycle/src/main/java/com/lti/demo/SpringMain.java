package com.lti.demo;



	

	public class SpringMain {

		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
			// way 1 : see bean.xml

			System.out.println("\nSpring Context initialized");
			EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);
			System.out.println("Bean retrieved from Spring Context");
			System.out.println("Employee Name=" + service.getEmployee().getName());
			
			//way 2: using annotations
			
			MyEmployeeService myEmpService = ctx.getBean("myEmployeeService", MyEmployeeService.class);
			System.out.println("Bean retrieved from Spring Context");		
			System.out.println("Employee Name="+myEmpService.getEmployee().getName());
		}
	}