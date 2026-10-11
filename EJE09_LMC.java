//   repositorio: https://github.com/leo441-pro/ParadigmasDeProgramacion
import org.upiiz.models.Computadora;
import org.upiiz.models.Laboratorio;
import org.upiiz.models.Mesa;

public class Main {
    public static void main(String[] args) {
        //Repositorio Github: https://github.com/SevenShadows/EJE09_POA

        // Instanciar objetos computadora
        Computadora compu1 = new Computadora("SN-12345", "Dell", 15500.50f);
        Computadora compu2 = new Computadora("SN-67890", "HP", 14200.00f);
        Computadora compu3 = new Computadora("SN-11223", "Lenovo", 16800.75f);
        Computadora compu4 = new Computadora("SN-44556", "Asus", 17500.00f);

        // Instanciar objetos mesa
        Mesa mesa1 = new Mesa("Madera", "Café");
        Mesa mesa2 = new Mesa("Metal", "Blanco");

        // Agregar las computadoras a sus mesas
        mesa1.agregarComputadora(compu1);
        mesa1.agregarComputadora(compu2);

        mesa2.agregarComputadora(compu3);
        mesa2.agregarComputadora(compu4);

        // Instanciar el Laboratorio
        Laboratorio lab1 = new Laboratorio(1, "Blanco", "Laboratorio de Cómputo Principal");

        // Setter para el encargado
        lab1.setEncargado("Rata de laboratorio");

        // Agregar las mesas
        lab1.agregarMesa(mesa1);
        lab1.agregarMesa(mesa2);

        System.out.println("---- REPORTE DEL LABORATORIO ----");
        lab1.mostrarMesas();
    }
}