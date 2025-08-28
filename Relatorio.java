import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private Filme filme;
    private List<String[]> resultados;
    private List<String[]> relatorio;

    public Relatorio(Filme filme, List<String[]> resultados) {
        this.filme = filme;
        this.resultados = resultados;
        this.relatorio = new ArrayList<>();
    }

    public List<String[]> gerar(){
        relatorio.clear();
        for (String[] linha : resultados) {

            if(filme.getTitulo().equals(linha[0])){
                relatorio.add(linha);
            }



        }
        return relatorio;
    }
}
