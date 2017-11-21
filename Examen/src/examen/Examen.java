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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         cifradoCesar s = new cifradoCesar();
        
      
       String show ; 
        show = s.cifradoCesar("DIAQ", 4);
      // show = s.letterToNumber('H');
        System.out.println(show);
        
        ManoCartas tryA= new ManoCartas();
        tryA.agregarCarta(7, "diamante");
        tryA.agregarCarta(5, "corazon");
        tryA.agregarCarta(8,"trebol");
        tryA.agregarCarta(4, "espada");
        
        tryA.jugar("espada");
        tryA.Extraida();
    }
    
}
