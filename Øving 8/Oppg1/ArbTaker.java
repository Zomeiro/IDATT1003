import java.util.GregorianCalendar;
import java.util.Scanner;

public class ArbTaker {
    Person personalia;
    private int arbtakernr;
    private int ansettelsesaar;
    private int maanedsloenn;
    private double skatteprosent;

    GregorianCalendar kalender = new java.util.GregorianCalendar();
    int Aar;

    ArbTaker(Person personalia, int arbtakernr, int ansettelsesaar, int maanedsloenn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedsloenn = maanedsloenn;
        this.skatteprosent = skatteprosent;

        this.Aar = kalender.get(java.util.Calendar.YEAR);
    }
    int getArbtakernr() {
        return this.arbtakernr;
    }
    int getAnsettelsesaar(){
        return this.ansettelsesaar;
    }
    int getMaanedsloenn(){
        return this.maanedsloenn;
    }
    double getSkatteprosent(){
        return this.skatteprosent;
    }

    void setMaanedsloenn(int nyMaanedsloenn){
        this.maanedsloenn = nyMaanedsloenn;
    }

    void setSkatteprosent(double nySkatteprosent){
        this.skatteprosent = nySkatteprosent;
    }

    double maanedsskatt(){
        return (this.skatteprosent/100)*this.maanedsloenn;
    }
    double aarsskatt(){
        return maanedsskatt()*10.5;
    }
    int bruttoloenn(){
        return this.maanedsloenn*12;
    }
    String navn(){
        return personalia.getEtternavn() + ", " + personalia.getFornavn() + ";";
    }
    int alder(){
        return this.Aar-personalia.getFoedselsaar();
    }
    int aarAnsatt(){
        return this.Aar-getAnsettelsesaar();
    }
    boolean ansattOverNAar(int minAar){
        return this.Aar-getAnsettelsesaar()>=minAar;
    }

    void rediger(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean running = true;
        while (running){
            System.out.println("----REDIGERER----");
            System.out.println("[1] <-- Tilbake\n[2] Endre månedslønn ("+getMaanedsloenn()+"kr)\n[3] Endre skatteprosent ("+getSkatteprosent()+"%)\n[4] Endre etternavn ("+personalia.getEtternavn()+")\n[5] Endre fornavn ("+ personalia.getFornavn()+")\n");
            int svar = sc.nextInt();
            switch (svar){
                case 1:
                    running = false;
                    break;
                case 2:
                    System.out.println("----MÅNEDSLØNN----");
                    System.out.print("Skriv ny månedslønn eller 'avbryt' for å avbryte: ");
                    String nyMaanedsloennInput = sc.next();
                    if (nyMaanedsloennInput.toLowerCase().equals("avbryt")) {
                        System.out.println("Endring av månedslønn avbrutt.");
                    }
                    else {
                        int nyMaanedsloenn = Integer.parseInt(nyMaanedsloennInput);
                        setMaanedsloenn(nyMaanedsloenn);
                        System.out.println("Månedslønn oppdatert.");
                    }
                    break;

                case 3:
                    System.out.println("----SKATTEPROSENT----");
                    System.out.print("Skriv ny skatteprosent eller 'avbryt' for å avbryte: ");
                    String nySkatteprosentInput = sc.next();
                    if (nySkatteprosentInput.toLowerCase().equals("avbryt")) {
                        System.out.println("Endring av skatteprosent avbrutt.");
                    }
                    else {
                        double nySkatteprosent = Double.parseDouble(nySkatteprosentInput);
                        setSkatteprosent(nySkatteprosent);
                        System.out.println("Skatteprosent oppdatert.");
                    }
                    break;

                case 4:
                    System.out.println("----ETTERNAVN----");
                    System.out.print("Skriv nytt etternavn eller 'avbryt' for å avbryte: ");
                    String nyttEtternavn = sc.next();


                    if (nyttEtternavn.toLowerCase().equals("avbryt")) {
                        System.out.println("Endring av etternavn avbrutt.");
                    }
                    else {
                        personalia.setEtternavn(nyttEtternavn);
                        System.out.println("Etternavn oppdatert.");
                    }
                    break;

                case 5:
                    System.out.println("----FORNAVN----");
                    System.out.print("Skriv nytt fornavn eller 'avbryt' for å avbryte: ");
                    String nyttFornavn =  sc.next();


                    if (nyttFornavn.toLowerCase().equals("avbryt")) {
                        System.out.println("Endring av fornavn avbrutt.");
                    }
                    else {
                        personalia.setFornavn(nyttFornavn);
                        System.out.println("Fornavn oppdatert.");
                    }
                    break;

                default:
                    System.out.println("Feillll.. prøvv på nytt >:(((");
                    break;
            }
        }
    }

}
