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
public class Triangulo implements Poligono {

    
    public int sideA;
    public int sideB;
    public int sideC;
    public int heigth;
    public int base;

    Triangulo(int sideA, int sideB, int sideC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public double area() {
        int result = (sideA+sideB+sideC)/2;
        double show =  Math.sqrt(result*(result-sideA)*(result-sideB)*(result-sideC));
 
        return show;
    }

    @Override
    public double perimeter() {
       int perimeter = sideA+sideB+sideC;
       return perimeter; 
    }
    
}
