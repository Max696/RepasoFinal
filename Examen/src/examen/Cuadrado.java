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
public class Cuadrado extends Cuadrilater {
    // tecnically it works for rectangles too 
    public Cuadrado(double f1, double f2) {
        super(f1, f2);
    }
    
    public double area()
    {
        double total = face1*face2;
        return total;
    }
    public double perimeter()
    {
        double total = 2*face1+2*face2;
        return total;
    }
}
