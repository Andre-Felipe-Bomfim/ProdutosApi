package io.github.Andre_Felipe_Bomfim.ProdutosApi.controller;

import io.github.Andre_Felipe_Bomfim.ProdutosApi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProdutoController {
    @PostMapping("/post-product")
    public void save(Produto produto){
        System.out.println("Produto recebido: " + produto);
    }
}
