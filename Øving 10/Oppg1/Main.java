import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrangementregister register = new Arrangementregister();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nVelg et alternativ:");
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato");
            System.out.println("4. Finn arrangementer i tidsintervall");
            System.out.println("5. List arrangementer sortert etter sted");
            System.out.println("6. List arrangementer sortert etter type");
            System.out.println("7. List arrangementer sortert etter tidspunkt");
            System.out.println("8. Avslutt");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Nr: ");
                    int nr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Navn: ");
                    String navn = scanner.nextLine();
                    System.out.print("Sted: ");
                    String sted = scanner.nextLine();
                    System.out.print("Arrangør: ");
                    String arrangoer = scanner.nextLine();
                    System.out.print("Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Tidspunkt (ÅÅÅÅMMDDTTMM): ");
                    Long tidspunkt = scanner.nextLong();
                    register.nyttArrangement(nr, navn, sted, arrangoer, type, tidspunkt);
                    System.out.println("Arrangement registrert.");
                    break;
                case 2:
                    System.out.print("Sted: ");
                    String søkeSted = scanner.nextLine();
                    List<Arrangement> stedResultat = register.arrSted(søkeSted);
                    skrivUtArrangementer(stedResultat);
                    break;
                case 3:
                    System.out.print("Dato (ÅÅÅÅMMDD): ");
                    Long dato = scanner.nextLong();
                    List<Arrangement> datoResultat = register.arrDato(dato);
                    skrivUtArrangementer(datoResultat);
                    break;
                case 4:
                    System.out.print("Startdato (ÅÅÅÅMMDDTTMM): ");
                    Long dato1 = scanner.nextLong();
                    System.out.print("Sluttdato (ÅÅÅÅMMDDTTMM): ");
                    Long dato2 = scanner.nextLong();
                    List<Arrangement> intervallResultat = register.arrDatoIntervall(dato1, dato2);
                    skrivUtArrangementer(intervallResultat);
                    break;
                case 5:
                    List<Arrangement> sortertSted = register.sorterEtterSted();
                    skrivUtArrangementer(sortertSted);
                    break;
                case 6:
                    List<Arrangement> sortertType = register.sorterEtterType();
                    skrivUtArrangementer(sortertType);
                    break;
                case 7:
                    List<Arrangement> sortertTid = register.sorterEtterTidspunkt();
                    skrivUtArrangementer(sortertTid);
                    break;
                case 8:
                    System.out.println("Avslutter program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
                    break;
            }
        }
    }

    private static void skrivUtArrangementer(List<Arrangement> arrangementer) {
        if (arrangementer.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            for (Arrangement a : arrangementer) {
                System.out.println("Nr: " + a.getNr() + ", Navn: " + a.getNavn() + ", Sted: " + a.getSted() +
                        ", Arrangør: " + a.getArrangoer() + ", Type: " + a.getType() +
                        ", Tidspunkt: " + a.getTidspunkt());
            }
        }
    }
}
