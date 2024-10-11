/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un Triángulo, el cual hereda de la clase Poligono.
 * Esta clase permite definir un triángulo con sus ángulos y lados, así como 
 * calcular su área y perímetro.
 * @author Ivan Ocadiz
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma; // Ángulos del triángulo en grados
    private float a, b, c; // Lados del triángulo
    private float base, altura; // Base y altura del triángulo para el cálculo de área

    /**
     * Constructor vacío que crea una instancia de Triangulo sin valores iniciales.
     */
    public Triangulo() {
    }
    
    /**
     * Constructor llleno que permite inicializar un triángulo con todos sus atributos.
     * 
     * @param alfa Ángulo alfa del triángulo en grados.
     * @param beta Ángulo beta del triángulo en grados.
     * @param gamma Ángulo gamma del triángulo en grados.
     * @param a Longitud del lado a del triángulo.
     * @param b Longitud del lado b del triángulo.
     * @param c Longitud del lado c del triángulo.
     * @param base Longitud de la base del triángulo.
     * @param altura Altura correspondiente a la base del triángulo.
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

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
     * Obtiene el valor del ángulo gamma.
     * 
     * @return El valor del ángulo gamma en grados.
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Establece el valor del ángulo gamma.
     * 
     * @param gamma El valor del ángulo gamma en grados.
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Obtiene la longitud del lado a del triángulo.
     * 
     * @return La longitud del lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Establece la longitud del lado a del triángulo.
     * 
     * @param a La longitud del lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene la longitud del lado b del triángulo.
     * 
     * @return La longitud del lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Establece la longitud del lado b del triángulo.
     * 
     * @param b La longitud del lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene la longitud del lado c del triángulo.
     * 
     * @return La longitud del lado c.
     */
    public float getC() {
        return c;
    }

    /**
     * Establece la longitud del lado c del triángulo.
     * 
     * @param c La longitud del lado c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene la base del triángulo.
     * 
     * @return La base del triángulo.
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del triángulo.
     * 
     * @param base La base del triángulo.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triángulo.
     * 
     * @return La altura del triángulo.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triángulo.
     * 
     * @param altura La altura del triángulo.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo utilizando la fórmula: (base * altura) / 2.
     * 
     * @return El área del triángulo.
     */
    @Override
    public float area() {
        return (base * altura) / 2;
    }

    /**
     * Calcula el perímetro del triángulo sumando la longitud de sus lados: a + b + c.
     * 
     * @return El perímetro del triángulo.
     */
    @Override
    public float perimetro() {
        return a + b + c;
    }

    /**
     * Devuelve una representación en cadena de la instancia de Triangulo, incluyendo 
     * todos sus atributos.
     * 
     * @return Una cadena con los valores de los atributos del triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
