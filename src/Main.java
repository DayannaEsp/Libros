import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titulo, autor;
        int precio;
        double peso, tamanioArchivo;
        List<Libro> listaLibrosImpresos = new ArrayList<>();
        List<Libro> listaLibrosDigitales = new ArrayList<>();
        int opc;
        boolean estado = true;

        do {
            System.out.println("Librería");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Ver los libros");
            System.out.println("3. Salir");
            System.out.print("Digite una opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Seleccione el tipo de libro: 1. Impreso 2. Digital");
                    int claseLibro = teclado.nextInt();
                    teclado.nextLine();

                    if (claseLibro == 1) {
                        System.out.print("Registre el título del libro: ");
                        titulo = teclado.nextLine();
                        System.out.print("Registre el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.print("Registre el precio del libro: ");
                        precio = teclado.nextInt();
                        System.out.print("Regriste el peso del libro: ");
                        peso = teclado.nextDouble();
                        listaLibrosImpresos.add(new LibroImpreso(titulo, autor, precio, peso));
                    } else if (claseLibro == 2) {
                        System.out.print("Registre el título del libro: ");
                        titulo = teclado.nextLine();
                        System.out.print("Registre el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.print("Registre el precio del libro: ");
                        precio = teclado.nextInt();
                        System.out.print("Registre el tamañpo del archivo");
                        tamanioArchivo = teclado.nextDouble();
                        listaLibrosDigitales.add(new LibroDigital(titulo, autor, precio, tamanioArchivo));
                    }
                }
                case 2 -> {
                    System.out.println("Elija el tipo de libro para ver 1. Impreso 2. Digital");
                    int tipoL = teclado.nextInt();

                    if (tipoL == 1) {
                        listaLibrosImpresos.forEach(Libro::mostrarInfo);
                    } else if (tipoL == 2) {
                        listaLibrosDigitales.forEach(Libro::mostrarInfo);
                    }

                }
                case 3 -> {
                    System.out.println("Saliendo...");
                    estado = false;
                }

            }
        } while (estado);

    }
}