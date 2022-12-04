package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindOverlap {

    public static void main (String args[]) throws FileNotFoundException
    {    
        File myObj = new File("C:\\Users\\Ed\\aoc\\day4\\data.txt");

    Scanner myReader = new Scanner(myObj);
    int points = 0;
    
  
    
    while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            List<String> areas = Arrays.asList(data.split(","));


            List<String> area1 = Arrays.asList(areas.get(0).split("-"));
            List<String> area2 = Arrays.asList(areas.get(1).split("-"));

            //System.out.println(area1);
            //System.out.println(area2);


            // if area 1 is in area 2
            if(Integer.parseInt(area1.get(0)) <= Integer.parseInt(area2.get(0)) && Integer.parseInt(area1.get(1)) >= Integer.parseInt(area2.get(1)) )
            {
                points++;
                System.out.println("1 in 2 " + areas);
            }

            // if area 2 is in area 1
            else if(Integer.parseInt(area2.get(0)) <= Integer.parseInt(area1.get(0)) && Integer.parseInt(area2.get(1)) >= Integer.parseInt(area1.get(1))){
                points++;
                System.out.println("2 in 1 " + areas);
            }

          
                
            



  
    }

    System.out.println("points = " + points);
   
    myReader.close();  

    }
}


    

