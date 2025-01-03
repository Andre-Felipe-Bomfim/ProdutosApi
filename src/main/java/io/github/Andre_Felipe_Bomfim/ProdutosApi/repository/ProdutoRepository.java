package io.github.Andre_Felipe_Bomfim.ProdutosApi.repository;

import io.github.Andre_Felipe_Bomfim.ProdutosApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
