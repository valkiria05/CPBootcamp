import java.util.*;
public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double suma=0;
        int count=0;
        for(int i = a; i > 0; i--) {
            double b = scanner.nextDouble();
            if (b>=5.00) {
                suma += b;
                count++;
            }
        }
        System.out.printf("%.2f%n", suma/count);
  }  
}
