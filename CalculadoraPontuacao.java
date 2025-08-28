import java.util.List;

public class CalculadoraPontuacao {
    private List<String[]>relatorio;
    private Premio premio1;
    private Premio premio2;
    private Premio premio3;
    private int pontuacao;

    public CalculadoraPontuacao(List<String[]> relatorio, Premio premio1, Premio premio2, Premio premio3) {
        this.relatorio = relatorio;
        this.premio1 = premio1;
        this.premio2 = premio2;
        this.premio3 = premio3;
        this.pontuacao = 0;
    }

    public void  calcular(){

        for (String[] linha : relatorio) {
            if(linha[4].equals(premio1.getNome())){
                pontuacao += premio1.getPontuacao();
            }
            if (linha[4].equals(premio2.getNome())) {
                pontuacao += premio2.getPontuacao();
            }
            if (linha[4].equals(premio3.getNome())) {
                pontuacao += premio3.getPontuacao();
            }



        }


    }

    @Override
    public String toString() {
        return "Total da pontuação do participante: " + pontuacao;
    }
}
