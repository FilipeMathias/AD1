import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private int quantidadeProdutores;
    private List<String[]> participantes;
    private List<String[]> produtores;

    public Equipe(int quantidadeProdutores, List<String[]> participantes) {
        this.quantidadeProdutores = quantidadeProdutores;
        this.participantes = participantes;
        this.produtores = new ArrayList<>();
    }

    public List<String[]> adicionarProdutores() {
        String equipe;

        for (int i = 0; i < participantes.size() - 1 && quantidadeProdutores > 0; i++) {
            String[] linha = participantes.get(i);
            String[] linha2 = participantes.get(i + 1);

            for (int j = 0; j < linha.length - 1; j++) { // -1 evita estourar no j+1
                if (linha[j].equals(linha2[j])) {
                    equipe = linha[j + 1] + " & " + linha2[j + 1];
                    produtores.add(new String[]{linha[j], equipe});
                    quantidadeProdutores--;
                }
            }
        }
        return produtores;
    }
}
