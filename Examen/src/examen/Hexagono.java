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
public class Hexagono implements Poligono {

    double side;
    double radio;
    double aphotem;
    public Hexagono(double Side, double Radio)
    {
        this.side = Side;
        this.radio = Radio;
    }
    @Override
    public double area() {
        aphotem = Math.sqrt(Math.pow(radio,2)-Math.pow(side, 2));
        return (perimeter()*aphotem)/2;
    }

    @Override
    public double perimeter() {
        double perimeter; 
        perimeter = 6*side;
        return perimeter; 
    }
    
}
