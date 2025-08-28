import java.lang.String;
import java.util.*;

public class ProdutorFilme {
    private Filme filme;
    private Produtor produtor;
    private List<String> participacoes;

    public ProdutorFilme(Filme filme, Produtor produtor) {
        this.filme = filme;
        this.produtor = produtor;

        this.participacoes = new ArrayList<>();
        participacoes.add(filme.getTitulo());
        participacoes.add(produtor.getNome());
    }

    // agora retorna um vetor de Strings
    public String[] getParticipacoes() {
        return participacoes.toArray(new String[0]);
    }

    @Override
    public String toString() {
        return "Concorrente: " + participacoes;
    }
}
