import usecase.TaskProductService;
import usecase.TaskProductServiceImpl;
import domain.ProdutoRepository;
import infrastructure.ProdutoRepositoryEmMemoria;
import domain.Produto;
import usecase.TaskProductService;
import usecase.TaskProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Cria o repositório em memória
        ProdutoRepository produtoRepository = new ProdutoRepositoryEmMemoria();

        // Cria o serviço de gerenciamento de produtos
        TaskProductService gerenciamentoProdutoService = new TaskProductServiceImpl(produtoRepository);


        gerenciamentoProdutoService.cadastrarProduto("Produto 1", 100.0, "001");

        // Alterar o preço de um produto
        gerenciamentoProdutoService.alterarPreco("001", 120.0);

        // Verifica se o produto foi alterado
        Produto produto = produtoRepository.buscarPorCodigo("001");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}
