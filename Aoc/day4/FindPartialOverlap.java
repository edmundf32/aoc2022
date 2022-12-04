package day4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FindPartialOverlap {

    public int Answer()
    {
        File myObj = new File("C:\\Users\\Ed\\aoc\\day4\\data.txt");

         Scanner myReader = new Scanner(myObj);
        int points = 0;
    
    
        while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                List<String> areas = Arrays.asList(data.split(","));


                List<String> area1 = Arrays.asList(areas.get(0).split("-"));
                List<String> area2 = Arrays.asList(areas.get(1).split("-"));

            
                // if area 1 is below area 2
                if(Integer.parseInt(area1.get(1)) < Integer.parseInt(area2.get(0))  )
                {
                    System.out.println("1 is below 2 " + areas);
                    System.out.println( area1.get(1) + " < " + area2.get(0));
                    points++;
                    
                }

                if(Integer.parseInt(area2.get(1)) < Integer.parseInt(area1.get(0))  )
                {
                    System.out.println("** 2 is below 1" + areas);
                    System.out.println( area2.get(1) + " < " + area1.get(0));
                    points++;

                }

    
        }
        System.out.println("points = " + (1000 - points));

        return 1;
    
        myReader.close();  

    }
    }
    
    
    public static void main (String args[])
    {    
        FindPartialOverlap answer = new FindPartialOverlap();
        System.out.println(answer.Answer());

    //     File myObj = new File("C:\\Users\\Ed\\aoc\\day4\\data.txt");

    //      Scanner myReader = new Scanner(myObj);
    //     int points = 0;
    
  
    
    // while (myReader.hasNextLine()) {
    //         String data = myReader.nextLine();
    //         List<String> areas = Arrays.asList(data.split(","));


    //         List<String> area1 = Arrays.asList(areas.get(0).split("-"));
    //         List<String> area2 = Arrays.asList(areas.get(1).split("-"));

           
    //         // if area 1 is below area 2
    //         if(Integer.parseInt(area1.get(1)) < Integer.parseInt(area2.get(0))  )
    //         {
    //             System.out.println("1 is below 2 " + areas);
    //             System.out.println( area1.get(1) + " < " + area2.get(0));
    //             points++;
                
    //         }

    //         if(Integer.parseInt(area2.get(1)) < Integer.parseInt(area1.get(0))  )
    //         {
    //             System.out.println("** 2 is below 1" + areas);
    //             System.out.println( area2.get(1) + " < " + area1.get(0));
    //             points++;

    //         }

   
    // }
    // System.out.println("points = " + (1000 - points));
   
    // myReader.close();  

    }
}
    

