//Demo of file IO stream
// Write a program that reads content form a text input file and 
//write it to another file along with the line numbers and user msg
import java.io.FileReader; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; 

public class FileDemo{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		// standard input stream to read from user
		System.out.print("Enter the name of Input file: ");
		String inFile = console.next();
		
		System.out.print("Enter the name of file for saving: ");
		String outFile = console.next(); 
		
//Create File IOStreams
		try{
			//Fileinput stream
			FileReader reader = new FileReader(inFile); 
			Scanner in = new Scanner(reader); 
			
			//File output Stream
			PrintWriter out = new PrintWriter(outFile);
			
			int lineNumber = 1;
			while (in.hasNextLine()){
				String line = in.nextLine();
				//print to file
				out.println("/* " + lineNumber + " */ " + line);
				// print to console
				System.out.println("/* " + lineNumber + " */ " + line);
				lineNumber++;
			}
			out.println(console.nextLine());
			out.println("The msg from user:"+console.nextLine());
			// close both Streams
			in.close();
			out.close();
			console.close();
			} 
		catch (IOException exception){
				  System.out.println("Error processing file: " 	+ exception);
		}
	}
} 
