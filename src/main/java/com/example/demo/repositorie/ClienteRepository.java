package com.example.demo.repositorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Cliente findByCpf(String cpf);
	List<Cliente> findByEnderecoCep(String cep);
	
	@Query("SELECT c FROM Cliente c WHERE c.cpf = ?1")
	Cliente findClienteByCpf(String cpf);
}
