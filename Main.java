import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Object> relatorio = new ArrayList<>();

        Filme filme1 = new Filme("Poderoso Chefão", "Drama", '');
        Filme filme2 = new Filme("Gladiador","Ação",3);
        Filme filme3 = new Filme("Onde Os Fracos Não Tém Vez", "Drama", 3);

        Produtor produtor1 = new Produtor("Fracis Ford Coppola", 86, "italo-americano");
        Produtor produtor2 = new Produtor("Ridley Scot", 87, "britânico");
        Produtor produtor3 = new Produtor("Joel Coen", 70, "americano");
        Produtor produtor4 = new Produtor("Ethan Coen", 67, "americano");

        Cerimonia cerimonia1 = new Cerimonia("BAFTA", 01/01/2025,"individual", 3);
        Cerimonia cerimonia2 = new Cerimonia("GLOBO DE OURO", 01/01/2025,"coletivo", 3);
        Cerimonia cerimonia3 = new Cerimonia("OSCAR", 01/01/2025,"individual", 3);







        relatorio.add(categoria.getNome(), cerimonia.getNome(), filme.getTitulo(), filme.getPremios());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




    }
}