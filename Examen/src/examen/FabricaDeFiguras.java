/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ROG
 */
public class FabricaDeFiguras {
    public void crearFigura4(double side1, double side2 )
    {
        Cuadrado squareOrRectangle = new Cuadrado(side1,side2);
        Cuadrilater nc= new Cuadrilater(side1,side2);
        
        System.out.println("Area cuadilatero"+squareOrRectangle.area());
        System.out.println("Perimetro cuadilatero"+squareOrRectangle.perimeter());
        
        
    }
    public void triangulo(int sideA,int sideB, int sideC)
    {
        Triangulo triangle = new Triangulo(sideA,sideB,sideC);
          System.out.println("Area Triangulo"+triangle.area());
        System.out.println("Perimetro Triangulo"+triangle.perimeter());
        
    }
    public void crearPoligono(double side1, double side2)
    {
        Hexagono hex = new Hexagono(side1, side2);
        Octagono octa= new Octagono(side1, side2);
           System.out.println("Area Hexagono"+hex.area());
        System.out.println("Perimetro Hexagono"+hex.perimeter());
        
        
           System.out.println("Area Ocatagono"+octa.area());
        System.out.println("Perimetro Octagono"+octa.perimeter());
    }
    
    
}
