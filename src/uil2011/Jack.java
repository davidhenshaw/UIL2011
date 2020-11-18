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
public class Jack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/uil2011/jack.dat"));
        boolean skip = true;
        while(scanner.hasNext())
        {
            if(skip)
            {
                scanner.nextLine();
                skip = false;
            }
            else
            {
                System.out.println(scanner.nextLine());
                skip = true;
            }
        }
        
        
    }
    
}
