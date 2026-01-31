package br.com.hello.controller;

import br.com.hello.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod = new Produto();
        prod.setDescricao("Produto recuperado");
        prod.setId(1234);
        prod.setPreco(123.45);
        return prod;

    }

    @PostMapping("/novoproduto")
    public String cadastrarProduto(@RequestBody Produto prod) {
        System.out.println(prod.getId()+prod.getDescricao()+prod.getPreco());
        return "Produto cadastrado com sucesso";
    }
}

