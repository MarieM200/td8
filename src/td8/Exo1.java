package td8;

public class Exo1<T> {
	public static <T> Comparable myMax(Comparable<T>... args){
		//genere tout seul une erreur s'il n'y a aucun argument
		Comparable max = args[0];
		for(Comparable v: args) {
			if(v.compareTo(max)>0) {
				max = v;
			}
		}
		return max;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println(myMax(42, 1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("Denis", "Cornaz")); //Denis
		//System.out.println(myMax(8.6, "Denis")); //ne doit pas compiler !
		//System.out.println(myMax());
	}
}
