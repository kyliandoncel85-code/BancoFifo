import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Cliente> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== SISTEMA BANCO FIFO ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Cantidad clientes");
            System.out.println("6. Vaciar cola");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Identificación: ");
                    String id = scanner.nextLine();

                    System.out.print("Tipo transacción: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Hora llegada: ");
                    String hora = scanner.nextLine();

                    Cliente cliente = new Cliente(nombre, id, tipo, hora);

                    cola.offer(cliente);

                    System.out.println("Cliente agregado.");
                    break;
                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes.");
                    } else {
                        System.out.println("Atendiendo: " + cola.poll());
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes.");
                    } else {
                        System.out.println("Siguiente: " + cola.peek() );
                    }
                    break;
                case 4:
                    if (cola.isEmpty()) {
                        System.out.println("Cola vacía");
                    } else {
                        for (Cliente c : cola) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 5:
                    System.out.println( "Clientes en espera: " + cola.size());
                    break;
                case 6:
                    cola.clear();
                    System.out.println("Cola vaciada.");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
        scanner.close();
    }
}