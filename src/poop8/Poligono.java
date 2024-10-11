/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase abstracta que representa un Polígono. 
 * Esta clase define métodos abstractos para calcular el área y el perímetro, 
 * que deben ser implementados en las clases que hereden de ella.
 * @author Ivan Ocadiz
 */
public abstract class Poligono {

    /**
     * Constructor vacío que crea una instancia de Poligono.
     * Este constructor se usa en las clases derivadas.
     */
    public Poligono() {
    }
    
    /**
     * Método abstracto para calcular el área de un polígono.
     * Las clases que hereden de Poligono deben proporcionar una implementación específica.
     * 
     * @return El área del polígono como un valor de tipo float.
     */
    public abstract float area();

    /**
     * Método abstracto para calcular el perímetro de un polígono.
     * Las clases que hereden de Poligono deben proporcionar una implementación específica.
     * 
     * @return El perímetro del polígono como un valor de tipo float.
     */
    public abstract float perimetro();

    /**
     * Devuelve una representación en cadena de la instancia de Poligono.
     * Este método puede ser sobreescrito en las clases derivadas para mostrar más detalles.
     * 
     * @return Una cadena que representa el polígono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
