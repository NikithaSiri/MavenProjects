package cg;

class SubAlpha {

static {

System.out.println("First Static block.");
}


public static void main(String arg[])

{ task(); 
}

static {

System.out.println("Second Static block.");

}

public static void task(){ 
	System.out.println("Task Completed."); }

}