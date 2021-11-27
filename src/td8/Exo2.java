package td8;

import java.util.Arrays;
import java.util.List;

public class Exo2{
	
	private static void print(List<? extends Object> list) {
		for(Object o:list)
			System.out.println(o);
	}
	
	private static void longueur(List<? extends CharSequence> list){
		for(Object o:list) {
			System.out.println(((CharSequence) o).length());
		}
	}
	
	/*@Override
	public int length() {
		// TODO Auto-generated method stub
		if(this.o instanceof String) return ((String) this.o).length();
		else {
			return 1;
		}
	}*/
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo", "toto");
		List<Integer> list1 = Arrays.asList(2, 3);
		print(list);
		print(list1);
		System.out.println("tailles objects list : ");
		longueur(list);
	}
}
