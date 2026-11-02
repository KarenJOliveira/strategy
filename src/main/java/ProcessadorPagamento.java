public class ProcessadorPagamento {
    float valor;

    public ProcessadorPagamento(float valor)
    {
        this.valor = valor;
    }

    public float calcularTaxa(Pagamento pagamento)
    {
        return pagamento.calcularTaxa(this.valor);
    }
}
