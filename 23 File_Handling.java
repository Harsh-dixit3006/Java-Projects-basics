import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class File_Writer {
    public static void main(String[] args) {
        String filename = "Harsh.txt";
        try(FileWriter newFile = new FileWriter(filename)){
            newFile.write("Hello  Harsh");
            System.out.println("File successfully created");
        }catch (IOException exception){
            System.out.printf("Exception Occurred due to %s",exception.getCause());
        }
    }
}


class File_Reader{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please Enter The file name: ");
        String FileName = input.next();
        try(FileReader newfile= new FileReader(FileName)){
            int read=0;
            do {
                read =newfile.read();
                System.out.print((char) read);
            }while (read!=-1);
        }catch (FileNotFoundException exception){
            System.out.printf("%s not found",FileName);
        }

        catch (IOException exception){
            System.out.printf("Exception occurred due to %s",exception.getCause());
        }
    }
}

