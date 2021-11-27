package td8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exo5 <E>{

	public static <E> void echange(List<? super E> list, int a, int b) {
		//Collections.swap(list, a, b);
		E temp = (E) list.get(a);
		list.set(a, (E) list.get(b));
		list.set(b, temp);
	}
	
	public static void melange(List<?> list) {
		//Collections.shuffle(list);
		int i;
		for(i=0; i<list.size(); i++) {
			Collections.swap(list, (int) (Math.random() * (list.size())), (int) (Math.random() * (list.size())));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("foo", "toto", "test");
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		echange(l, 0, 2);
		echange(l1, 2, 7);
		System.out.println(l);
		System.out.println(l1);
		melange(l);
		melange(l1);
		System.out.println(l);
		System.out.println(l1);
	}

}
