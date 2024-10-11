/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un Cuadrilátero, el cual hereda de la clase Poligono.
 * Esta clase permite definir un cuadrilátero con sus ángulos y lados, así como 
 * calcular su área y perímetro.
 * @author Ivan Ocadiz
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta; // Ángulos opuestos del cuadrilátero en grados
    private float a, b, c, d; // Lados del cuadrilátero
    private float base, altura; // Base y altura del cuadrilátero para el cálculo de área

    /**
     * Constructor vacío que crea una instancia de Cuadrilatero sin valores iniciales.
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor lleno que permite inicializar un cuadrilátero con todos sus atributos.
     * 
     * @param alfa Ángulo alfa del cuadrilátero en grados.
     * @param beta Ángulo beta del cuadrilátero en grados.
     * @param a Longitud del lado a del cuadrilátero.
     * @param b Longitud del lado b del cuadrilátero.
     * @param c Longitud del lado c del cuadrilátero.
     * @param d Longitud del lado d del cuadrilátero.
     * @param base Longitud de la base del cuadrilátero.
     * @param altura Altura correspondiente a la base del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }
    
    // Getters y Setters

    /**
     * Obtiene el valor del ángulo alfa.
     * 
     * @return El valor del ángulo alfa en grados.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el valor del ángulo alfa.
     * 
     * @param alfa El valor del ángulo alfa en grados.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el valor del ángulo beta.
     * 
     * @return El valor del ángulo beta en grados.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el valor del ángulo beta.
     * 
     * @param beta El valor del ángulo beta en grados.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene la longitud del lado a del cuadrilátero.
     * 
     * @return La longitud del lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Establece la longitud del lado a del cuadrilátero.
     * 
     * @param a La longitud del lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene la longitud del lado b del cuadrilátero.
     * 
     * @return La longitud del lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Establece la longitud del lado b del cuadrilátero.
     * 
     * @param b La longitud del lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene la longitud del lado c del cuadrilátero.
     * 
     * @return La longitud del lado c.
     */
    public float getC() {
        return c;
    }

    /**
     * Establece la longitud del lado c del cuadrilátero.
     * 
     * @param c La longitud del lado c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene la longitud del lado d del cuadrilátero.
     * 
     * @return La longitud del lado d.
     */
    public float getD() {
        return d;
    }

    /**
     * Establece la longitud del lado d del cuadrilátero.
     * 
     * @param d La longitud del lado d.
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Obtiene la base del cuadrilátero.
     * 
     * @return La base del cuadrilátero.
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del cuadrilátero.
     * 
     * @param base La base del cuadrilátero.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del cuadrilátero.
     * 
     * @return La altura del cuadrilátero.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cuadrilátero.
     * 
     * @param altura La altura del cuadrilátero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del cuadrilátero sumando la longitud de sus cuatro lados: a + b + c + d.
     * 
     * @return El perímetro del cuadrilátero.
     */
    @Override
    public float perimetro() {
        return a + b + c + d;
    }

    /**
     * Calcula el área del cuadrilátero utilizando la fórmula: base * altura.
     * 
     * @return El área del cuadrilátero.
     */
    @Override
    public float area() {
        return base * altura;
    }

    /**
     * Devuelve una representación en cadena de la instancia de Cuadrilatero, 
     * incluyendo todos sus atributos.
     * 
     * @return Una cadena con los valores de los atributos del cuadrilátero.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}
