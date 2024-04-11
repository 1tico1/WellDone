package br.com.fiap.WellDone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "pedido")
public class Pedidos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido; 
	private Integer qtd_pedido; 
	private String status_pedido;
	private Long id_cliente;
	private Long id_prod;
	
	public Pedidos() {}

	public Pedidos(Long id_pedido, Integer qtd_pedido, String status_pedido, Long id_cliente, Long id_prod) {
		this.id_pedido = id_pedido;
		this.qtd_pedido = qtd_pedido;
		this.status_pedido = status_pedido;
		this.id_cliente = id_cliente;
		this.id_prod = id_prod;
	}

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Integer getQtd_pedido() {
		return qtd_pedido;
	}

	public void setQtd_pedido(Integer qtd_pedido) {
		this.qtd_pedido = qtd_pedido;
	}

	public String getStatus_pedido() {
		return status_pedido;
	}

	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_prod() {
		return id_prod;
	}

	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}
}

