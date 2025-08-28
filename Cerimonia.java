import java.time.LocalDate;
import java.util.List;

public class Cerimonia {
    private String nome;
    private LocalDate data;


    public Cerimonia(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;

    }

    public String getNome() {
        return nome;
    }



}
