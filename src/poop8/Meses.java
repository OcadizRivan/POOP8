/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * Interfaz que define constantes relacionadas con los meses del año.
 * Esta interfaz incluye enteros que representan cada mes del año y un arreglo de cadenas
 * que contiene los nombres de los meses en español.
 * @author Ivan Ocadiz
 */
public interface Meses {

    // Constantes que representan cada mes del año
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6; 
    int SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;

    // Arreglo de cadenas que contiene los nombres de los meses en español, donde el índice 
    // corresponde al valor numérico del mes (MESES[1] = "enero", MESES[2] = "febrero", etc.).
    String[] MESES = {
        "", "enero", "febrero", "marzo", "abril", "mayo", "junio", 
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
}
