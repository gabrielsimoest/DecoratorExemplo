// ============================================================
// MAIN — Demonstração do Padrão Decorator
// Cada decorador envolve o anterior, adicionando comportamento
// ============================================================
public class Main {

    public static void main(String[] args) {

        // --- Passo 1: Café puro (sem adicionais) ---
        Cafe cafe = new CafeSimples();
        exibir(cafe);

        // --- Passo 2: Café com Leite ---
        cafe = new Leite(cafe);
        exibir(cafe);

        // --- Passo 3: Café com Leite e Chocolate ---
        cafe = new Chocolate(cafe);
        exibir(cafe);

        // --- Passo 4: Café com Leite, Chocolate e mais Chocolate ---
        cafe = new Chocolate(cafe);
        exibir(cafe);
    }

    // Método auxiliar para exibir descrição e custo formatados
    static void exibir(Cafe cafe) {
        System.out.println("Pedido : " + cafe.getDescricao());
        System.out.printf("Custo  : R$ %.2f%n", cafe.getCusto());
        System.out.println("------------------------------------------");
    }
}
