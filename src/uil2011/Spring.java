/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uil2011;

import java.io.*;
import java.util.*;

/**
 *
 * @author David
 */
public class Spring {
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/spring.dat"));
        int student = 0;
        int loops = Integer.parseInt(scan.nextLine().trim());
        
        while(student < loops)
        {
            String[] s = scan.nextLine().trim().split(" ");
            String name = s[0];
            int numTrans = Integer.parseInt(s[1]);
            double total = 0;
            //loop through transactions and add to total
            for(int i = 0; i < numTrans; i++)
            {
                s = scan.nextLine().trim().split(" ");
                for(int j = 0; j < s.length; j++)
                {
                    switch(s[j].charAt(0))
                    {
                        case 'P':
                            total += Integer.parseInt(s[j].substring(1)) * 14 * 0.48;
                            break;
                        case 'T':
                            total += Integer.parseInt(s[j].substring(1)) * 15 * 0.45;
                            break;
                        case 'D':
                            total += Integer.parseInt(s[j].substring(1));
                            break;
                    }
                }
            }
            
            total = 500 - total;
            System.out.print(name + " ");
            if(total >= 0)
            {
                System.out.print("$");
                System.out.printf("%.2f\n", total);
            }
            else
            {
                total *= -1;
                System.out.print("OVER $");
                System.out.printf("%.2f\n", total);
            }
            student++;
        }
    }
    
}
