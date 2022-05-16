package mercado;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	private ProductRep prodRep;
	private LoteRep loteRep;

	public List<Product> listarProdsLote(String nome) {
		List<Lote> lotes = loteRep.getAll();
		List<Product> prods = getProdsFromLotes(lotes);
		List<Product> prodsOk = getProdsByName(nome, prods);
		return prodsOk;
	}
	
	private List<Product> getProdsFromLotes(List<Lote> lotes){
		List<Product> prods = new ArrayList<Product>();
		for (Lote lote : lotes) {
			prods.add(lote.getProduct());
		}
		return prods;
	}

	private List<Product> getProdsByName(String nome,List<Product> prods) {
		List<Product> prodsOk = new ArrayList<Product>();
		for (Product prod : prods) {
			if (prod.getName().contains(nome)) {
				prodsOk.add(prod);
			}
		}
		return prodsOk;
	}
}
