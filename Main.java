import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<String[]> filmes = new ArrayList<>();
        List<String[]> resultados = new ArrayList<>();

        Filme filme1 = new Filme("Poderoso Chefão", "Drama");
        Filme filme2 = new Filme("Gladiador","Ação");
        Filme filme3 = new Filme("Onde Os Fracos Não Tém Vez", "Drama");

        Produtor produtor1 = new Produtor("Fracis Ford Coppola", 86, "italo-americano");
        Produtor produtor2 = new Produtor("Ridley Scot", 87, "britânico");
        Produtor produtor3 = new Produtor("Joel Coen", 70, "americano");
        Produtor produtor4 = new Produtor("Ethan Coen", 67, "americano");

        Categoria categoria1 = new Categoria("Melhor Direção", "individual");
        Categoria categoria2 = new Categoria("Melhor Direção", "equipe");

        Cerimonia cerimonia1 = new Cerimonia("Oscar", LocalDate.of(2025, 2,28));
        Cerimonia cerimonia2 = new Cerimonia("Globo de Ouro", LocalDate.of(2024, 10,05));

        Premio premio1 = new Premio("ouro", 10);
        Premio premio2 = new Premio("prata", 8);
        Premio premio3 = new Premio("bronze", 6);



        ProdutorFilme participante1 = new ProdutorFilme(filme1,produtor1 );
        filmes.add(participante1.getParticipacoes());

        ProdutorFilme participante2 = new ProdutorFilme(filme2,produtor2 );
        filmes.add(participante2.getParticipacoes());

        ProdutorFilme participante3 = new ProdutorFilme(filme3,produtor3 );
        filmes.add(participante3.getParticipacoes());

        ProdutorFilme participante4 = new ProdutorFilme(filme3,produtor4 );
        filmes.add(participante4.getParticipacoes());

        Equipe equipe = new Equipe(2,filmes);


        Resultado resultado1 = new Resultado(filme1, categoria1,cerimonia1,premio1);
        Resultado resultado2 = new Resultado(filme2, categoria1, cerimonia1,premio2);
        Resultado resultado3 = new Resultado(filme3,categoria2, cerimonia1, premio3);

        Resultado resultado4 = new Resultado(filme1, categoria1,cerimonia2,premio3);
        Resultado resultado5 = new Resultado(filme2, categoria1, cerimonia2,premio1);
        Resultado resultado6 = new Resultado(filme3,categoria2, cerimonia2, premio2);


        PlanilhaResultados planilhaResultados1 = new PlanilhaResultados(resultado1);
        resultados.addAll(planilhaResultados1.inserir());

        PlanilhaResultados planilhaResultados2 = new PlanilhaResultados(resultado2);
        resultados.addAll(planilhaResultados2.inserir());

        PlanilhaResultados planilhaResultados3 = new PlanilhaResultados(resultado3);
        resultados.addAll(planilhaResultados3.inserir());

        PlanilhaResultados planilhaResultados4 = new PlanilhaResultados(resultado4);
        resultados.addAll(planilhaResultados4.inserir());

        PlanilhaResultados planilhaResultados5 = new PlanilhaResultados(resultado5);
        resultados.addAll(planilhaResultados5.inserir());

        PlanilhaResultados planilhaResultados6 = new PlanilhaResultados(resultado6);
        resultados.addAll(planilhaResultados6.inserir());


        Relatorio relatorio = new Relatorio(filme3, resultados);

        CalculadoraPontuacao calculadoraPontuacao = new CalculadoraPontuacao(relatorio.gerar(), premio1, premio2, premio3);



        for (String[] linha : filmes) {
            for(String item: linha){
                System.out.print(item + " /");
            }
            System.out.println();

        }


        for (String[] linha : equipe.adicionarProdutores()) {
            for(String item: linha){
                System.out.print(item + " /");
            }
            System.out.println();

        }



        for (String[] linha : relatorio.gerar()) {
            for(String item: linha){
                System.out.print(item + " /");
            }
            System.out.println();


        }

        calculadoraPontuacao.calcular();
        System.out.print(calculadoraPontuacao.toString());




    }
}