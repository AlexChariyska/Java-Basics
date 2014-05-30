import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromTextFile {

	public static void main(String[] args) {
		// Problem 8: Write a program to read a text file "Input.txt" holding a
		// sequence of integer numbers, each at a separate line. Print the sum
		// of the numbers at the console. Ensure you close correctly the file in
		// case of exception or in case of normal execution. In case of
		// exception (e.g. the file is missing), print "Error" as a result.

		String fileName = "Input.txt";

		String line = null;
		double sum=0;

        try {

            FileReader fileReader = 
                new FileReader(fileName);


            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	double num= Double.parseDouble(line);
            	sum+=num;
            }	

System.out.printf("The sum is: %.2f%n",sum);
            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Error-Unable to open file '" + 
                fileName + "'");				
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");					
        }
    }
}
