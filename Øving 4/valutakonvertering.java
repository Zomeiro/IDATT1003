import java.util.Scanner;


class Valuta { //attributes: valutanavn, kurs
    private String valutanavn;
    private double kurs;

    Valuta(String valutanavn, double kurs){
        this.valutanavn = valutanavn;
        this.kurs = kurs;
    }

    double nokTilValuta(double nok){
        return nok/this.kurs;
    }
    double valutaTilNok(double val) {
        return val*this.kurs;
    }

    public String getNavn() {
        return this.valutanavn;
    }
}

public class valutakonvertering {
    static void konverter(Scanner sc, Valuta valuta) {
        System.out.println("1 : Konverter fra NOK\n2 : Konverter til NOK");
        int v = sc.nextInt();
        System.out.println("Skriv inn mengden som skal konverteres:");
        double mengde = sc.nextDouble();
        
        switch(v){ //Ville avrundet svaret til 2 desimaler, men Math.round() ser ut til å kun avrunde til næreste heltall.
            case 1:
                System.out.println("Det er "+valuta.nokTilValuta(mengde)+" "+valuta.getNavn() + " i "+mengde+"kr!" );
            break;
            
            case 2:
                System.out.println("Det er "+mengde+" "+ valuta.getNavn() +" i "+valuta.valutaTilNok(mengde)+"kr!");
            break;

            default:
                System.out.println("Ugyldig verdi.");
        }
    }
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        Valuta dollar = new Valuta("dollar", 10.6);
        Valuta euro = new Valuta("euro", 11.77);
        Valuta svenskekroner = new Valuta("svenske kroner", 1.04);

        
        while (running == true) {
            System.out.println("Velg valuta:\n1 : dollar\n2 : euro\n3 : svenske kroner\n4 : avslutt");
            int valg = sc.nextInt();

           switch(valg){
            case 1:
                konverter(sc,dollar);
            break;

            case 2:
                konverter(sc,euro);
            break;

            case 3:
                konverter(sc,svenskekroner);
            break;

            case 4:
                running = false;
                System.out.println("Avslutter...");
                break;

            default:
                System.out.println("Ugyldig valg >:(");
           }

        }  
        sc.close();
        System.exit(0);
    }
}