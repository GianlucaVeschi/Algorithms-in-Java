public class MucchioBiglie{

	// CAMPI
	private int mucchio;
	private final int MIN = 10;
	private final int MAX = 100;

	// COSTRUTTORI
	public MucchioBiglie(int n){
		if (MIN <= n && n <= MAX)
			mucchio = n;
		else
			mucchio = ((MIN+MAX)/2);
	}

	// METODI
	public int getMucchio(){
		return mucchio;
	}
	public void prelevaBiglie(int k){
		if (k >= 1 && k <= mucchio/2)
			mucchio-=k;
		else {
			System.out.println("Estrazione non consentia: tolgo una biglia.");
			mucchio--;
		}
	}
	public String toString(){

		String asterischi="";

		for (int i=1; i<=mucchio; i++) {
			asterischi+="*";
			if (i%10==0)
				asterischi+="\n";
		}

		String newstring="n. biglie: "+mucchio+"\n"+asterischi;

		return newstring;
	}
	
}