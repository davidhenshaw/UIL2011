/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uil2011;
import java.util.*;
import java.io.*;

/**
 *
 * @author David
 */
public class Digicount {
    
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/digicount.dat"));

        
        while(scan.hasNextInt())
        {
            int x = scan.nextInt();
            int[] out = new int[10]; 
            String s = "";
            
            for(int i = 1; i <= x; i++)
            {
                s += Integer.toString(i);
            }
            
            for(int i = 0; i < s.length(); i++)
            {
                int ch = Integer.parseInt(s.charAt(i) + "");
                out[ch] += 1;
            }
            
            for(int i = 0; i < out.length; i++)
            {
                System.out.print(out[i]+" ");
            }
                
            System.out.println();
        }
    }
}
