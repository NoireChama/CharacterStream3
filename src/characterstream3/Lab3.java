package characterstream3;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab3 {
    
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println("19");
            output.println("60.5");
            output.println("175.0");
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileReader file = new FileReader("data.txt");
                 BufferedReader input = new BufferedReader(file);
                 String s;
                while ((s=input.readLine())!= null){
                System.out.println(s);
                }

 } catch (FileNotFoundException ex) {
Logger.getLogger(CharacterStream3.class.getName()).log(Level.SEVERE, null, ex);
}catch (IOException ex) {
Logger.getLogger(CharacterStream3.class.getName()).log(Level.SEVERE, null, ex);
 }
    }
    
}
