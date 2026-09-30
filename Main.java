 //   repositorio: https://github.com/leo441-pro/ParadigmasDeProgramacion

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Método para desplegar las opciones y leer la elección
    public static int mostrarMenu() {
        Scanner lector = new Scanner(System.in);
        System.out.println("\n========== MENÚ DE OPCIONES ==========");
        System.out.println("1.- Leer dato");
        System.out.println("2.- Muestre números pares");
        System.out.println("3.- Muestre los cuadrados de los valores");
        System.out.println("4.- Suma de los elementos de la lista");
        System.out.println("5.- Buscar un elemento de la lista");
        System.out.println("6.- Encontrar valor máximo");
        System.out.println("7.- Salir");
        System.out.print("Selecciona una opción (1-7): ");
        return lector.nextInt();
    }

    // Método auxiliar para leer un entero de la consola
    public static Integer leerEntero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return lector.nextInt();
    }

    // 1. Agregar dato a la lista
    public static void agregarDato(ArrayList<Integer> lista, Integer dato) {
        lista.add(dato);
        System.out.println("-> Número " + dato + " agregado con éxito.");
    }

    // 2. Mostrar únicamente pares
    public static void mostrarPares(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("-> La lista está vacía.");
            return;
        }
        System.out.print("-> Números pares encontrados: ");
        boolean hayPares = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.print(lista.get(i) + " ");
                hayPares = true;
            }
        }
        if (!hayPares) {
            System.out.print("Ninguno");
        }
        System.out.println();
    }

    // 3. Mostrar el cuadrado de cada número
    public static void mostrarCuadrados(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("-> La lista está vacía.");
            return;
        }
        System.out.println("-> Cuadrado de los valores almacenados:");
        for (int i = 0; i < lista.size(); i++) {
            Integer actual = lista.get(i);
            int cuadrado = actual * actual;
            System.out.println("   [" + actual + "]² = " + cuadrado);
        }
    }

    // 4. Calcular suma de todos los elementos
    public static int calcularSuma(ArrayList<Integer> lista) {
        int total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i);
        }
        return total;
    }

    // 5. Buscar si existe un elemento y mostrar su posición
    public static void buscarElemento(ArrayList<Integer> lista, Integer objetivo) {
        if (lista.isEmpty()) {
            System.out.println("-> La lista está vacía.");
            return;
        }
        int indice = lista.indexOf(objetivo);
        if (indice != -1) {
            System.out.println("-> El elemento " + objetivo + " se localizó en el índice: " + indice);
        } else {
            System.out.println("-> El elemento " + objetivo + " no forma parte de la lista.");
        }
    }

    // 6. Obtener el valor más alto
    public static Integer obtenerMaximo(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        Integer max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int seleccion;

        do {
            seleccion = mostrarMenu();

            switch (seleccion) {
                case 1:
                    Integer nuevoValor = leerEntero();
                    agregarDato(numeros, nuevoValor);
                    break;

                case 2:
                    mostrarPares(numeros);
                    break;

                case 3:
                    mostrarCuadrados(numeros);
                    break;

                case 4:
                    if (numeros.isEmpty()) {
                        System.out.println("-> La lista está vacía, la suma es 0.");
                    } else {
                        int sumaTotal = calcularSuma(numeros);
                        System.out.println("-> Suma de los elementos: " + sumaTotal);
                    }
                    break;

                case 5:
                    System.out.print("Valor que deseas buscar. ");
                    Integer valorBuscar = leerEntero();
                    buscarElemento(numeros, valorBuscar);
                    break;

                case 6:
                    Integer valorMaximo = obtenerMaximo(numeros);
                    if (valorMaximo == null) {
                        System.out.println("-> La lista no contiene elementos para evaluar un máximo.");
                    } else {
                        System.out.println("-> El valor máximo registrado es: " + valorMaximo);
                    }
                    break;

                case 7:
                    System.out.println("Cerrando la aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta con un número del 1 al 7.");
                    break;
            }
        } while (seleccion != 7);
    }
}