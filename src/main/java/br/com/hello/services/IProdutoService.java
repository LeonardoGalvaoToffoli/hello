package br.com.hello.services;

import br.com.hello.model.Produto;

public interface IProdutoService {

    public Produto aplicarDesconto(Produto prod, double percentualDesconto);
}
