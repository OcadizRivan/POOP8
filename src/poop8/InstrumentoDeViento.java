/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un Instrumento de Viento, el cual implementa la interfaz InstrumentoMusical.
 * Define los comportamientos específicos para tocar, afinar y describir el tipo de este instrumento.
 * @author Ivan Ocadiz
 */
public class InstrumentoDeViento extends Object implements InstrumentoMusical {

    /**
     * Constructor vacío que crea una instancia de InstrumentoDeViento.
     */
    public InstrumentoDeViento() {
    }

    /**
     * Implementación del método tocar de la interfaz InstrumentoMusical.
     * Este método imprime un mensaje indicando que se está tocando el instrumento de viento.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento musical de viento");
    }

    /**
     * Implementación del método tipoDeInstrumento de la interfaz InstrumentoMusical.
     * Este método devuelve una cadena que describe este instrumento como uno de viento.
     * 
     * @return Una cadena que describe el instrumento como "Instrumento de Viento".
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("");
        return "Instrumento de Viento";
    }

    /**
     * Implementación del método afinar de la interfaz InstrumentoMusical.
     * Este método imprime un mensaje indicando que se está afinando el instrumento de viento.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    /**
     * Devuelve una representación en cadena de la instancia de InstrumentoDeViento.
     * 
     * @return Una cadena que representa el objeto InstrumentoDeViento.
     */
    @Override
    public String toString() {
        return "InstrumentoDeViento{}";
    }
}
