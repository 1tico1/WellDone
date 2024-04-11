
package br.com.fiap.WellDone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pagamento;    
    private String metodo_pag;
    private Double vlr_total;
    private Long id_prod; 
    private Long id_cliente;
    
    public Pagamento() {}

    public Pagamento(Long id_pagamento, String metodo_pag, Double vlr_total, Long id_prod, Long id_cliente) {
        this.id_pagamento = id_pagamento;
        this.metodo_pag = metodo_pag;
        this.vlr_total = vlr_total;
        this.id_prod = id_prod;
        this.id_cliente = id_cliente;
    }

    public Long getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Long id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public String getMetodo_pag() {
        return metodo_pag;
    }

    public void setMetodo_pag(String metodo_pag) {
        this.metodo_pag = metodo_pag;
    }

    public Double getVlr_total() {
        return vlr_total;
    }

    public void setVlr_total(Double vlr_total) {
        this.vlr_total = vlr_total;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
}
