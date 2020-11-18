/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uil2011;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author David
 */
public class Rattle {
    
    public static char[][] Matrixize(String message)
    {
        //as long as the message wasn't trimmed it should have a square number of characters already
        int mtxSize = (int)Math.sqrt(message.length());
        char[][] ret = new char[mtxSize][mtxSize];
        //Populate the matrix line by line
            for(int row = 0; row < mtxSize; row++)
            {
                for(int col = 0; col < mtxSize; col++)
                {
                    ret[row][col] = message.charAt(col + row*mtxSize);
                }
            }
        return ret;
    }
    
    public static String Dematrixize(char[][] matrix)
    {
        String ret = "";
        int mtxSize = matrix.length;
        
        for(int row = 0; row < mtxSize; row++)
        {
            ret += String.valueOf(matrix[row]);
            //System.out.print(out);
        }
        return ret;
    }
    
    public static char[][] ShiftColDown(char[][]in, int col)
    {
        //column number start from one
        //therefore columns 0, 2, 4 etc will be treated as odd
        int mtxSize = in.length;
        //get the last character in the row;
        char replacementChar = in[mtxSize-1][col];
        //populate temporary column
        for(int row = 0; row < mtxSize; row++)
        {
            char temp = in[row][col];
            in[row][col] = replacementChar;
            replacementChar = temp;
        }
        
        return in;
    }
    
    public static char[][] ShiftColUp(char[][]in, int col)
    {
                //column number start from one
        //therefore columns 0, 2, 4 etc will be treated as odd
        int mtxSize = in.length;
        //get the last character in the row;
        char replacementChar = in[0][col];
        //populate temporary column
        for(int row = mtxSize-1; row >= 0; row--)
        {
            char temp = in[row][col];
            in[row][col] = replacementChar;
            replacementChar = temp;
        }
        
        return in;
    }
    
    public static char[][] Unrattle(char[][] in)
    {
        //column number start from one
        //therefore columns 0, 2, 4 etc will be treated as odd
        int mtxSize = in.length;
        //get the last character in the row;
        char replacementChar = in[mtxSize-1][0];
        char[][] ret = in;
        //populate temporary column
        for(int col = 0; col < mtxSize; col++)
        {
            if(col % 2 == 0 || col == 0)
            {
                ret = ShiftColUp(ret, col);
            }
            else
            {
                ret = ShiftColDown(ret, col);
            }
        }
        
        return ret;
    }
    
    public static String RemoveJunkLetters(String s, char token)
    {
        String ret = s;
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == token)
            {
                ret = s.substring(0, i);
            }
        }
        
        return ret;
    }
    
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(new File("src/uil2011/rattle.dat"));
        int loops = Integer.parseInt(scan.nextLine().trim());
        
        for(int i = 0; i < loops; i++){
            String decoded = "";
            String rawMsg = scan.nextLine();
            
            char[][] matrixMsg = Matrixize(rawMsg);
            matrixMsg = Unrattle(matrixMsg);
            
            decoded = Dematrixize(matrixMsg);
            System.out.println(RemoveJunkLetters(decoded, '*'));
        }
    }
}
