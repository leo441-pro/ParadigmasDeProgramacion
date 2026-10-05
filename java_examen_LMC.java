import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(
                5, 12, 8, 3, 20, 15, 7, 10, 25, 4,
                18, 6, 30, 9, 2
        );
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Numeros Pares: " + pares);

        List<Integer> mayoresQue10 = numeros.stream().filter(n -> n > 10).toList();
        System.out.println("Numeros mayores que 10: " + mayoresQue10);

        List<Integer> cuadrados = numeros.stream().map(n -> n * n).toList();
        System.out.println("Cuadrados de los numeros: " + cuadrados);

        Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);
        System.out.println("Maximo de los numeros: " + maximo);


        Optional<Integer> minimo = numeros.stream().min(Integer::compareTo);
        System.out.println("Minimo en la lista: " + minimo);

        long cantidadMayores10 = numeros.stream().filter(n -> n > 10).count();
        System.out.println("Cantidad de numeros mayores que 10: " + cantidadMayores10);

        OptionalDouble promedio = numeros.stream().mapToInt(Integer::intValue).average();
        System.out.println("promedio total: " + promedio);
    }
}