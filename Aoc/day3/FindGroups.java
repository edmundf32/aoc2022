package day3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FindGroups {

    public static void main(String args [])throws FileNotFoundException {

        File myObj = new File("C:\\Users\\Ed\\aoc\\day3\\data.txt");

        Scanner myReader = new Scanner(myObj);
        int points = 0;
        
        int line = 0;
        String group ="";
        
        while (myReader.hasNextLine()) {
                String data = myReader.nextLine();  
                data = removeDuplicate(data.toCharArray(), data.length()); 
                System.out.println("line " + line + " data " + data);
                group += data;
                line +=1;
              
                if( line == 3) { 
                    System.out.println("group" + '\n');
                    char charArray[] = group.toCharArray();
                    Arrays.sort(charArray);
                    System.out.println(charArray);
                    System.out.print("BADGE - " + Findbadge(charArray) + " value " + GetValue(Findbadge(charArray)) + '\n'); 
                    points += GetValue(Findbadge(charArray));
                    line = 0; 
                    group = "";
                }  
        }

        System.out.println("points = " + points);
       
        myReader.close();   

    }

    private static char Findbadge(char[] input)
    {
        for(int i = 0; i < input.length; i++)
        {
            if ( input[i] == input[i+1] && input[i+1] == input[i+2] ){
                return input[i];
            }
        }

        return '!';
    }

    private static int GetValue(char input){
        if(Character.isUpperCase(input)){
            return (int)input -38;
        }
        else{
            return (int)input -96;
        }
    }


    private static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
    
}
