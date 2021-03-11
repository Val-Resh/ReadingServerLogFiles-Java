public class Main {

    public static void main (String[] args) {
        //reading and printing out all the logs.
        LogRecords.readFile("logs/weblog1_log");
        LogRecords.printAll();
    }
}
