package mercado;

public class Product {
    private String id;
    private String name;
    private String fabricante;

    public Product(String nome, String fabricante, String id) {
        this.id = id;
        this.name = nome;
        this.fabricante = fabricante;
    }

    public String toString(){
        return(name + ", fabricado por: " + fabricante + ", identificação: " + id );
    }

    public String getId() {

        return this.id;
    }

    public String getName() {

        return this.name;
    }

    public String getFabricante() {

        return this.fabricante;
    }
}
