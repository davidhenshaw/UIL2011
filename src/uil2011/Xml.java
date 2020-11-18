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
public class Xml {
    
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/xml.dat"));
        int sets = Integer.parseInt(scan.nextLine().trim());
        int set = 0;
        
        while(set < sets)
        {
            Stack<String> tagStack = new Stack<>();            
            int lines = Integer.parseInt(scan.nextLine().trim());
            boolean isValid = true;
            for(int i = 0; i < lines; i++)
            {
                String s = scan.nextLine().trim();
                if(s.startsWith("</"))
                {
                    String temp = s.substring(2, s.length()-1);
                    if(temp.equals(tagStack.peek()))
                    {
                        tagStack.pop();
                    }
                    else
                    {
                        isValid = false;
                    }
                }
                else
                if(s.startsWith("<"))
                {
                    String temp = s.substring(1, s.length()-1);
                    tagStack.push(temp);
                }
            }
            
            String ret = isValid ? "valid" : "invalid";
            
            System.out.println(ret);
            set++;
        }
    }
}
