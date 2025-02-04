public class SalaryWorker extends Worker{
    static double annualSalary;

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB, hourlyRate);
        this.annualSalary = annualSalary;
    }

    public static double calculateWeeklyPay(double annualSalary) {
        weeklyPay = annualSalary;
        return weeklyPay;
    }

    public static void displayWeeklyPay(double annualSalary) {
        weeklyPay = annualSalary / 52;
        System.out.println("You earn: " + weeklyPay + " per week, congrats!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDnum=" + super.getIDnum() + '\'' +
                ", firstName=" + super.getFirstName() + '\'' +
                ", lastName=" + super.getLastName() + '\'' +
                ", title=" + super.getTitle() + '\'' +
                ", YOB=" + super.getYOB() + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", annualSalary=" + annualSalary +
                '}';
    }

    static String toCSV(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate, double annualSalary) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf(
                ID  +
                        "," + firstName +
                        "," + lastName +
                        "," + title +
                        "," + yearOfBirth +
                        "," + hourlyRate +
                        "," + annualSalary
        );
        return PleaseWorkThanksInAdvancePlease;
    }
    private static String toJSON(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate, double annualSalary) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf( "{" +
                "ID:" + ID +
                ", firstName:" + firstName +
                ", lastName:" + lastName +
                ", title:" + title +
                ", yearOfBirth:" + yearOfBirth +
                ", hourlyRate:" + hourlyRate +
                ", annualSalary:" + annualSalary +
                '}');
        return PleaseWorkThanksInAdvancePlease;
    }
    private static String toXML(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate, double annualSalary) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf("<worker>" +
                "<ID>" + ID + "</ID>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<yearOfBirth>" + yearOfBirth + "</yearOFBirth>" +
                "<hourlyRate>" + hourlyRate + "</hourlyRate>" +
                "<annualSalary>" + annualSalary + "</annualSalary>" +
                "</worker>");
        return PleaseWorkThanksInAdvancePlease;
    }

}
