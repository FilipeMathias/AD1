import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private Filme filme;
    private Categoria categoria;
    private Cerimonia cerimonia;
    private Premio premio;
    private List<String[]> resultado;

    public Resultado(Filme filme, Categoria categoria, Cerimonia cerimonia, Premio premio) {
        this.filme = filme;
        this.categoria = categoria;
        this.cerimonia = cerimonia;
        this.premio = premio;
        this.resultado = new ArrayList<>(); // inicializa aqui
    }

    public List<String[]> gerar(){
        resultado.add(new String[]{
                filme.getTitulo(),
                categoria.getNome(),
                categoria.getTipo(),
                cerimonia.getNome(),
                premio.getNome()
        });
        return resultado;
    }
}
