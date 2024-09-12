package com.lanchenlayer.controllers;

import com.lanchenlayer.applications.ProdutoApplication;
import com.lanchenlayer.entities.Produto;
import com.lanchenlayer.facade.ProdutoFacade;
import com.lanchenlayer.repositories.ProdutoRepository;
import com.lanchenlayer.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;


@RestController
public class ProdutoController {
    private ProdutoFacade produtoFacade;
    public ProdutoController() {

    }

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
}
