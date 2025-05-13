package usecase;

public interface TaskProductService {
    void cadastrarProduto(String nome, double preco, String codigo);
    void alterarPreco(String codigo, double novoPreco);
}
