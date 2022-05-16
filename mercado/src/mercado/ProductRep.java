package mercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRep {
	private HashMap<String, Product> produtos = new HashMap<>();
	
	public String addProduto(Product p) {
		produtos.put(p.getId(), p);
		return p.getId();
	}
	
	public void editarProduto(Product newProduct) {
		addProduto(newProduct);
	}
	
	public Product removeProduto(String pId) {
		Product product = produtos.get(pId);
		produtos.remove(pId);
		return product;
	}
	
	public Product recuperarProduto(String pId) {
		return produtos.get(pId);
	}
	
	
	
	public List<Product> getProductByName(String nome) {
		List<Product> listaProdutos = new ArrayList<Product>();
		
		for(Product p: produtos.values()) {
			if(p.getName().contains(nome)) {
				listaProdutos.add(p);
			}
		}
		return listaProdutos;
	}

}