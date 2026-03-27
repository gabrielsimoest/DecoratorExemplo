// ============================================================
// CONCRETE DECORATOR — Chocolate
// Adiciona chocolate ao café, alterando descrição e custo
// ============================================================
public class Chocolate extends CafeDecorator {

    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", Chocolate";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.75;
    }
}
