import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenyRegister menyRegister = new MenyRegister();
        Scanner scanner = new Scanner(System.in);


        menyRegister.nyRett(new Rett("Bruschetta", 1, 79.00, "Brød med tomat og basilikum"));
        menyRegister.nyRett(new Rett("Pasta Carbonara", 2, 149.00, "Pasta med bacon og fløtesaus"));
        menyRegister.nyRett(new Rett("Tiramisu", 3, 89.00, "Kaffedessert med mascarpone"));
        menyRegister.nyRett(new Rett("Hummus med pitabrød", 1, 59.00, "Kikertpuré med olivenolje og pitabrød"));
        menyRegister.nyRett(new Rett("Lammegryte", 2, 169.00, "Langtidskokt lam med grønnsaker og krydder"));
        menyRegister.nyRett(new Rett("Baklava", 3, 79.00, "Filodeig med nøtter og honning"));

        // Lag og registrer italiensk meny
        List<Rett> italienskRetter = List.of(
                menyRegister.finnRett("Bruschetta"),
                menyRegister.finnRett("Pasta Carbonara"),
                menyRegister.finnRett("Tiramisu")
        );
        menyRegister.nyMeny(italienskRetter);

        // Lag og registrer midtøsten meny
        List<Rett> midtøstenRetter = List.of(
                menyRegister.finnRett("Hummus med pitabrød"),
                menyRegister.finnRett("Lammegryte"),
                menyRegister.finnRett("Baklava")
        );
        menyRegister.nyMeny(midtøstenRetter);
        while (true) {
            System.out.println("\nVelg et alternativ:");
            System.out.println("1. Registrer ny rett");
            System.out.println("2. Finn rett basert på navn");
            System.out.println("3. Finn alle retter av en gitt type");
            System.out.println("4. Registrer ny meny med et sett med retter");
            System.out.println("5. Finn menyer med totalpris innenfor et gitt intervall");
            System.out.println("6. Avslutt");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Navn på rett: ");
                    String navn = scanner.nextLine();
                    System.out.print("Type (1: Forrett, 2: Hovedrett, 3: Dessert, 4: Annet): ");
                    int type = scanner.nextInt();
                    System.out.print("Pris: ");
                    double pris = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Oppskrift: ");
                    String oppskrift = scanner.nextLine();

                    Rett rett = new Rett(navn, type, pris, oppskrift);
                    menyRegister.nyRett(rett);
                    System.out.println("Rett registrert.");
                    break;

                case 2:
                    System.out.print("Skriv navnet på retten du vil finne: ");
                    String rettNavn = scanner.nextLine();
                    Rett funnetRett = menyRegister.finnRett(rettNavn);
                    if (funnetRett != null) {
                        System.out.println("Rett funnet: " + funnetRett.getNavn() + " - " +
                                funnetRett.getTypeNavn() + ", Pris: " + funnetRett.getPris() +
                                ", Oppskrift: " + funnetRett.getOppskrift());
                    } else {
                        System.out.println("Rett ikke funnet.");
                    }
                    break;

                case 3:
                    System.out.print("Skriv type (1: Forrett, 2: Hovedrett, 3: Dessert, 4: Annet): ");
                    int søketype = scanner.nextInt();
                    List<Rett> retterAvType = menyRegister.finnRetterAvType(søketype);
                    skrivUtRetter(retterAvType);
                    break;

                case 4:
                    List<Rett> retterTilMeny = new ArrayList<>();
                    while (true) {
                        System.out.print("Legg til rett i meny (skriv navn, eller 'ferdig' for å avslutte): ");
                        String rettTilMenyNavn = scanner.nextLine();
                        if (rettTilMenyNavn.equalsIgnoreCase("ferdig")) break;
                        Rett rettTilMeny = menyRegister.finnRett(rettTilMenyNavn);
                        if (rettTilMeny != null) {
                            retterTilMeny.add(rettTilMeny);
                            System.out.println("Rett lagt til i meny.");
                        } else {
                            System.out.println("Rett ikke funnet.");
                        }
                    }
                    menyRegister.nyMeny(retterTilMeny);
                    System.out.println("Meny registrert.");
                    break;

                case 5:
                    System.out.print("Minimum pris: ");
                    double minPris = scanner.nextDouble();
                    System.out.print("Maksimum pris: ");
                    double maxPris = scanner.nextDouble();
                    List<Meny> menyerInnenforIntervall = menyRegister.menyPrisIntervall(minPris, maxPris);
                    skrivUtMenyer(menyerInnenforIntervall);
                    break;

                case 6:
                    System.out.println("Avslutter program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
                    break;
            }
        }
    }

    private static void skrivUtRetter(List<Rett> retter) {
        if (retter.isEmpty()) {
            System.out.println("Ingen retter funnet.");
        } else {
            for (Rett rett : retter) {
                System.out.println("Navn: " + rett.getNavn() + ", Type: " + rett.getTypeNavn() +
                        ", Pris: " + rett.getPris() + ", Oppskrift: " + rett.getOppskrift());
            }
        }
    }

    private static void skrivUtMenyer(List<Meny> menyer) {
        if (menyer.isEmpty()) {
            System.out.println("Ingen menyer funnet.");
        } else {
            for (Meny meny : menyer) {
                System.out.println("Meny med totalpris: " + meny.beregnTotalPris());
                for (Rett rett : meny.getRetter()) {
                    System.out.println("- " + rett.getNavn() + " (" + rett.getTypeNavn() + ") - Pris: " + rett.getPris());
                }
            }
        }
    }
}
