package td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exo4 <T>{

	public static <T> List<T> fusion(List<?> l1, List<?> l2) throws ErrExo4{
		if(l1.size() != l2.size()) throw new ErrExo4("Les listes doivent etre de la meme taille");
		if(l1 == null) return (List<T>) l2;
		if(l2 == null) return (List<T>) l1;
		ArrayList<Object> l3 = new ArrayList<Object>();
		int i, j, a=0;
		for(i=0, j=0; i<l1.size() || j<l2.size();) {
			if(a==0) {
				l3.add(l1.get(i));
				i++;
				a = 1;
			}
			else if(a==1) {
				l3.add(l2.get(j));
				j++;
				a = 0;
			}
		}
		return (List<T>) l3;
	}
	
	public static void main(String[] args) throws ErrExo4 {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("C", "rc");
		List<StringBuilder> l2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1 = fusion(l1, l2);
		List<?> r2 = fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
		LinkedList<String> l5 = new LinkedList<String>();
		l5.add("cc");
		l5.add("hello");
		List<?> r5 = fusion(l1,l5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}
