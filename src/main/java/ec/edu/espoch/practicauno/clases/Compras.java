package ec.edu.espoch.practicauno.clases;


public class Compras {
    
    private static final double IVA = 0.12;
    
    
    
    public void mostrarDetalleLibro(Libro libro){
        
        double libroConIva = libro.getPrecio()+ (libro.getPrecio()*IVA);
        System.out.println("Titulo del libro: "+ libro.getTitulo());
        System.out.println("Autor del libro: "+ libro.getAutor());
        System.out.println("Precio del libro sin IVA: "+ libro.getPrecio());
        System.out.println("Precio del libro con IVA: "+ libroConIva);
    }
    
    public void mostrarClienteYProducto(Cliente cliente, Libro libro){
        
       double libroConIva = libro.getPrecio()+ (libro.getPrecio()*IVA); 
        System.out.println("Nombre del Cliente: "+ cliente.getNombre());
        System.out.println("Nombre del Titulo del libro adquirido: "+ libro.getTitulo());
        System.out.println("Genero del libro adquirido: "+ libro.getGenero());
        System.out.println("Precio del libro sin IVA: "+ libro.getPrecio());
        System.out.println("Precio del libro con IVA: "+ libroConIva);
        
    }
}