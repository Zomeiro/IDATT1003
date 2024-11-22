public class Main {
    public static void main(String[] args) {
        Tekstbehandling a = new Tekstbehandling("Dette er en ting. Den inneholder nok både ting og tang. Eller gjør den det? Det vet jeg ikke. Så er det jo noen ting som tinger tingene");

        System.out.println("Org Streng: " + a.getString());
        System.out.println("Streng store bokstaver: " + a.storeBokstaver());
        System.out.println("Totalt antall ord i teksten: " + a.antallOrd());
        String ord = "ting";
        System.out.println("Forekomster av '" + ord + "' i teksten: " + a.forekomstAvStreng(ord));
        System.out.println("Gjennomsnittlig ordlengde: " + a.avgOrdlengde());
        System.out.println("Bytt ut ting: " + a.byttUt("ting", "Huuh"));
        System.out.println("Avg ord/setningslengde: " + a.avgSetning());
    }
}
