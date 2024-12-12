package ec.edu.espoch.practicauno.clases;

import ec.edu.espoch.practicauno.clases.enumeraciones.Genero;


public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private Genero genero;

    public Libro(String titulo, String autor, double precio, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public Genero getGenero() {
        return genero;
    }
    
    
}