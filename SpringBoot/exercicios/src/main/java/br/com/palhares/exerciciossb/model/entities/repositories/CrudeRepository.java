package br.com.palhares.exerciciossb.model.entities.repositories;

import br.com.palhares.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface CrudeRepository extends CrudRepository <Produto, Integer> {

}
