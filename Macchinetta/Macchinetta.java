import java.util.*;

public class Macchinetta{
	
	// CAMPI
	private ArrayList<Prodotto> prodotti;

	// COSTRUTTORI
	public Macchinetta (ArrayList<Prodotto> prodotti){
		this.prodotti = prodotti;
	}

	// METODI
	public ArrayList<Prodotto> getProdotti(){
		return prodotti;
	}
	public void aggiungiProdotto(Prodotto prodotto){
		prodotti.add(prodotto);
	}
	public Merendina compraMerendina(int soldi){
		for (Prodotto prodotto : prodotti)
			if (prodotto instanceof Merendina && prodotto.getCosto()<=soldi) {
				Merendina merendina = (Merendina) prodotto;
				prodotti.remove(merendina);
				return merendina;
			}
		return null;
	}
	public Bevanda compraBevanda(int soldi, int volume){
		for (Prodotto prodotto : prodotti)
			if (prodotto instanceof Bevanda && prodotto.getCosto()<=soldi) {
				Bevanda bevanda = (Bevanda) prodotto;
				if (bevanda.getVolume()>=volume) {
					prodotti.remove(bevanda);
					return bevanda;
				}
			}
		return null;
	}

}