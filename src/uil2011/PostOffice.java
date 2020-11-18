/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uil2011;

import java.io.*;
import java.util.*;
import java.lang.System;

/**
 *
 * @author David
 */
public class PostOffice {
    
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/postoffice.dat"));
        int boxes = Integer.parseInt(scan.nextLine());
        double wtLimit = 5;
        double wtBox = 0.4;
        int pkg = 0;
        
        while(pkg < boxes)
        {
            String[] s = scan.nextLine().split(" ");
            double wtTotal = wtBox;
            
            for (String item : s) {
                //pars item as a double with 2 places
                wtTotal += Double.parseDouble(item);
            }
            
            if(wtTotal >= 5)
            {
                System.out.println("OVERWEIGHT");
            }
            else
            {
                System.out.println("OK");
            }
            
            pkg++;
        }
    }
    
}
