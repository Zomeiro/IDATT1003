public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},{4, 5, 6}};

        int[][] b = {{7, 8, 9},{10, 11, 12}};

        int[][] c = {{1, 2},{3, 4},{5, 6}};

        Matrise matrise1 = new Matrise(a);
        Matrise matrise2 = new Matrise(b);
        Matrise matrise3 = new Matrise(c);

        System.out.println("matrise1 + matrise2:");
        Matrise sum = matrise1.adder(matrise2);
        if (sum != null) {
            sum.skrivUt();
        } else {
            System.out.println("Ugyldige dimensjoner");
        }


        System.out.println("\nmatrise1 * matrise3");
        Matrise produkt = matrise1.multipliser(matrise3);
        if (produkt != null) {
            produkt.skrivUt();
        } else {
            System.out.println("Ugyldige dimensjoner");
        }

        System.out.println("\nTransponering matrise1:");
        Matrise transponert = matrise1.transponer();
        transponert.skrivUt();

        System.out.println("\nTransponering matrise3:");
        Matrise transponertmatrise3 = matrise3.transponer();
        transponertmatrise3.skrivUt();
    }
}