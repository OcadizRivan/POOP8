/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author Ivan Ocadiz
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Poligono poligono1 = new Poligono();
        Poligono poligono1= new Triangulo();
        System.out.println(poligono1);
        
        
        Triangulo triangulo1 = new Triangulo(60,60,60,5.0f,5.0f,5.0f,5.0f,5.0f);
        System.out.println(triangulo1);
        System.out.println("Area= "+triangulo1.area());

                
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90,90,5,10,5,10,5,10);
        System.out.println(cuadrilatero1);
        System.out.println("Area= "+ cuadrilatero1.area());
        System.out.println("Perimetro= "+ cuadrilatero1.perimetro());
        
        
        //Poligono poligono2 = new Poligono();
        Poligono poligono2 = new Cuadrilatero();
        System.out.println(poligono2);
        
        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);
        poligono2 = triangulo2;
        System.out.println(poligono2);
        
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);
        
        Object object1 = new Object();
        System.out.println(object1);//Referencia de donde se creo la instancia
        
        //Sobreescribir object 1 y meterla en cuadrilatero
        
        object1= cuadrilatero2;
        System.out.println(object1);
        
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        // identificarFiguras(object1);
        
        Flauta flauta = new Flauta();
        System.out.println(flauta);
        flauta.afinar();
        flauta.tocar();
        flauta.tipoDeInstrumento();
                
        System.out.println(Math.PI);
        
        //ACCEDIENDO A INTERFACES
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
        
        
        
    }
    public static void identificarFiguras(Poligono poligono){
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de Triangulo");
        }
        else if (poligono instanceof Cuadrilatero) {
            System.out.println("Instancia de Cuadrilatero");
            
        }
        else{
            System.out.println("Instancia de Poligono");
        }
        
        
        
    }
    
}