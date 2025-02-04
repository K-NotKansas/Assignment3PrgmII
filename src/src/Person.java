public class Person
{
    private String IDnum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    static private int IDSeed = 1;
    private int AGE;
    public String fullName = lastName + "," + firstName;


    public Person(String IDnum, String firstName, String lastName, String title, int YOB)
    {
        this.IDnum = IDnum;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.title = title;
        this.YOB = YOB;
    }

    public Person(String firstName, String lastName, int YOB)
    {
        this.IDnum = this.genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        //this.title = title;
        this.YOB = YOB;
    }

    public int getAGE() {
        AGE = 2025 - YOB;

        return AGE;
    }
    public int getAGE(int AGE) {
        AGE = 2025 - AGE;

        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIDnum() {
        return IDnum;
    }

    private String genIDNum() {
        String newID = "" + IDSeed;
        while (newID.length() < 8){
            newID = "0" + newID;

        }
        IDSeed++;
        return newID;
    }

    public void setIDnum(String IDnum) {
        this.IDnum = IDnum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public static int getIDSeed() {
        return IDSeed;
    }

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDnum='" + IDnum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }



}

