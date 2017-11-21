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
public class cifradoCesar {
    
   char alphabet(int position)
    { 
        String alphabetString = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    char [] charAlphabet = alphabetString.toCharArray();
           
            return charAlphabet[position-1];
            
            }
   char specialAlphabet(int position,String alphabet)
    { 
        String alphabetString = alphabet.toUpperCase();
    char [] charAlphabet = alphabetString.toCharArray();
           
            return charAlphabet[position-1];
            
            }
   
    int count= 0;
   int letterToNumber(char letter)
   {
       
       
       String alphabetString = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
       char [] charAlphabet = alphabetString.toCharArray();
       for (int i = 0; i < alphabetString.length(); i++) {
           count = i+1;
           if(letter==charAlphabet[i])
           {
               
               return i+1;
           
           }
           else
           {
               count++;
           }
           
               }
       
     return count;
   }
    int specialLetterToNumber(char letter,String Alphabet)
   {  
       
       
       String alphabetString = Alphabet.toUpperCase();
       char [] charAlphabet = alphabetString.toCharArray();
       for (int i = 0; i < alphabetString.length(); i++) {
           if(letter==charAlphabet[i])
               return i+1;
           else
               count++;
           
               }
       
       return count++;
   }
   String cifradoCesar(String frase, int distancia)
    {
        char [] toCharFrase = frase.toUpperCase().toCharArray();
        int[] fraseNumbers = new int[frase.length()];
        char[] returnFrase = new char[frase.length()];
       
        
        for (int i = 0; i < frase.length()-1; i++) 
        {
            fraseNumbers[i]= letterToNumber(toCharFrase[i]);
        }
        
        for (int i = 0; i < frase.length(); i++) 
        {
            returnFrase[i]= alphabet(fraseNumbers[i]+distancia);
        }
        String show = new String (returnFrase);
        return show.toLowerCase();
         
       
    }
   
   String cifradoCesar(String frase, String alphabet, int distancia)
   {
       char [] toCharFrase = frase.toUpperCase().toCharArray();
        int[] fraseNumbers = new int[frase.length()];
        char[] returnFrase = new char[frase.length()];
       
        
        for (int i = 0; i < frase.length()-1; i++) 
        {
            fraseNumbers[i]= specialLetterToNumber(toCharFrase[i],alphabet);
        }
        
        for (int i = 0; i < frase.length(); i++) 
        {
            returnFrase[i]= specialAlphabet(fraseNumbers[i]+distancia,alphabet);
        }
        String show = new String (returnFrase);
        return show.toLowerCase();
   }
    
}
