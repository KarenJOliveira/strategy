import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    @Test
    void deveFazerPagamentoPix()
    {
        Produto produto = new Produto();
        produto.calcularTaxaPix(100.0f);
        assertEquals(100.0f,produto.getValor());
    }

    @Test
    void deveFazerPagamentoCartaoDebito()
    {
        Produto produto = new Produto();
        produto.calcularTaxaCartaoDebito(100.0f);
        assertEquals(101.0f,produto.getValor());
    }

    @Test
    void deveFazerPagamentoCartaoCredito()
    {
        Produto produto = new Produto();
        produto.calcularTaxaCartaoCredito(100.0f);
        assertEquals(105.0f,produto.getValor(),0.01);
    }
}
