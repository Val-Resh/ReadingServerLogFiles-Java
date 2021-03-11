import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogRecords {
    private static ArrayList<LogEntry> records = new ArrayList<>();

        public static void readFile(String filename){
            try {
                //initialise file and scanner.
                File weblog = new File(filename);
                Scanner read = new Scanner(weblog);
                //iterate over all lines and adds them to records.
                while (read.hasNextLine()) {
                    String newLine = read.nextLine();
                    //adding weblogs to the arraylist.
                    records.add(WebLogParser.parseEntry(newLine));
                }
                read.close();
            }
            //catch the error if occurs.
            catch (FileNotFoundException e) {
        System.out.println("An error occurred:");
        e.printStackTrace();
        }
        }
        //print all logs.
    public static void printAll() {
        for (LogEntry x : records) {
            System.out.println(x);
        }
    }
}
