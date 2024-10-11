/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * Interfaz que representa un Instrumento Musical. Define los métodos necesarios 
 * que debe implementar cualquier clase que represente un instrumento musical.
 * @author Ivan Ocadiz
 */
public interface InstrumentoMusical {

    /**
     * Método para tocar el instrumento musical. 
     * Las clases que implementen esta interfaz deben definir el comportamiento 
     * específico de cómo se toca el instrumento.
     */
    void tocar();

    /**
     * Obtiene el tipo de instrumento musical.
     * Este método devuelve una cadena que describe el tipo de instrumento 
     * (por ejemplo, cuerda, viento, percusión, etc.).
     * 
     * @return Una cadena que describe el tipo de instrumento musical.
     */
    String tipoDeInstrumento();

    /**
     * Método para afinar el instrumento musical. 
     * Las clases que implementen esta interfaz deben definir cómo se afina 
     * el instrumento en particular.
     */
    void afinar();
}
