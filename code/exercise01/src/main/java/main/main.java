package main;

import Helper.SortByAge;
import Helper.SortByLength;
import Helper.SortByVowel;
import Helper.SuperSplit;
import utils.Person;
import utils.ToPerson;

import java.util.Arrays;
import java.util.List;

import static br.ufal.ts.utils.Helper.printListPerson;
import static br.ufal.ts.utils.Helper.printListString;

public class main {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ailton Cruz dos Santos", "Alan Pedro da Silva", "Alcino Dall'Igna Júnior",
                "Alejandro César Frery Orgambide", "Almir Pereira Guimarães", "André Lage Freitas",
                "André Luiz Lins de Aquino", "Arturo Hernández Domínguez", "Aydano Pamponet Machado",
                "Baldoino Fonseca dos Santos Neto", "Bruno Almeida de Jesus", "Cid Cavalcanti de Albuquerque",
                "Davi Bibiano Brito", "Eliana Silva de Almeida", "Erick de Andrade Barboza", "Evandro de Barros Costa",
                "Fábio Cunha de Albuquerque", "Fábio José Coutinho da Silva", "Fábio Paraguaçu Duarte da Costa",
                "Henrique Pacca Loureiro Luna", "Heitor Judiss Savino", "Heitor Soares Ramos Filho",
                "Ícaro Bezerra Queiroz de Araújo", "Ig Ibert Bittencourt Santana Pinto", "João Raphael Souza Martins",
                "Leandro Dias da Silva", "Leandro Melo de Sales", "Leide Jane de Sá Araújo", "Leonardo Viana Pereira",
                "Lucas Benevides Viana de Amorim", "Luís Cláudius Coradine", "Marcelo Costa Oliveira",
                "Márcio de Medeiros Ribeiro", "Marcus de Melo Braga", "Olival de Gusmão Freitas Júnior",
                "Patrick Henrique da Silva Brito", "Petrúcio Antônio Medeiros Barros", "Rafael de Amorim Silva",
                "Ranilson Oscar Araújo Paiva", "Roberta Vilhena Vieira Lopes", "Rodrigo de Barros Paes",
                "Rodrigo José Sarmento Peixoto", "Willy Carvalho Tiengo", "Thiago D. Cordeiro",
                "Tiago Figueiredo Vieira", "Xu Yang");
        SortByLength sortByLength = new SortByLength();
        SortByVowel sortByVowel = new SortByVowel();
        List<String> sortedListByLength = sortByLength.get(nomes);
        List<String> sortedListByVowel = sortByVowel.get(nomes);
        SuperSplit superSplit = new SuperSplit();


        printListString(sortedListByLength);

        System.out.println(sortByLength.max(sortedListByLength));

        System.out.println(sortByLength.min(sortedListByLength));

        System.out.println(sortByVowel.max(sortedListByVowel));

        System.out.println(superSplit.get(nomes));

        ToPerson toPerson = new ToPerson();
        List<Person> people = toPerson.get(nomes);
        SortByAge sortByAge = new SortByAge();
        printListPerson(sortByAge.get(people));
    }

}
