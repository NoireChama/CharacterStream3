
package characterstream3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args){

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(in);
        try {
            System.out.print("Enter name: ");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("Enter age: ");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
