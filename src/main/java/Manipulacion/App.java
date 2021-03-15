package Manipulacion;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.io.*;

public class App {
    public static void  main (String[] args ){

        File myFile;
        myFile = new File("filename.txt");
        createFile(myFile);
        writeContent(myFile, "que paso master" );
        Route(myFile);
        ReaderFile(myFile);

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

    public static void Route(File targetFile){
        try {
            System.out.println("route: " + targetFile.getName() + targetFile.getAbsolutePath());
        } catch (SecurityException e) {
            System.out.println("AN error occurred: " + e.getMessage());
        }
    }

    public static void ReaderFile(File targetFile){
        FileReader reader = null;
        BufferedReader buffer = null;

        try{
            reader = new FileReader(targetFile);
            buffer = new BufferedReader(reader);

            String line;
            System.out.println("reader." + targetFile.getName());

            while((line=buffer.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error alert" + e.getMessage());
        }finally{
            try{
                if( null != reader ){
                    reader.close();
                }
            }catch (Exception e1){
                System.out.println("Error reader" + e1.getMessage());
            }
        }
    }
}
