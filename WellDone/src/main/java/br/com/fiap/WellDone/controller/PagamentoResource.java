package br.com.fiap.WellDone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.WellDone.model.Pagamento;
import br.com.fiap.WellDone.repository.PagamentoRep;
	

@RestController
@RequestMapping(value = "/well")
public class PagamentoResource {
	
			@Autowired
			private PagamentoRep pagamentoRepository;
			
			@GetMapping(value = "/pagamentos")
			public List<Pagamento> findAll(){
				return pagamentoRepository.findAll();
				}
			
			@GetMapping(value = "/pagamentos/{id}")
			public Pagamento findById(@PathVariable Long id) {
				return pagamentoRepository.findById(id).get();
			}
			@PostMapping("/salvarPm")
		    public Pagamento save(@RequestBody Pagamento pagamento) {
		        return pagamentoRepository.save(pagamento);
		    }
		    
		    @DeleteMapping("/pagamentod/{id_pagamento}")
		    public void delete(@PathVariable Long id_pagamento) {
		    	pagamentoRepository.deleteById(id_pagamento);
		    }
		
		    @PutMapping("/pagamento/{id}")
		    public Pagamento update(@PathVariable Long id, @RequestBody Pagamento pagamentoAtualizado) {
		        return pagamentoRepository.findById(id)
		            .map(pagamento -> {
		                pagamento.setMetodo_pag(pagamentoAtualizado.getMetodo_pag());
		                pagamento.setVlr_total(pagamentoAtualizado.getVlr_total());
		                pagamento.setId_prod(pagamentoAtualizado.getId_prod());
		                pagamento.setId_cliente(pagamentoAtualizado.getId_cliente());
		                return pagamentoRepository.save(pagamento);
		            })
		            .orElse(null); 
		    }

	}



