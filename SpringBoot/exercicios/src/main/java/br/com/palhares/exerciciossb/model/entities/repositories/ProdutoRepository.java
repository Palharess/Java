package br.com.palhares.exerciciossb.model.entities.repositories;

import br.com.palhares.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
    public Iterable<Produto> findByNomeContaining(String parteNome);
}
