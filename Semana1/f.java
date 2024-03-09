import java.util.*;
public class f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int horaInicio = 12;
        int minutosInicio = 0;
        int minutosTotales = minutosInicio + n;
        int horaFin = (horaInicio + minutosTotales / 60) % 24;
        int minutosFin = minutosTotales % 60;
        String horaFormateada = String.format("%02d:%02d",horaFin,minutosFin);
        System.out.println(horaFormateada);
    }
}
