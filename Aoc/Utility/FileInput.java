package Utility;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileInput {
    
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public Scanner GetData (String fileName) throws FileNotFoundException
    {    
        File myObj = new File(fileName);

        Scanner myReader = new Scanner(myObj);

        return myReader;

    }
}
