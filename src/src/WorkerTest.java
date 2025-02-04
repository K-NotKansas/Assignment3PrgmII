import static org.junit.jupiter.api.Assertions.*;
class WorkerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Worker p1, p2, p3;
        p1 = new Worker("00000001", "Sally", "Williams", "null", 2005, 99.6);
        p2 = new Worker("00000002", "Fred", "Williams", "null", 2005, 87.2);
        p3 = new Worker("00000003", "Homer", "Williams", "null", 2005, 65.5);
    }

    @org.junit.jupiter.api.Test
    void getHoursWorked() {
    }

    @org.junit.jupiter.api.Test
    void setHoursWorked() {
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {

    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}