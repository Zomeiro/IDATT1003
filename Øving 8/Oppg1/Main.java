import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ola","Nordmann",2005);
        ArbTaker ansatt1 = new ArbTaker(person1,4546, 2022,58333,28.12);
        while (true){
            //All info:
            System.out.println("----ARBEIDSTAKER INFO----");
            System.out.println("ID: " + ansatt1.getArbtakernr());
            System.out.println("Navn: " + ansatt1.navn());
            System.out.println("Alder: " + ansatt1.alder()+" år.");
            System.out.println("År i bedriften: " + ansatt1.aarAnsatt());
            System.out.println("Brutto årslønn: " + ansatt1.bruttoloenn()+"kr.");
            System.out.println("Skattetrekk pr. År: " + ansatt1.aarsskatt()+"kr.");
            System.out.println("Netto månedslønn: " + (ansatt1.getMaanedsloenn()-ansatt1.maanedsskatt())+"kr.");
            System.out.println("Ansatt over 10 år?: " + ansatt1.ansattOverNAar(10));
            //Meny
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.println("\n[1] Rediger\n[2] Avslutt");

            int svar = sc.nextInt();

            switch (svar) {
                case 1:
                    ansatt1.rediger();
                    break;
                case 2:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Den verdien der er ikke helt grei..: " + svar);
            }
        }
    }
}
