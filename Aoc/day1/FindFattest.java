package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindFattest {
  
      // main driver method
      public static void main(String[] args) throws Exception
      {
        int calories = 0;
        int elf = 1;
        int maxCalories = 0;
        int fattestElf = 0;
  
        File myObj = new File("C:\\Users\\Ed\\aoc\\day1\\text.txt");

        Scanner myReader = new Scanner(myObj);
              
        while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
  
                if (data != ""){ 
                  calories += Integer.parseInt(data);
                }
                else{
                  if(calories > maxCalories){           
                    maxCalories = calories;
                    fattestElf = elf;                
                  }
                  System.out.println(" Elf " + elf);
                  System.out.println(" calories " + calories); 

                  calories = 0;
                  elf ++;               
                }        
              }
              System.out.println(" Elf " + elf);
              System.out.println(" calories " + calories); 
              myReader.close();
  
              System.out.println("fattest Elf " + fattestElf +" Calories " + maxCalories);           
      }



    }
  


  

