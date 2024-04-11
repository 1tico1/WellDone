package br.com.fiap.WellDone.controller;
import static org.springframework.http.HttpStatus.CREATED;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.WellDone.model.Cliente;
import br.com.fiap.WellDone.repository.ClienteRep;


@RestController
@RequestMapping(value = "/well")
public class ClienteResource {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ClienteResource.class);

	@Autowired
    private ClienteRep clienteRepository;

    @GetMapping(value = "/clientes")
    public List<Cliente> findAll() {
    	logger.info("Iniciando a busca por todos os clientes");
        List<Cliente> clientes = clienteRepository.findAll();
        logger.info("Clientes encontrados: {}", clientes.size());
        return clienteRepository.findAll();
    }

    @GetMapping(value = "/clientes/{id_cliente}")
    public Cliente findById(@PathVariable Long id_cliente) {
        return clienteRepository.findById(id_cliente).orElse(null);
    }
    @ResponseStatus(CREATED)
    @PostMapping("/salvarC")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    @DeleteMapping("/cliented/{id_cliente}")
    public void delete(@PathVariable Long id_cliente) {
        clienteRepository.deleteById(id_cliente);
    }
    @PutMapping("/cliente/{id_cliente}")
    public Cliente update(@PathVariable Long id_cliente, @RequestBody Cliente clienteAtualizado) {
        return clienteRepository.findById(id_cliente)
            .map(cliente -> {
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setEndereco(clienteAtualizado.getEndereco());
                cliente.setNr_telefone(clienteAtualizado.getNr_telefone());
                cliente.setEmail(clienteAtualizado.getEmail());
                return clienteRepository.save(cliente);
            })
            .orElse(null); // ou lançar uma exceção, dependendo do comportamento desejado
    }
}

