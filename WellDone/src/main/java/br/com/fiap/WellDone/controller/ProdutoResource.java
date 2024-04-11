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

import br.com.fiap.WellDone.model.Produto;
import br.com.fiap.WellDone.repository.ProdutoRep;



@RestController
@RequestMapping(value = "/well")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRep produtoRepository;
	
	@GetMapping(value = "/produtos")
	public List<Produto> findAll(){
		return produtoRepository.findAll();
		}
	
	@GetMapping(value = "/produtos/{id}")
	public Produto findById(@PathVariable Long id) {
		return produtoRepository.findById(id).get();
	}
	@PostMapping("/salvarP")
    public Produto save(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    
    @DeleteMapping("/produtod/{id_produto}")
    public void delete(@PathVariable Long id_produto) {
    	produtoRepository.deleteById(id_produto);
    }
    @PutMapping("/produto/{id_produto}")
    public Produto update(@PathVariable Long id_produto, @RequestBody Produto produtoAtualizado) {
        return produtoRepository.findById(id_produto)
            .map(produto -> {
                produto.setNm_prod(produtoAtualizado.getNm_prod());
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setPreco(produtoAtualizado.getPreco());
                produto.setQtd_estoque(produtoAtualizado.getQtd_estoque());
                produto.setCategoria(produtoAtualizado.getCategoria());
                produto.setMarca(produtoAtualizado.getMarca());
                return produtoRepository.save(produto);
            })
            .orElse(null);
    }
}


