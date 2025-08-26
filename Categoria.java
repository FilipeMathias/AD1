public abstract class Categoria {
    private String nome;
    private Filme filme;
    private Cerimonia cerimonia;

    public Categoria(String nome, Filme filme, Cerimonia cerimonia) {
        this.nome = nome;
        this.filme = filme;
        this.cerimonia = cerimonia;
    }

    public String getNome() {
        return nome;
    }

    public Filme getFilme() {
        return filme;
    }

    public Cerimonia getCerimonia() {
        return cerimonia;
    }

    public abstract String criarEquipe();
}
