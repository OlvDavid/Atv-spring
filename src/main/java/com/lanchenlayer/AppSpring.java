package com.lanchenlayer;

import com.lanchenlayer.controllers.ProdutoController;
import com.lanchenlayer.entities.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.lanchenlayer.Console.produtoFacade;


@RestController
public class AppSpring {
    ProdutoController produtoController = new ProdutoController();

    @GetMapping("/buscarProdutos")
    public ResponseEntity<ArrayList<Produto>> buscarTodos() {
        ArrayList<Produto> produtos = produtoFacade.buscarTodos();

        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/buscarProduto/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable int id) {
        Produto produto = produtoFacade.buscarPorId(id);

        return ResponseEntity.ok(produto);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppSpring.class, args);                                                                                                                                           
    }
}
