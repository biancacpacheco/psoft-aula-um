package mercado;

public class Lote {
    private String id;
    private Product product;
    private int quantity;

    public Lote(String id, Product produto, int quantidade) {
        this.id = id;
        this.product = product;
        this.quantity = quantidade;
    }

    public String toString(){
        return(product + ": " + id + "- " + quantity + " unidade(s) disponíveis");
    }

    public String getId() {
        return this.id;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantitiy() {
        return this.quantity;
    }
}
