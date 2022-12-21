package project_Training_day1;
@FunctionalInterface 
interface drawable{
	public void draw();
}

public class lambdaExp {
	public static void main(String [] args) {
	 String name="circle";
		drawable d2=()->{  
            System.out.println("Drawing "+name);  
        };  
        d2.draw();  
	}

}
