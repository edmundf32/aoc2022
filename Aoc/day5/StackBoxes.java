package day5;

import java.io.FileNotFoundException;
import java.text.CollationElementIterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Utility.FileInput;

public class StackBoxes {

    FileInput helper = new FileInput();
    private static List<ArrayList<String>> boxes = new ArrayList<ArrayList<String>>();
    


    private static void FillBoxes()

    {
        //boxes.get(0).add("qqq");
        // boxes.add(new ArrayList<String>(Arrays.asList("N", "Z")));
        // boxes.add(new ArrayList<String>(Arrays.asList("D", "C", "M")));
        // boxes.add(new ArrayList<String>(Arrays.asList("P")));

    //     [P]                 [C] [C]    
    //     [W]         [B]     [G] [V] [V]
    //     [V]         [T] [Z] [J] [T] [S]
    //     [D] [L]     [Q] [F] [Z] [W] [R]
    //     [C] [N] [R] [H] [L] [Q] [F] [G]
    // [F] [M] [Z] [H] [G] [W] [L] [R] [H]
    // [R] [H] [M] [C] [P] [C] [V] [N] [W]
    // [W] [T] [P] [J] [C] [G] [W] [P] [J]
    //  1   2   3   4   5   6   7   8   9 

     boxes.add(new ArrayList<String>(Arrays.asList("F", "R", "W")));
     boxes.add(new ArrayList<String>(Arrays.asList("P", "W","V","D","C","M","H","T")));
     boxes.add(new ArrayList<String>(Arrays.asList("L", "N","Z","M","P")));
     boxes.add(new ArrayList<String>(Arrays.asList("R", "H","C","J")));
     boxes.add(new ArrayList<String>(Arrays.asList("B", "T","Q","H","G","P","C")));
     boxes.add(new ArrayList<String>(Arrays.asList("Z", "F","L","W","C","G")));
     boxes.add(new ArrayList<String>(Arrays.asList("C", "G","J","Z","Q","L","V","W")));
     boxes.add(new ArrayList<String>(Arrays.asList("C", "V","T","W","F","R","N","P")));
     boxes.add(new ArrayList<String>(Arrays.asList("V", "S","R","G","H","W","J")));





    }

    public static void main(String args []) throws FileNotFoundException
    {
        StackBoxes run = new StackBoxes();
        Scanner scan2 = run.helper.GetData("C:\\Users\\Ed\\aoc\\Aoc\\day5\\data.txt");
        FillBoxes();

        System.out.println("---------------");
        System.out.println(boxes);
        System.out.println("---------------");
        while(scan2.hasNextLine())
        {
            moveBoxes(scan2.nextLine());
        }

        System.out.println("**********************************");
        String answer = "";

        for(var box : boxes)
        {
            answer += box.get(0);
        }

        System.out.println(answer);
        System.out.println(boxes);
        System.out.println("end");
        
    }


    public static void moveBoxes(String theMove)
    {
        

        int moves = Integer.parseInt((theMove.split(" ")[1]));
        int sourceStack = Integer.parseInt((theMove.split(" ")[3])) - 1;
        int destinationStack = Integer.parseInt((theMove.split(" ")[5])) - 1;

        List<String> stack = new ArrayList<String>();
        System.out.println(" before move - " + boxes.get(sourceStack));

        for(int i = 0; i < moves; i++)
        {
            
            stack.add((boxes.get(sourceStack).get(0)));

            boxes.get(sourceStack).remove(0); 
            

            
            
            
        }
        Collections.reverse(stack); 

        System.out.println("stack - " + stack); 

        for (var item:stack)
        {
            boxes.get(destinationStack).add(0, item);
        }
        System.out.println("destination - " + boxes.get(destinationStack)); 
        


    }    
}
