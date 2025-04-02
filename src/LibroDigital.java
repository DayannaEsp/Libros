public class LibroDigital extends Libro {
        private double tamanioArchivo;

        public LibroDigital(String titulo, String autor, double precio, double tamanioArchivo) {
            super(titulo, autor, precio);
            this.tamanioArchivo = tamanioArchivo;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Tamaño del archivo: " + tamanioArchivo );
        }

    }


