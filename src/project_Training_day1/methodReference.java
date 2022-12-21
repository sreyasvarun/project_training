package project_Training_day1;



interface reference{  
    void refer();  
}  
public class methodReference {  
    public static void saySomething(){  
        System.out.println("Hello,this is method reference.");  
    }  
    public static void main(String[] args) {  
       
    	reference newreference = methodReference::saySomething;  
         
    	newreference.refer();  
    }  
}  



