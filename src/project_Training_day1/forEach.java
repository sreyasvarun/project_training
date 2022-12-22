package project_Training_day1;

import java.util.ArrayList;  
import java.util.List;  
public class forEach {  
    public static void main(String[] args) {  
        List<String> games = new ArrayList<String>();  
        games.add("Football");  
        games.add("Cricket");  
        games.add("Chess"); 
        games.add("Badminton");
        games.add("Hockey");  
        System.out.println("------------Iterating by passing lambda expression--------------");  
        games.forEach(game -> System.out.println(game));  
          
    }  
}  
