// ============================================================
// CONCRETE COMPONENT
// Implementação base do componente — o café puro, sem adicionais
// ============================================================
public class CafeSimples implements Cafe {

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getCusto() {
        return 2.00;
    }
}
