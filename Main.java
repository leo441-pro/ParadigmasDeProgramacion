import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Lista base proporcionada por la práctica
        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);
        System.out.println("==========================================");
        System.out.println("PARTE 9.1: PROGRAMACIÓN ESTRUCTURADA");
        System.out.println("==========================================");

        //Mostrar todos los números de la lista
        System.out.print("Ejercicio 1 (Todos los numeros): ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();

        //Mostrar únicamente los números mayores que 10
        System.out.print("Ejercicio 2 (Mayores que 10): ");
        for (int i = 0; i < numeros.size(); i++) {
            int n = numeros.get(i);
            if (n > 10) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        //Mostrar únicamente los números pares
        System.out.print("Ejercicio 3 (Pares): ");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        //Mostrar únicamente los números impares
        System.out.print("Ejercicio 4 (Impares): ");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        //Multiplicar cada número por 2 y mostrar el resultado
        System.out.print("Ejercicio 5 (Multiplicados por 2): ");
        for (int n : numeros) {
            System.out.print((n * 2) + " ");
        }

        System.out.println("\n");

        System.out.println("==================================================");
        System.out.println("PARTE 10: LAMBDAS Y STREAMS EN JAVA");
        System.out.println("==================================================");

        // Ejercicio 6: Nueva colección con números >= 8
        List<Integer> mayoresOIgual8 = numeros.stream()
                .filter(n -> n >= 8)
                .toList();
        System.out.println("E6. Mayores o iguales a 8: " + mayoresOIgual8);

        // Ejercicio 7: Nueva colección con números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("E7. Números pares: " + pares);

        // Ejercicio 8: Ordenar de menor a mayor (ascendente)
        List<Integer> menorAMayor = numeros.stream()
                .sorted()
                .toList();
        System.out.println("E8. Ordenados de menor a mayor: " + menorAMayor);

        // Ejercicio 9: Ordenar de mayor a menor (descendente)
        List<Integer> mayorAMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("E9. Ordenados de mayor a menor: " + mayorAMenor);

        // Ejercicio 10: Obtener el valor máximo
        int maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println("E10. Valor máximo: " + maximo);

        // Ejercicio 11: Obtener el valor mínimo
        int minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("E11. Valor mínimo: " + minimo);

        // Ejercicio 12: Suma de todos los números
        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("E12. Suma total: " + suma);

        // Ejercicio 13: Promedio de los números
        double promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("E13. Promedio: " + promedio);

        // Ejercicio 14: Contar cuántos son mayores que 10
        long mayores10 = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("E14. Cantidad de números mayores que 10: " + mayores10);

        // Ejercicio 15: Impares ordenados de menor a mayor
        List<Integer> imparesOrdenados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .toList();
        System.out.println("E15. Impares ordenados ascendente: " + imparesOrdenados);

    }
}