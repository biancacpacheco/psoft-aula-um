package mercado;

public class Main {
    public static void main(String[] args) {
        Product produto = new Product("Leite", "Parmalat", "10L");
        Lote lote = new Lote("produto", produto, 45);

        System.out.println(produto);
        System.out.println(lote);

    }
}
