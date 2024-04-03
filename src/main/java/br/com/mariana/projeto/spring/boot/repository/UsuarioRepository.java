 package br.com.mariana.projeto.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mariana.projeto.spring.boot.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
