import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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




        System.out.println("Deseja gerar relatório por:");
        System.out.println("1 - Filme");
        System.out.println("2 - Equipe");
        int escolha = Integer.parseInt(scanner.nextLine());

        if (escolha == 1) {
            // Relatório por filme
            Relatorio relatorio1 = new Relatorio(filme1, resultados);
            CalculadoraPontuacao calculadoraPontuacao1 = new CalculadoraPontuacao(relatorio1.gerar(),
                    premio1, premio2, premio3);

            System.out.println("\n=== RELATÓRIO POR FILME 1 ===");
            for (String[] linha : relatorio1.gerar()) {
                for (String item : linha) {
                    System.out.print(item + " / ");
                }
                System.out.println();
            }

            calculadoraPontuacao1.calcular();
            System.out.println(calculadoraPontuacao1.toString());

            Relatorio relatorio2 = new Relatorio(filme2, resultados);
            CalculadoraPontuacao calculadoraPontuacao2 = new CalculadoraPontuacao(relatorio2.gerar(),
                    premio1, premio2, premio3);

            System.out.println("\n=== RELATÓRIO POR FILME 2 ===");
            for (String[] linha : relatorio2.gerar()) {
                for (String item : linha) {
                    System.out.print(item + " / ");
                }
                System.out.println();
            }

            calculadoraPontuacao2.calcular();
            System.out.println(calculadoraPontuacao2.toString());

            Relatorio relatorio3 = new Relatorio(filme3, resultados);
            CalculadoraPontuacao calculadoraPontuacao3 = new CalculadoraPontuacao(relatorio3.gerar(),
                    premio1, premio2, premio3);

            System.out.println("\n=== RELATÓRIO POR FILME 3 ===");
            for (String[] linha : relatorio3.gerar()) {
                for (String item : linha) {
                    System.out.print(item + " / ");
                }
                System.out.println();
            }

            calculadoraPontuacao3.calcular();
            System.out.println(calculadoraPontuacao3.toString());

        } else {
            // Relatório por equipe
            Relatorio relatorioEquipe = new Relatorio(filme3, resultados);
            CalculadoraPontuacao calculadoraPontuacaoEquipe = new CalculadoraPontuacao(relatorioEquipe.gerar(),
                    premio1, premio2, premio3);
            TipoParticipante tipoParticipanteEquipe = new TipoParticipante(
                    relatorioEquipe.gerar(), equipe.criarEquipe(), "equipe"
            );

            System.out.println("\n=== RELATÓRIO POR EQUIPE ===");
            for (String[] linha : tipoParticipanteEquipe.escolher()) {
                for (String item : linha) {
                    System.out.print(item + " / ");
                }
                System.out.println();
            }
            calculadoraPontuacaoEquipe.calcular();
            System.out.println(calculadoraPontuacaoEquipe.toString());


        }
    }
}