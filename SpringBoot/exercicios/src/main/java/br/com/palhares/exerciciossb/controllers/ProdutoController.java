package br.com.palhares.exerciciossb.controllers;

import br.com.palhares.exerciciossb.model.entities.Produto;
import br.com.palhares.exerciciossb.model.entities.repositories.CrudeRepository;
import br.com.palhares.exerciciossb.model.entities.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private CrudeRepository crudeRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto p){
        crudeRepository.save(p);
        return p;

    }
    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return crudeRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContaining(parteNome);
    }

    @GetMapping(path = "/pagina/{n}")
    public Iterable<Produto> obterProdutosPorPaginas(@PathVariable int n){
        Pageable page = PageRequest.of(n,3);
        return produtoRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return crudeRepository.findById(id);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto p){
        crudeRepository.save(p);
        return p;
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id){
        crudeRepository.deleteById(id);
    }
}
