import java.time.LocalDate;
import java.util.List;

public class Cerimonia {
    private String nome;
    private LocalDate data;
    private String tipo;
    private int participantes;

    public Cerimonia(String nome, LocalDate data, String tipo, int participantes) {
        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }


    public String getTipo() {
        return tipo;
    }

    public String premiar(Filme filme){
      return filme.setPremio();
    }
}
