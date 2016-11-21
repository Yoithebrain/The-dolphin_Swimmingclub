package com.company;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by jakob on 20-11-2016.
 */
public class FileWrite {

    private String filename;

    private PrintStream out;



    public FileWrite(String filename) throws FileNotFoundException {
        this.filename = filename;
        out = new PrintStream(this.filename);
    }

    public void writeToFile(ArrayList<String> s){

        out.println(s);

    }

}