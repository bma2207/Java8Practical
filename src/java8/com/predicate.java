package java8.com;

import java.util.function.Predicate;

import java.util.*;;

public class predicate {

	public static void main(String [] arr)
	{
	     
	     ArrayList<Employ> l=new  ArrayList<Employ>();
	     l.add(new Employ (1000));
	     l.add(new Employ (2000));
	     l.add(new Employ (3000));
	     l.add(new Employ (4000));
	     
	     Predicate<Employ> p= e ->e.salary>2000;
	     for(Employ e1 : l)
	     {
	    	 if(p.test(e1))
	    	 {
	    		 System.out.println(e1.salary);
	    	 }
	     }
	     
	     
	}
}
