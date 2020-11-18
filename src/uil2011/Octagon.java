/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uil2011;

/**
 *
 * @author David
 */
public class Octagon {
    
    String temp = "";
    int sides;
    
    Octagon(int sides)
    {
        this.sides = sides;
        
        int lineLength = (sides-2)*2 + sides;
        for(int i = 0; i < lineLength; i++)
        {
            temp += " ";
        }
    }
    
    public void printTop()
    {
        String o = temp;
        for(int i = sides-1; i < sides*2-1; i++)
        {
            
        }
        
        for(int i = 0; i < sides; i++)
        {
            System.out.print("x");
        }
        System.out.println();
    }
    
    public void printDiagonals(int side)
    {
        String line = "";
        for(int i = 0; i < side; i++)
        {
        }
    }
    
    public void printBottom(int side)
    {
        for(int i = 0; i < side; i++)
        {
            
        }
    }
    
    public void printSides(int sideLength)
    {
        
    }
    
    public static void main(String args[])
    {
        
    }
    
}
