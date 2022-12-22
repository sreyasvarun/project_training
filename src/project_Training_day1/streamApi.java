package project_Training_day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamApi {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
