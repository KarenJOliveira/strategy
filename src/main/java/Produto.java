public class Produto {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void calcularTaxaPix(float valor)
    {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(valor);
        this.valor = processadorPagamento.calcularTaxa(new PagamentoPix());
    }

    public void calcularTaxaCartaoCredito(float valor)
    {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(valor);
        this.valor = processadorPagamento.calcularTaxa(new PagamentoCartaoCredito());
    }

    public void calcularTaxaCartaoDebito(float valor)
    {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(valor);
        this.valor = processadorPagamento.calcularTaxa(new PagamentoCartaoDebito());
    }
}
