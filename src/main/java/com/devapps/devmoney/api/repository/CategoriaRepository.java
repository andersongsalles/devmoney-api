package com.devapps.devmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devapps.devmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
