import java.util.*;
public class IncDec {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        if(x<y && y<z) System.out.println("Increasing");
        else if(x>y && y>z) System.out.println("Decrasing");
        else System.out.println("Neither");
    }
    
}
