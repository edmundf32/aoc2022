import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindSignal {

    
    private  static String input;

    public static void main(String args[]) throws IOException 
    {
        //("C:\\Users\\Ed\\aoc2022\\Aoc\\day6\\data.txt");
        Path path = Path.of("C:\\Users\\Ed\\aoc2022\\Aoc\\day6\\data.txt");
        input = Files.readString(path);

        System.out.println(part1());
        System.out.println(part2());
    }

    public static int part1() {
        return task(4);
    }

    public static int part2() {
        return task(14);
    }

    private static int task(int amountOfChars) {
        for (int i = 0; i < input.toCharArray().length; i++)
            if (input.substring(i, i + amountOfChars).chars().distinct().count() == amountOfChars)
                return i + amountOfChars;
        return -1;
    }

    
    }

      
        
