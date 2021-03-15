package Manipulacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void  main (String[] args ){

        File myFile;
        myFile = new File("filename4.txt");
        createFile(myFile);
        writeContent(myFile, "hola mundo" );

    }

    public static void createFile(File myFile){
        try {
            if (myFile.createNewFile()){
                System.out.println("File create: " + myFile.getName());
            }
        }catch (IOException e){
            System.out.println("AN error occurred: " + e.getMessage());
        } finally{

        }

    }

    public static void writeContent(File myFile, String contents){
        FileWriter writer = null;

        try {
            writer = new FileWriter(myFile);
            writer.write(contents);

            writer.close();
        } catch(IOException e){
            System.out.println("AN error occurred while writing: " + e.getMessage());
        }
    }


}
