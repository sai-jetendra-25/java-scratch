import java.util.*;
public class TWO_SUM {
    public static int twoSum(int a,int b){
       int  sum=a+b;
      
       return sum;
    }
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of a,b;");
   
      int a=sc.nextInt();
      int b=sc.nextInt();
       
      int sum=twoSum(a, b);
      System.out.println(sum);
      
    }
}
