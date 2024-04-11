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

import br.com.fiap.WellDone.model.Pedidos;
import br.com.fiap.WellDone.repository.PedidosRep;


@RestController
@RequestMapping(value = "/well")
public class PedidoResource {

	
	
	@Autowired
	private PedidosRep pedidoRepository;
	
	@GetMapping(value = "/pedidos")
	public List<Pedidos> findAll(){
		return pedidoRepository.findAll();
		}
	
	@GetMapping(value = "/pedidos/{id}")
	public Pedidos findById(@PathVariable Long id) {
		return pedidoRepository.findById(id).get();
	}
	@PostMapping("/salvarPd")
    public Pedidos save(@RequestBody Pedidos pedidos) {
        return pedidoRepository.save(pedidos);
    }
    
    @DeleteMapping("/pedidod/{id_pedidos}")
    public void delete(@PathVariable Long id_pedidos) {
    	pedidoRepository.deleteById(id_pedidos);
    }
    @PutMapping("/pedido/{id}")
    public Pedidos update(@PathVariable Long id, @RequestBody Pedidos pedidoAtualizado) {
        return pedidoRepository.findById(id)
            .map(pedido -> {
                pedido.setQtd_pedido(pedidoAtualizado.getQtd_pedido());
                pedido.setStatus_pedido(pedidoAtualizado.getStatus_pedido());
                pedido.setId_cliente(pedidoAtualizado.getId_cliente());
                pedido.setId_prod(pedidoAtualizado.getId_prod());
                return pedidoRepository.save(pedido);
            })
            .orElse(null); 
    }
}
