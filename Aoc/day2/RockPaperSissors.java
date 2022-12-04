package day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.midi.MetaEventListener;
import javax.xml.stream.EventFilter;

public class RockPaperSissors {

      public static void main(String[] args) throws FileNotFoundException 
      {

        File myObj = new File("C:\\Users\\Ed\\aoc\\day2\\data.txt");

        Scanner myReader = new Scanner(myObj);
        int points = 0;
              
        while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                
                points += calculatePointsWinLoseDraw(data);
                
              
        }

        System.out.println("points = " + points);
       
        myReader.close();       
          
      } 
      
      private static int calculatePoints(String round)
      {
        int roundPoints = 0;
        String elfTry = round.substring(0,1);
        String meTry = round.substring(2,3);

        //win
        if (elfTry.equals("A") && meTry.equals("Y") ) {roundPoints += 6;};
        if (elfTry.equals("B") && meTry.equals("Z") ) {roundPoints += 6;};
        if (elfTry.equals("C") && meTry.equals("X") ) {roundPoints += 6;};

        //draw

        if (elfTry.equals("A") && meTry.equals("X") ) {roundPoints += 3;};
        if (elfTry.equals("B") && meTry.equals("Y") ) {roundPoints += 3;};
        if (elfTry.equals("C") && meTry.equals("Z") ) {roundPoints += 3;};

        //points
        if(meTry.equals("X")) {roundPoints += 1;};
        if(meTry.equals("Y")) {roundPoints += 2;};
        if(meTry.equals("Z")) {roundPoints += 3;};
      
        System.out.println("round score " + roundPoints);
       

        return roundPoints;
      }

      private static int calculatePointsWinLoseDraw(String round)
      {
        int roundPoints = 0;
        String elfTry = round.substring(0,1);
        String meTry = round.substring(2,3);

        // x lose
        // y draw
        // z win

        //lose
        if(meTry.equals("X")){
          roundPoints += 0;

          if(elfTry.equals("A")) roundPoints += 3;
          if(elfTry.equals("B")) roundPoints += 1;
          if(elfTry.equals("C")) roundPoints += 2;

        }

        // y draw
        if(meTry.equals("Y")){
          roundPoints += 3;

          if(elfTry.equals("A")) roundPoints += 1;
          if(elfTry.equals("B")) roundPoints += 2;
          if(elfTry.equals("C")) roundPoints += 3;

        }

        // z win
        if(meTry.equals("Z")){
          roundPoints += 6;

          if(elfTry.equals("A")) roundPoints += 2;
          if(elfTry.equals("B")) roundPoints += 3;
          if(elfTry.equals("C")) roundPoints += 1;

        }


      
        


      
      
        System.out.println("round score " + roundPoints);
       

        return roundPoints;
      }
}
