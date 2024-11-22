public class totalSecs {
  
    static int konverter(String totTime){
      String[] timesplit = totTime.split(":");
      int totsecs = Integer.parseInt(timesplit[0])*60*60+Integer.parseInt(timesplit[1])*60+Integer.parseInt(timesplit[2]);
      return totsecs;
    }
    public static void main(String[] args) {
      String[] HMS = {"00:01:00","23:00:20","00:00:02","00:01:50"};
        for (String HMS1 : HMS) {
            System.out.println(konverter(HMS1));
        }
  }
  }