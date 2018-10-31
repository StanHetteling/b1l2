import java.util.Scanner;

public class b1l2 {

    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);

        String naam;
        System.out.print("Wat is je naam: ");
        naam = user_input.next();

        String leeftijd;
        System.out.print("Wat is je leeftijd: ");
        leeftijd = user_input.next();

        String ogen;
        System.out.print("Welke kleur zijn je ogen: ");
        ogen = user_input.next();

        String post;
        System.out.print("Wat is je postcode: ");
        post = user_input.next();

        String woon;
        System.out.print("Wat is je woonplaats: ");
        woon = user_input.next();

        System.out.println("Hallo " + naam + " .Ik zie dat je " + leeftijd + " jaar oud bent. Ik zie ook dat je ogen " + ogen + " zijn. je postcode weet ik ook dat is " + post + " en dat is in de woonplaats " + woon + ".sta" );
    }




}
