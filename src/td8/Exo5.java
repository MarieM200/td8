package td8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
	
	//correction : convertir en tableau car la complexite sera O(n)
	
	public static <E> List<E> melange2(List<E> l) {
		E[] array =(E[]) l.toArray();
		E[] e = array;
		Random r = new Random();
		for(int i = l.size()-1; i>0; i--) {
			int j = r.nextInt(i);
			echange2(e, i, j);
		}
		return l = Arrays.asList(e);
	}
	
	public static <E> void echange2(E[] l, int i, int j) {
		E temp = l[i];
		l[i] = l[j];
		l[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l3 = Arrays.asList("foo", "toto", "test");
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		echange(l3, 0, 2);
		echange(l1, 2, 7);
		System.out.println(l3);
		System.out.println(l1);
		melange(l3);
		melange(l1);
		System.out.println(l3);
		System.out.println(l1);
		
		Object[] l2 = l1.toArray();
		List<Integer> l4 = melange2(l1);
		System.out.println(l4);
		echange2(l2, 0, 1);
	}

}
