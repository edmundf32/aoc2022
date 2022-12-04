package day5;

import java.io.FileNotFoundException;
import java.util.Scanner;

import Utility.FileInput;

public class TestUtility {

    FileInput helper = new FileInput();


    public static void main(String args []) throws FileNotFoundException
    {
        TestUtility run = new TestUtility();
        Scanner scan2 = run.helper.GetData("C:\\Users\\Ed\\aoc\\Aoc\\day4\\data.txt");
        run.returnText();
        
    }



    public void returnText()
    {
        System.out.println( "some text");        
    }
    
}
