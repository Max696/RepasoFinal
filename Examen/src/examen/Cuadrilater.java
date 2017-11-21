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
//mistake in name xD 
public class Cuadrilater {
    double face1, face2;
    public Cuadrilater(double f1, double f2)
    {
        this.face1 = f1;
        this.face2=f2;
    }
    public double area()
    {
        double total = face1*face2;
        return total;
    }
    public double perimeter()
    {
        double total = 2*(face1+face2);
        return total;
    }
    
    
}
