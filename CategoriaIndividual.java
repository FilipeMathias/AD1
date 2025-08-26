import java.util.*;

public class CategoriaIndividual extends Categoria {
    private List<String> lista;

    public CategoriaIndividual(String nome, Filme filme, Cerimonia cerimonia, List<String> lista) {
        super(nome, filme, cerimonia);
        this.lista = lista;
    }

    @Override
    public String criarEquipe() {
        if (this.getCerimonia().getTipo().equals("individual")) {
            // Monta uma string com as informações
            String equipe = String.format(
                    "Categoria: %s | Cerimônia: %s | Filme: %s | Prêmios: %s",
                    this.getNome(),
                    this.getCerimonia().getNome(),
                    this.getFilme().getTitulo(),
                    this.getFilme().getPremio() // cuidado: isso é um Map
            );

            // Adiciona à lista
            lista.add(equipe);

            // Retorna a string criada
            return equipe;
        }

        // Caso a condição não seja satisfeita
        return null;
    }
}
