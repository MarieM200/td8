package td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo3<T> {
	
	public static List listLength(List list) {
		ArrayList length = new ArrayList();
		for(int i=0; i<list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static <T> List listLength2(List<T> list) {
		ArrayList length = new ArrayList();
		for(int i=0; i<list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static List listLength3(List<? extends CharSequence> list) {
		ArrayList length = new ArrayList();
		for(int i=0; i<list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static void main(String[] args) {
		List l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		System.out.println(listLength2(l));
		System.out.println(listLength3(l));
	}

}
