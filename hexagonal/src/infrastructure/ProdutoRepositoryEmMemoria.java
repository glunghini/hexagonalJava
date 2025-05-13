package infrastructure;

import java.util.HashMap;
import java.util.Map;
import domain.Produto;
import domain.ProdutoRepository;

public class ProdutoRepositoryEmMemoria implements ProdutoRepository {
    private Map<String, Produto> bancoDeDados = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        bancoDeDados.put(produto.getCodigo(), produto);
    }

    @Override
    public Produto buscarPorCodigo(String codigo) {
        return bancoDeDados.get(codigo);
    }
}
