public class PagamentoCartaoDebito implements Pagamento{

    public float calcularTaxa(float valor) {
        return valor * 1.01f;
    }
}
