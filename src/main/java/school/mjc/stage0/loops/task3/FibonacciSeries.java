package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
     int number1=0;
     int number2=1;
     System.out.println(number1);
     System.out.println(number2);
     for(int i=3;i<=lastFibonacci;i++){
      int number3=number1+number2;
      System.out.println(number3);
      number1=number2;
      number2=number3;} 
    }
}
