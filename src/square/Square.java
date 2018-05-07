/*
 * To square the number from 0 to 9, using the square arraylist method.
 * Siwen Huang
 * May, 7, 2018
 */

package square;
import java.util.*;
/**
 *
 * @author sihua0624
 */
public class Square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> square = new ArrayList();
        Collections.addAll(square,"0","1","4","9","16","25","36","49","64","81");
        System.out.println("Squares ArrayList\n**************\n");
        for (int i = 0; i < 10; i++)  {
            System.out.println("Number:"+i+" "+"Square:"+square.get(i));
        }    
    } 
}
