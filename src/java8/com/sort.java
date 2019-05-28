package java8.com;

import java.util.ArrayList;

import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<employ> al=new ArrayList<employ>();
		al.add(new employ ("cicky",801,1000));
		al.add(new employ ("aicky",708,4000));
		al.add(new employ ("bicky",928,3000));
		al.add(new employ ("dicky",114,2000));
		System.out.println(al);
		
		Collections.sort(al,(e1,e2)->(e1.eno < e2.eno)? -1 : (e1.eno >e2.eno) ? 1 : 0);
		System.out.println(al);
		
		Collections.sort(al,(s1,s2)->s1.name.compareTo(s2.name));
		System.out.println(al);
		
		Collections.sort(al,(sal1,sal2)->(sal1.salary > sal2.salary)? 1 : 0);
		
		System.out.println(al);
	}

}
