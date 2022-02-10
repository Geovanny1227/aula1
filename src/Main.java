import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        List<Double> valores = List.of(A, B, C);
        List<Double> valoresOrdenados = valores.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("Imprimindo valores");
//        valores.forEach(valor-> System.out.println(valor));
//        System.out.println("Imprimindo valores Ordenados");
//        valoresOrdenados.forEach(valor-> System.out.println(valor));

        Double a = valoresOrdenados.get(0);
        Double b = valoresOrdenados.get(1);
        Double c = valoresOrdenados.get(2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (a * a == b * b + c * c){
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a * a > b * b + c * c){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a * a < b * b + c * c){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && a == c && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && a == c ){
            System.out.println("TRIANGULO ISOSCELES");
        }
        if (b == a && b == c){
            System.out.println("TRIANGULO ISOSCELES");
        }
        if (c == a && c == b){
            System.out.println("TRIANGULO ISOSCELES");
        }


    }
}
