// ============================================================
// DECORATOR (Classe Abstrata)
// Envolve um Cafe e delega as chamadas ao componente interno.
// Subclasses irão estender este comportamento.
// ============================================================
public abstract class CafeDecorator implements Cafe {

    // Referência ao componente que está sendo decorado
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    // Delega a chamada ao componente interno
    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    // Delega a chamada ao componente interno
    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}
