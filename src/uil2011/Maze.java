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
public class Maze {
    static char exit = 'E';
    static char start = 'S';
    static char path = '.';
    static char wall = '#';   
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("src/uil2011/maze.dat"));
        int numLoops = scan.nextInt();
        int MAZE_WIDTH = 19;
        int MAZE_HEIGHT = 20;
        int curLoop = 0;
        int startLine = 0;
        
        scan.nextLine();
        String prevLine = scan.nextLine();
        String line = "";
        
        while(curLoop < numLoops)
        {
            boolean pathFound = false; 
            
            for(int row = 0; row < MAZE_HEIGHT; row++)
            {//search line for a walkable path
                line = scan.nextLine();
                for(int col = 0; col < MAZE_WIDTH; col++)
                {
                    if(IsWalkableChar(line.charAt(col)) && IsWalkableChar(prevLine.charAt(col)))
                    {
                        //Path from previous line to this line is walkable
                        //start next line
                        pathFound = true;
                        break;
                    }
                }
                
                if(!pathFound)
                {
                    System.out.println("Maze #" + curLoop + ": NO");
                    break;
                }
                prevLine = line;
                line = scan.nextLine();
            }
            
            if(pathFound)
            {
                System.out.println("Maze #" + curLoop + ": YES");
                //Read the blank line between the next maze
                scan.nextLine();
            }
            curLoop++;
        }
    }
    
    public static boolean IsWalkableChar(char c)
    {
        return c == path || c == start || c == exit;
    }
    
}
