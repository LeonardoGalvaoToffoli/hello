package br.com.hello.controller;

import br.com.hello.model.Produto;
import br.com.hello.services.IProdutoService;
import br.com.hello.services.ProdutoSeriveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    IProdutoService ips;

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod = new Produto();
        prod.setDescricao("Gabinete");
        prod.setId(1234);
        prod.setPreco(1000);
        prod = ips.aplicarDesconto(prod, 10);

        return prod;

    }

    @PostMapping("/novoproduto")
    public String cadastrarProduto(@RequestBody Produto prod) {
        System.out.println(prod.getId()+prod.getDescricao()+prod.getPreco());
        return "Produto cadastrado com sucesso";
    }
}

