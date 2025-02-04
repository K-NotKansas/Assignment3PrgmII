import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class InheritenceDemo {
    public static void main(String[] args) {
        ArrayList<String> Workers = new ArrayList<>();
        String workerRecord = "";
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int yearOfBirth = 0;
        double hourlyRate = 0;
        double annualSalary = 0;
        int i = 0;
        //String splitByThisPleaseItHasBeenOverAnHour = ",";
        int Workernum = 0;
        int simPeriod = 0;
        double payForhourly;
        double payForsalary;

        workerRecord = SalaryWorker.toCSV("00000001", "Scaredy", "Lion", "Mr.", 1980, 52.4, 0);
        Workers.add(workerRecord);
        workerRecord = SalaryWorker.toCSV("00000002", "Tin", "Man", "Mr.", 1980, 70.2, 0);
        Workers.add(workerRecord);
        workerRecord = SalaryWorker.toCSV("00000003", "Dorothy", "Gale", "Ms.", 1990, 82.65, 0);
        Workers.add(workerRecord);
        workerRecord = SalaryWorker.toCSV("00000004", "The", "Wizard", "Mr.", 1960, 0, 205000);
        Workers.add(workerRecord);
        workerRecord = SalaryWorker.toCSV("00000005", "Glinda", "The Good Witch", "Ms.", 1965, 0, 210000);
        Workers.add(workerRecord);
        workerRecord = SalaryWorker.toCSV("00000006", "The Wicked Witch", "Of The West", "Ms.", 1965, 0, 210000);
        Workers.add(workerRecord);

        while (simPeriod < 3) {
            //Declare area
            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "\\src"); //\\personData.txt"); -was previously after src
            Scanner inFile;
            String line = "";
            JFileChooser chooser = new JFileChooser();
            int lineNum = 0;
            String splitByThisPleaseItHasBeenOverAnHour = ",";

            //set the chooser to the project source directory
            chooser.setCurrentDirectory(file.toFile());


            //logic
            try {
                //Logic for Jfilechooser
                if (chooser.showDialog(null,null) == JFileChooser.APPROVE_OPTION) {
                    simPeriod++;
                    file = chooser.getSelectedFile().toPath();


                    inFile = new Scanner(file);

                    System.out.println("");
                    System.out.printf("%-6s %14s %19s %17s %n", "ID#", "Firstname", "Lastname", "Profit");
                    System.out.println("==================================================================");
                    while (inFile.hasNextLine()) {
                        line = inFile.nextLine();
                        lineNum++;
                        String[] WorkersRead = line.split(splitByThisPleaseItHasBeenOverAnHour);
                        System.out.printf("%-6s %-20s %-20s made: ", WorkersRead[0], WorkersRead[1], WorkersRead[2]);
                        if (lineNum <= 3){
                            if (simPeriod == 1){
                                System.out.printf(String.valueOf(Double.parseDouble(WorkersRead[5]) * 40));
                            }
                            if (simPeriod == 2){
                                System.out.printf(String.valueOf(Double.parseDouble(WorkersRead[5]) * 50));
                            }
                            if (simPeriod == 3){
                                System.out.printf(String.valueOf(Double.parseDouble(WorkersRead[5]) * 40));
                            }

                        }
                        else if (lineNum > 3){
                            System.out.printf(String.valueOf(Double.parseDouble(WorkersRead[6]) / 52));
                        }
                        System.out.println("");
                    }
                    inFile.close();

                }
                else //user failed to pick file, closed chooser
                {
                    System.out.println("Must select a file. Terminating.");
                    System.exit(0);
                }
            }
            catch (FileNotFoundException e){
                System.out.println("File not found error, please try again!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
