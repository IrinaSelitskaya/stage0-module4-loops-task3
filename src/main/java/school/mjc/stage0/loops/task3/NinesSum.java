package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
     int number=9;
     int sum=9;
     for(int i=2;i<=lengthOfLastNumber;i++){
      number=number*10+9;
      sum+=number;} 
     System.out.println(sum);
    }
}
