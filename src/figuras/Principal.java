/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author leonardo
 */
public class Principal {
    public static void main(String[] args) {
       Rectangulo rectangulo=new Rectangulo(4, 6);
        double area= rectangulo.area();
        double perimetro= rectangulo.perimetro();
        System.out.println("El area del rectangulo es:" + area+"\n y su perimetro es: "+perimetro);
        
        Triangulo triangulo=new Triangulo(4, 6);
        double area1= triangulo.area();
        double perimetro1=triangulo.perimetro();
        System.out.println("El area del triangulo es:" + area1+"\n y su perimetro es: "+perimetro1);
        
        Circulo circulo=new Circulo(4);
        double area2=circulo.area();
        double perimetro2=circulo.perimetro();
        System.out.println("El area del triangulo es:" + area2+"\n y su perimetro es:" +perimetro2);

    }
    
}
