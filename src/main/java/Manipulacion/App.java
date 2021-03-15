package Manipulacion;

import java.in.File;

public class App {
    public static void  main (String[] args ){

        File myFile;
        myFile = new File("filename3.txt");
        createFile(myFile);
        writeContent(myFile, "hola mundo" );

    }

    public static void createFile(File myFile){
        try {
            if (myFile.createNewFile()){
                System.out.println("File create: " + myFile.getName());
            }
        }catch (IDException e){
            System.out.println("AN error occurred: " + e.getMessage());
        }

    }


}
