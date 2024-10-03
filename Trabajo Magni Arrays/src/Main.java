import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int opcion;
        do {
            System.out.print(
                    """ 
                    --- MENÚ DE OPCIONES ---
                    1. Acceder fuera del tamaño del array
                    2. Array unidimensional de tamaño 5
                    3. Array de tamaño dinámico con múltiplos
                    4. Leer 20 números decimales y calcular mayor , menor y rango
                    5. Números enteros positivos pares, promedio y conteos
                    6. Búsqueda secuencial en un array de tamaño 50
                    7. Suma de pares e impares
                    8. Ordenar array ascendente y descendente
                    9. Sumar números de cadena separada por guiones
                    10. Calcular letra de DNI
                    11. Sumar y Multiplicar 2 array en uno nuevo
                    12. Eliminar elemento de un array
                    0. Salir
                    Elige una opción: """
            );
            // Leer opción del usuario
            opcion = scanner.nextInt();
            // Switch para manejar las opciones
            switch (opcion) {
                case 1:
                    Actividades.accederFueraArray();
                    break;
                case 2:
                    Actividades.arrayTamano5();
                    break;
                case 3:
                    Actividades.arrayMultiploDinamico();
                    break;
                case 4:
                    Actividades.calcularMayorMenorRango();
                    break;
                case 5:
                    Actividades.calcularPromedioYConteos();
                    break;
                case 6:
                    Actividades.busquedaSecuencial();
                    break;
                case 7:
                    Actividades.sumaParImpar();
                    break;
                case 8:
                    Actividades.ordenarAscDesc();
                    break;
                case 9:
                    Actividades.sumarCadenaNumeros();
                    break;
                case 10:
                    Actividades.calcularLetraDNI();
                    break;
                case 11:
                    Actividades.arrayMultiplicacionSuma();
                    break;
                case 12:
                    Actividades.arrayEliminarElemento();
                    break;
                case 0:
                    System.out.println("Cerrando el programa....");
                    break;
                default:
                    System.out.println("Opción no valida. Inténtalo nuevamente.");
                    break;
            }
        }
        while (opcion != 0);
    }
}