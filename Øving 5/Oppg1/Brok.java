import java.util.Scanner;

public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller,int nevner) {
        this.teller = teller;

        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være null");
        }

        this.nevner = nevner;
        

    }

    public Brok(int teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller(){
        return this.teller;
    }
    
    public int getNevner(){
        return this.nevner;
    }

    public void multipliser(Brok brok){
        this.teller *= brok.getTeller();
    }
    public void divider(Brok brok){
        this.teller *= brok.getNevner();
        this.nevner *= brok.getTeller();
    }
    public void adder(Brok brok) {
        this.teller = this.teller*brok.getNevner() + brok.getTeller()*this.nevner;
        this.nevner = this.nevner*brok.getNevner();
    }
    public void subtraher(Brok brok){
        this.teller = this.teller*brok.getNevner() - brok.getTeller()*this.nevner;
        this.nevner = this.nevner*brok.getNevner();
    }

    public void forkort(){
        for (int i = this.nevner; i > 0; i--) {
            if (this.teller % i == 0 & this.nevner % i == 0){
                this.teller /= i;
                this.nevner /= i;
                break;
            }
        }
    }

    public void test(Brok brok){
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running == true) {
            System.out.println("-- Velg regneoperasjon eller avslutt program-- \n1 : Addisjon\n2 : Subtraksjon\n3 : Multiplikasjon\n4 : Divisjon\n5 : Avslutt");
            int valg = sc.nextInt();
            String operasjon = "N/A";
            int teller1 = this.teller;
            int nevner1 = this.nevner; 
           switch(valg){
            case 1:
                adder(brok);
                operasjon = " addert";
            break;
            case 2:
                subtraher(brok);
                operasjon = " subtrahert";
                
            break;
            case 3:
                multipliser(brok);
                operasjon = " multiplisert";    
            break;
            case 4:
                divider(brok);
                operasjon = " dividert";
            break;
            case 5:
                running = false;
                System.out.println("Avslutter...");
            break;

            default:
                System.out.println("Ugyldig valg >:(");
           }
           forkort();
           System.out.println(teller1 + "/" + nevner1 + operasjon + " med " + brok.getTeller() + "/" + brok.getNevner() + " er lik: " + this.teller + "/" + this.nevner);
           forkort();
        }  
        sc.close();
        System.exit(0);
    }
}
    



