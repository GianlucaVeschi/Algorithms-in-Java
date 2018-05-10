import java.util.*;

public class Orario{

	// CAMPI
	private int h,m;
	private char separatore=':';
	private boolean formato24=true;

	// COSTRUTTORI
	public Orario(int h, int m){
		this.h = h;
		this.m = m;
	}
	public Orario (int h){
		this.h=h;
		this.m=00;
	}
	public Orario(){
		this.h=new GregorianCalendar().get(Calendar.HOUR_OF_DAY);
		this.m=new GregorianCalendar().get(Calendar.MINUTE);
	}

	// METODI
	public int getOre(){
		return h;
	}
	public int getMinuti(){
		return m;
	}
	public void setOre(int h){
		this.h=h;
	}
	public void setMinuti(int m){
		this.m=m;
	}
	public void setOreMinuti(int h, int m){
		this.h=h;
		this.m=m;
	}
	public boolean equals(Orario x){
		return (this.h==x.h && this.m==x.m) ? true : false;
	}
	public int compareTo(Orario x){
		return (this.h>x.h || (this.h==x.h && this.m>x.m)) ? -1 : (this.h<x.h || (this.h==x.h && this.m<x.m) ? 1 : 0);
	}
	public int quantoManca(Orario x){
		return (this.h*60 + this.m) - (x.h*60 + x.m);
	}
	public String toString() {

		if (formato24) {

			// FORMATO 24

			if ((h<10 && m<10))
				return ("0"+Integer.toString(h)+separatore+"0"+Integer.toString(m));
			else if (h<10)
				return ("0"+Integer.toString(h)+separatore+Integer.toString(m));
			else if (m<10)
				return (Integer.toString(h)+separatore+"0"+Integer.toString(m));
			else
				return (Integer.toString(h)+separatore+Integer.toString(m));

		} else {

			// FORMATO 12

			if (h<12) {
				if (h<10 && m<10)
					return ("0"+Integer.toString(h)+separatore+"0"+Integer.toString(m)+" AM");
				else if (h<10)
					return ("0"+Integer.toString(h)+separatore+Integer.toString(m)+" AM");
				else if (m<10)
					return (Integer.toString(h)+separatore+"0"+Integer.toString(m)+" AM");
				else
					return (Integer.toString(h)+separatore+Integer.toString(m)+" AM");
			} else {
				h-=12;
				if (h<10 && m<10)
					return ("0"+Integer.toString(h)+separatore+"0"+Integer.toString(m)+" AM");
				else if (h<10)
					return ("0"+Integer.toString(h)+separatore+Integer.toString(m)+" AM");
				else if (m<10)
					return (Integer.toString(h)+separatore+"0"+Integer.toString(m)+" AM");
				else
					return (Integer.toString(h)+separatore+Integer.toString(m)+" AM");
			}

		} // formato 12

	} // metodo
	public void setSeparatore(char separatore){
		this.separatore=separatore;
	}
	public void setFormato(boolean formato24){
		this.formato24 = formato24;
	}
}