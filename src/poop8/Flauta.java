/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa una Flauta, la cual es un tipo de Instrumento de Viento.
 * Esta clase sobrescribe los métodos para tocar, afinar y describir el tipo 
 * específico de este instrumento. 
 * @author Ivan Ocadiz
 */
public class Flauta extends InstrumentoDeViento {

    /**
     * Constructor vacío que crea una instancia de Flauta.
     */
    public Flauta() {
    }

    /**
     * Sobrescribe el método afinar de la clase InstrumentoDeViento.
     * Este método imprime un mensaje indicando que se está afinando la flauta.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }

    /**
     * Sobrescribe el método tipoDeInstrumento de la clase InstrumentoDeViento.
     * Este método devuelve una cadena que describe este instrumento como una flauta.
     * 
     * @return Una cadena que describe el instrumento como "Flauta".
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }

    /**
     * Sobrescribe el método tocar de la clase InstrumentoDeViento.
     * Este método imprime un mensaje indicando que se está tocando la flauta.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }

    /**
     * Devuelve una representación en cadena de la instancia de Flauta.
     * 
     * @return Una cadena que representa el objeto Flauta.
     */
    @Override
    public String toString() {
        return "Flauta{}";
    }
}

