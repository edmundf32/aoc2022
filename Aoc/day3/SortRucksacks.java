package day3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class SortRucksacks {

      public static void main(String[] args) throws FileNotFoundException 
      {

        File myObj = new File("C:\\Users\\Ed\\aoc\\day3\\data.txt");

        Scanner myReader = new Scanner(myObj);
        int points = 0;
              
        while (myReader.hasNextLine()) {
                String data = myReader.nextLine();   
              
                String rucksack1 = data.substring(0,data.length()/2);
                String rucksack2 = data.substring(data.length()/2, data.length());

                char common = FindCommonLetter(rucksack1, rucksack2);

                System.out.println(common);
                System.out.println(GetValue(common));

                points += GetValue(common);

    
        }



        System.out.println("points = " + points);
       
        myReader.close();       
          
        }

        private static int GetValue(char input){
            if(Character.isUpperCase(input)){
                return (int)input -38;
            }
            else{
                return (int)input -96;
            }
        }


        private static char FindCommonLetter(String rucksack1, String rucksack2)
        {
            while(rucksack1.length() !=0)
            {
                for (int i = 0; i < rucksack2.length(); i++)
                {
                    if(rucksack1.charAt(0) == rucksack2.charAt(i) ) return rucksack2.charAt(i);
                }

                rucksack1 = rucksack1.substring(1, rucksack1.length());
                
            }

            return '!';    

        }




    }