import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = n; i > 0; i--){
            int m = in.nextInt();
            System.out.print(m*2 + " ");
        }
        System.out.println("");
         int b = in.nextInt();
         for(int i = b; i > 0; i--){
             char c = in.next().charAt(0);
             System.out.print(Character.toUpperCase(c) + " ");
         }
        System.out.println("");
         String vocal = "0";
         int f = in.nextInt();
         in.nextLine();
        String g = in.nextLine();
        String s = g.replaceAll("[aeiouAEIOU]", vocal);
        System.out.print(s);
         
}
}
