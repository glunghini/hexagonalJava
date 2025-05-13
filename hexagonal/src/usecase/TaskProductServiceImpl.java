package usecase;

import domain.Produto;
import domain.ProdutoRepository;

public class TaskProductServiceImpl implements TaskProductService {
    private ProdutoRepository produtoRepository;

    public TaskProductServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void cadastrarProduto(String nome, double preco, String codigo) {
        Produto produto = new Produto(nome, preco, codigo);
        produtoRepository.salvar(produto);
    }

    @Override
    public void alterarPreco(String codigo, double novoPreco) {
        Produto produto = produtoRepository.buscarPorCodigo(codigo);
        if (produto != null) {
            produto.setPreco(novoPreco);
            produtoRepository.salvar(produto);
        }else {
            throw new IllegalArgumentException("Produto não encontrado");
        }
    }
}

