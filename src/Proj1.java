/**
 * @file: Proj1.java
 * @description: This class runs the project where it takes the input file and constructs a Parser
 * @author: Chris Cha {@literal <chah22@wfu.edu>}
 * @date: September 17, 2025 (Modified September 24, 2025)
 */
import java.io.FileNotFoundException;

public class Proj1 {
    public static void main(String[] args) throws FileNotFoundException{
        if(args.length != 2){
            System.err.println("Argument count is invalid: " + args.length);
            System.exit(0);
        }
        new Parser(args[0],args[1]);
    }
}