package com.lti.user;
import com.lti.entity.Student;
import com.lti.course.Course;
import com.lti.service.Info;
import java.util.*;
public class UserApp {
	public static void main(String[] args) {
		//Student s1=new Student(101,"Jay",50000);
		
		Info info=new Info();
		//info.display(s1);
		
		Scanner sc=new Scanner(System.in);
		Student[] stuAry = new Student[1];
		Course[] courseAry=new Course[1];
		
		while(true)
		{
			System.out.println("1. Register as a Student" );
			System.out.println("2. Register a Course");
			System.out.println("3. Display a Student");
			System.out.println("4. Display Course");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int n=sc.nextInt();
		switch (n) {
			case 1:
				for(int i=0;i<1;i++)
			    {
					System.out.println("Enter student data");
					stuAry[i]=new Student();
					System.out.println("Enter your id");
					stuAry[i].setStuId(sc.nextInt());
					System.out.println("Enter your Name");
					stuAry[i].setStuName(sc.next());
					System.out.println("Enter your Fee");
					stuAry[i].setStuFees(sc.nextDouble());
					//stuAry[i]=new Student(sc.nextInt(),sc.Next(),sc.nextDouble());
			    }
				break;
			case 2:
				for(int i=0;i<1;i++)
			    {
					System.out.println("Enter Course data");
					System.out.println("Enter your id");
					int id=sc.nextInt();
					System.out.println("Enter your Name");
					String name=sc.next();
					System.out.println("Enter your Fee");
					double fee=sc.nextDouble();
					courseAry[i]=new Course(id,name,fee);
			    }
				break;
			case 3:
				
				info.display(stuAry);
				break;
			case 4:
				
				info.displayCourse(courseAry);
				break;
			case 5:
				System.exit(0);
				break;
		}
		
		//sc.close();
		}//info.display(stuAry);
	}

}
