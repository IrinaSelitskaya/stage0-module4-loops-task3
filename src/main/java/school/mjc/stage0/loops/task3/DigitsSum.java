package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
     int sum=0;
     String str=Integer.toString(t);
     for(int i=0;i<str.length();i++){
      int digit=t%10;
      sum+=digit;
      t=t/10;}
     System.out.println(sum);
    }
}
