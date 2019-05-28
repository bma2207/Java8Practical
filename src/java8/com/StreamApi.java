package java8.com;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Predicate;

public class StreamApi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp(1000, "Vicky"));
		al.add(new Emp(2000, "ricky"));
		al.add(new Emp(4000, "micky"));
		al.add(new Emp(6000, "ticky"));
		al.add(new Emp(500, "kicky"));
		al.add(new Emp(8000, "dicky"));

		class empSort implements Comparator<Emp> {

			@Override
			public int compare(Emp o1, Emp o2) {

				return (o1.salary > o2.salary) ? -1 : 1;
			}
		}
		class empMax implements Comparator<Emp> {

			@Override
			public int compare(Emp o1, Emp o2) {

				return (o1.salary > o2.salary) ? -1 :1;
			}
		}

		Stream<Emp> s = al.stream();
		// s.forEach(e -> System.out.println(e.name + ":" + e.salary));

		// System.out.println("============================================================================");
		Stream<Emp> s1 = al.parallelStream();
		// s1.forEach(e1->System.out.println(e1.name + ":" + e1.salary));

		// System.out.println("============================================================================");
		// Stream<Emp> f=s.filter(p -> p.salary >2000);
		// f.forEach(e2 -> System.out.println(e2.name + ":" + e2.salary));

		Stream<Emp> f = al.stream().filter(p -> p.salary > 2000);
		Stream<Emp> f1 = al.stream().filter(p1 -> p1.name.startsWith("V"));
		f1.forEach(p4 -> System.out.println(p4.name));
		f.forEach(p3 -> System.out.println(p3.name + ":" + p3.salary));

		List<String> result = al.stream().map(r -> r.name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Map" + result);

		List<Integer> resultof = al.stream().filter(r1 -> r1.salary > 1000).map(r2 -> r2.salary * 2)
				.collect(Collectors.toList());
		System.out.println("Map " + resultof);

		List<Integer> l = al.stream().filter(a -> a.salary > 0).map(a -> a.salary * 3).sorted()
				.collect(Collectors.toList());
		
		List<Emp> el=al.stream().sorted(new empSort()).collect(Collectors.toList());
		Comparator<Emp> com=Comparator.comparing(Emp :: getSalary);
		Emp MinSalary = al.stream().min(com).get();
		Emp MaxSalary =al.stream().max(com).get();
		System.err.println("Min salary " + MinSalary);
		System.err.println("Max salary " + MaxSalary);
		System.err.println("Sort by com" + el);
		System.out.println("Sort" + ":" + l);
		Predicate<Emp> p = sal -> (sal.salary > 2000);

		for (Emp e3 : al) {
			if (p.test(e3)) {
				System.out.println(e3.name + ":" + e3.salary);
			}
		}
	}
}
