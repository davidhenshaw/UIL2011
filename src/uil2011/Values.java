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
public class Values {
    
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/values.dat"));
        int loops = Integer.parseInt(scan.nextLine().trim());
        int phrase = 0;
        String[] list = new String[loops];
         //loop though all phrases
        while(phrase < loops)
        {
            int value = 0;
            //read the phrase
            String s = scan.nextLine();
            //calculate its value and store as key value pair
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) < 'A')
                    continue;
                
                value += s.charAt(i)- 'A' + 1;
            }
           
            String str = "0000000000" + Integer.toString(value);
            
            list[phrase] = str.substring(str.length() - 10) + " " + s;
            //store in array and quicksort at the same time
            //if the value is the same, sort based on alphabetical order
            phrase++;
        }
        
        //put all key value pairs in a sorted array
        Arrays.sort(list);
        //for each key value pair
            //print value then phrase
        
        for(int i = 0; i < list.length; i++)
        {
            String[] s = list[i].split(" ", 2);
            
            int val = Integer.parseInt(s[0]);
            System.out.println(val + " " + s[1]);
        }
    }
}
