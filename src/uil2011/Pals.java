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
public class Pals {
    
    public static boolean isPalPal(int value)
    {
        String s = Integer.toString(value);
        int lp = 0;
        int rp = s.length() - 1;
        boolean isPal = true;
        
        while(lp <= rp)
        {
            if(s.charAt(lp) != s.charAt(rp))
            {
                isPal = false;
                break;
            }
            lp++;
            rp--;
        }
        
        return isPal;
    }
    
    public static void main(String args[])
    {
        int m = 13;
        int d = 5;
        int palPalCount = 0;
        
        long smallestPal = (long)Math.pow(10, d-1);
        int factor = (int)Math.floor(smallestPal/m);
        
        while(m * factor < Math.pow(10, d) - 1)
        {
            if(isPalPal(m*factor))
            {
                palPalCount++;
            }
            factor++;
        }
        System.out.println(palPalCount);        
    }
    

    //divide largest d digit number by m to find largest possible multiplicand 
    
    //while( product of multiplicand and m has d digits )
        //check if product is palindrome
            //increment counter
    
}
