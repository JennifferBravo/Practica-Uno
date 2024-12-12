

package ec.edu.espoch.practicauno;

import ec.edu.espoch.practicauno.clases.Cliente;
import ec.edu.espoch.practicauno.clases.Compras;
import ec.edu.espoch.practicauno.clases.Libro;
import ec.edu.espoch.practicauno.clases.enumeraciones.Genero;


public class PracticaUno {

    public static void main(String[] args) {

        
        Cliente cliente = new Cliente ("Jenniffer Muima", 071);
        Cliente cliente2 = new Cliente ("Veronica Saez", 396);
        
        Libro libro1 = new Libro ("El hombre en busca de sentido", "Victor E. Frankl",15.0,Genero.FICCION);
        Libro libro2 = new Libro ("1984", "George Orwell",12.0,Genero.NOFICCION);
        
        
        Compras compra = new Compras();
        
        compra.mostrarDetalleLibro(libro1);
        compra.mostrarDetalleLibro(libro2);
        
        compra.mostrarClienteYProducto(cliente, libro1);
        compra.mostrarClienteYProducto(cliente2, libro1);
    }
}

