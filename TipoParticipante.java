import java.util.ArrayList;
import java.util.List;

public class TipoParticipante {
    private List<String[]> relatorio;
    private List<String[]> equipe;
    private String tipo;
    private List<String[]> relatorioAlterado;

    public TipoParticipante(List<String[]> relatorio, List<String[]> equipe, String tipo) {
        this.relatorio = relatorio;
        this.equipe = equipe;
        this.tipo = tipo;
        this.relatorioAlterado = new ArrayList<>();
    }

    public List<String[]> escolher() {
        if (tipo.equals("individual")) {
            // Retorna o relatório original
            return relatorio;
        }

        if (tipo.equals("equipe")) {
            // Substitui o primeiro item de cada linha
            for (String[] linha : relatorio) {
                if( linha[0].equals(equipe.get(0)[0])){
                    relatorioAlterado.add(new String[]{equipe.get(0)[1],linha[1],linha[2],linha[3],linha[4]});
                }
                else{
                    return new ArrayList<>();
                }



            }
            return relatorioAlterado;
        }

        // Caso o tipo não seja "i" nem "c", retorna lista vazia
        return new ArrayList<>();
    }
}
