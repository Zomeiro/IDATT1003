

public class secsToHMS{
    static String konverter(int secs){
        int hours = (secs-(secs%3600))/3600;
        secs = secs-hours*3600;
        int minutes = (secs-(secs%60))/60;
        secs = secs-minutes*60;
        return hours + ":" + minutes + ":" + secs;
    }

    public static void main(String[] args) {
        int[] secList = {20, 72, 4000, 3661};
        for (int i = 0; i < secList.length; i++) {
            System.out.println(konverter(secList[i]));
        }
    }
}