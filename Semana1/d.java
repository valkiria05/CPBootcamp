import java.util.*;
public class d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int i = n;
        while ( i >= 1 ) {
            if ((i%c)==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            System.exit(0);
    }
   }
}
