package domain;

public interface ProdutoRepository {
    void salvar(Produto produto);
    Produto buscarPorCodigo(String codigo);
}
