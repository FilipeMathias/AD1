import java.util.List;
import java.util.Map;

public class Filme {
    private String titulo;
    private String genero;
    private String premio;  // Lista de dicionários

    public Filme(String titulo, String genero, String premio) {
        this.titulo = titulo;
        this.genero = genero;
        this.premio = premio;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }


}
