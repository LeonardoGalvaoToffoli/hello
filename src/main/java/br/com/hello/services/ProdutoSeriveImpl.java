package br.com.hello.services;

import br.com.hello.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoSeriveImpl implements IProdutoService{

    @Override
    public Produto aplicarDesconto(Produto prod, double percentualDesconto) {
        double novoPreco = prod.getPreco() - prod.getPreco() * percentualDesconto /100;
        prod.setPreco(novoPreco);
        return prod;
    }
}
