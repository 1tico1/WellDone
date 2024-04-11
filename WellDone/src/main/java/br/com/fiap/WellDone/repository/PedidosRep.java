package br.com.fiap.WellDone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.WellDone.model.Pedidos;

@Repository
public interface PedidosRep extends JpaRepository<Pedidos, Long> {

	List<Pedidos> findAll();
	Pedidos findById(long id);
    void deleteById(long id);
}
