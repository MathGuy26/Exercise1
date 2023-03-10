import java.io.File;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){  // entry point of program
        File myText = new File("src/random.txt"); // initialize random.txt file object
        //System.out.println(myText.getAbsoluteFile());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to search for: ");
        String wordChoice = sc.next(); // search for user chosen word
        boolean found = false;
        try (Scanner fileScanner = new Scanner(myText)) {
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.contains(wordChoice)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occurred while reading textfile: " + e.getMessage());

        }
        if (found) {
            System.out.println("The word " + wordChoice + " was found in the file 'random.txt'");

        }else {
            System.out.println("The word " + wordChoice + " was not found in the file 'random.txt'");
        }

    }
}

