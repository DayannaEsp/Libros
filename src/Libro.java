public class Libro {
        protected String titulo;
        protected String autor;
        protected double precio;

        public Libro(String titulo, String autor, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.precio = precio;
        }

        public void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Precio: " + precio);
        }

    }



