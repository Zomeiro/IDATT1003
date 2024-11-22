

public final class Matrise {
    private final int[][] matrise;

    public Matrise(int[][] matrise) {
        // lage kopi av seg selv for immutabilitet
        this.matrise = kopierMatrise(matrise);
    }

    private int[][] kopierMatrise(int[][] original) {
        int[][] kopi = new int[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, kopi[i], 0, original[i].length);
        }
        return kopi;
    }


    public Matrise adder(Matrise annen) {
        if (annen.matrise.length != this.matrise.length ||
            annen.matrise[0].length != this.matrise[0].length) {
            return null; // samme dimensjon

        }

        int[][] resultat = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = this.matrise[i][j] + annen.matrise[i][j];
            }
        }
        return new Matrise(resultat);
    }

    public Matrise multipliser(Matrise annen) {
        if (this.matrise[0].length != annen.matrise.length) { //(r != k)
            return null; 
        }

        int[][] resultat = new int[this.matrise.length][annen.matrise[0].length];

        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[0].length; j++) {
                for (int k = 0; k < this.matrise[0].length; k++) {
                    resultat[i][j] += this.matrise[i][k] * annen.matrise[k][j];
                }
            }
        }
        return new Matrise(resultat);
    }


    public Matrise transponer() {
        int[][] resultat = new int[matrise[0].length][matrise.length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[0].length; j++) {
                resultat[j][i] = matrise[i][j];
            }
        }
        return new Matrise(resultat);
    }

    public void skrivUt() {
        for (int[] rad : matrise) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}