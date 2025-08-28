import java.util.ArrayList;
import java.util.List;

public class PlanilhaResultados {
    private Resultado resultado;
    private List<String[]> resultados;

    public PlanilhaResultados(Resultado resultado) {
        this.resultado = resultado;
        this.resultados = new ArrayList<>();
        resultados.addAll(resultado.gerar());
    }

    public List<String[]> inserir(){
        return resultados; // retorna lista de linhas
    }
}

