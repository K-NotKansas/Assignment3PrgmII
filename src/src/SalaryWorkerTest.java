import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @BeforeEach
    void setUp() {
        SalaryWorker p1, p2, p3;
        p1 = new SalaryWorker("00000001", "Sally", "Williams", "null", 2005, 0, 23000);
        p2 = new SalaryWorker("00000002", "Fred", "Williams", "null", 2005, 0, 21000);
        p3 = new SalaryWorker("00000003", "Homer", "Williams", "null", 2005, 0, 19000);
    }

    @Test
    void calculateWeeklyPay() {
    }

    @Test
    void displayWeeklyPay() {
    }

    @Test
    void testToString() {
    }

    @Test
    void toCSV() {
    }
}