package test.com;

import com.itexps.testpackage.mytestng.Student;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class StudentTestNGTest {

    Student stu; //1 step -- declaration

    public StudentTestNGTest() {

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFirst() { //3 step --execution
        stu.setFirst("Tom");
        stu.setLast("Patel");
        assertEquals("Tom", stu.getFirst());
        assertEquals("Patel", stu.getLast());
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod  //2 step --instansiation
    public void setUpMethod() throws Exception {
        stu = new Student();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
