// ============================================================
// CONCRETE DECORATOR — Leite
// Adiciona leite ao café, alterando descrição e custo
// ============================================================
public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", Leite";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.50;
    }
}
