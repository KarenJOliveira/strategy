public class PagamentoCartaoCredito implements Pagamento{

    public float calcularTaxa(float valor) {
        return valor * 1.05f;
    }
}
