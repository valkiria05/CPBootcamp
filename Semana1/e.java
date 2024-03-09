import java.util.*;
public class e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long t = in.nextLong();
        long n = in.nextLong();
        if (n>0) {
            System.out.println(a*5 + t*7 + (n-1)*13);
        }
        else if ((t>0)&&(n==0)) {
            System.out.println(a*5 + (t-1)*7);
        }
        else if ((a>0)&&(t==0)&&(n==0)) {
            System.out.println((a-1)*5);
        }
        else {
            System.out.println("0");
        }
    }
}
