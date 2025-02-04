public class Worker extends Person {
    static double hoursWorked;
    static double hoursWorkeda;
    static double weeklyPay;
    static double hourlyRate;


    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyRate = hourlyRate;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public static double calculateWeeklyPay(double hoursWorked, double hourlyRate) {

        if (hoursWorked <= 40){
            weeklyPay = hourlyRate * hoursWorked;
            //System.out.println("Hours worked at the normal rate: " + hoursWorked);
            return hoursWorked;
        } else if (hoursWorked > 40) {
            hoursWorkeda = hoursWorked - 40;
            /*
            System.out.println("Hours worked at the normal rate: " + "40");
            System.out.println("Hours worked at the time and a half rate: " + hoursWorkeda);
             */
            weeklyPay = (hourlyRate * 1.5) * hoursWorkeda;
            weeklyPay = weeklyPay + (hourlyRate*40);
            return hoursWorkeda;
        }

        return weeklyPay;
    }

    public static void displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            System.out.println("Hours worked at the normal rate: " + hoursWorked);
            calculateWeeklyPay(hoursWorked, hourlyRate);
        } else if (hoursWorked > 40) {
            System.out.println("Hours worked at the normal rate: " + hoursWorked);
            calculateWeeklyPay(hoursWorked, hourlyRate);
            System.out.println("Hours worked at the time and a half rate: " + hoursWorkeda);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "IDnum='" + super.getIDnum() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", YOB=" + super.getYOB() + '\'' +
                ", hourlyRate" + hourlyRate +
                '}';
    }

    private static String toCSV(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf(
                ID  +
                        "," + firstName +
                        "," + lastName +
                        "," + title +
                        "," + yearOfBirth +
                        "," + hourlyRate
                );
        return PleaseWorkThanksInAdvancePlease;
    }
    private static String toJSON(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf( "{" +
                "ID:" + ID +
                ", firstName:" + firstName +
                ", lastName:" + lastName +
                ", title:" + title +
                ", yearOfBirth:" + yearOfBirth +
                ", hourlyRate:" + hourlyRate +
                '}');
        return PleaseWorkThanksInAdvancePlease;
    }
    private static String toXML(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyRate) {
        String PleaseWorkThanksInAdvancePlease= String.valueOf("<worker>" +
                "<ID>" + ID + "</ID>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<yearOfBirth>" + yearOfBirth + "</yearOFBirth>" +
                "<hourlyRate>" + hourlyRate + "</hourlyRate>" +
                "</worker>");
        return PleaseWorkThanksInAdvancePlease;
    }

    public static void main(String[] args) {

    }
}

