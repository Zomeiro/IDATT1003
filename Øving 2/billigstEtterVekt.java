public class billigstEtterVekt {
    public static void main(String[] args) {
        double[] kjottdeigA = {35.90,450};
        double[] kjottdeigB = {39.90,500};
        double gPrisA = kjottdeigA[0]/kjottdeigA[1];
        double gPrisB = kjottdeigB[0]/kjottdeigB[1];
        if (gPrisA==gPrisB) {
            System.out.println("Kiloprisen er like høy!");
        }
        else if (gPrisA<gPrisB) {
            System.out.println("Kilopris til A er billigere enn B");
        }
        else {
            System.out.println("Kilopris til B er billigere enn A");
        }
    }
   
}
