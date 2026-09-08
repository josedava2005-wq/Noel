
import java.util.Scanner;

public class Noel {

    public static boolean buscarProducto(String[] verduras, String nombreBuscado) {

        for (String verdura : verduras) {

            if (verdura != null && verdura.equals(nombreBuscado)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] verduras = {"Manzana", "Banano", "Mango", null, null};

        int opcion;

        while (true) {

            System.out.println("\n--- INVENTARIO DE GALLETAS NOEL ---");
            System.out.println("1. Listar productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Agregar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nProductos disponibles:");

                    for (String verdura : verduras) {

                        if (verdura != null) {
                            System.out.println("- " + verdura);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreBuscado = sc.nextLine();

                    if (buscarProducto(verduras, nombreBuscado)) {
                        System.out.println("El producto existe.");
                    } else {
                        System.out.println("El producto no existe.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del nuevo producto: ");
                    String nuevaVerdura = sc.nextLine();

                    boolean agregado = false;

                    for (int i = 0; i < verduras.length; i++) {

                        if (verduras[i] == null) {
                            verduras[i] = nuevaVerdura;
                            agregado = true;
                            System.out.println("Producto agregado correctamente.");
                            break;
                        }
                    }

                    if (!agregado) {
                        System.out.println("No hay espacio disponible.");
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}

