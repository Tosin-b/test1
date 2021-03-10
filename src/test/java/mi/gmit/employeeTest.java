package mi.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
public class employeeTest {

    @Test
    void setEmployee(){
        assertDoesNotThrow(()->{new employee("Mr","67THEb",
                "098765432", "Part time",20,"Mr");});
        employee e = new employee("Tosin","67THEb"
                ,"098765432","Part time",20,"Mr");
        assertEquals("Mr",e.getTitle());
        assertEquals("Tosin",e.getName());
        assertEquals("098765432",e.getPhoneNumber());
        assertEquals("67THEb",e.getPPS_ID());
        assertEquals(20,e.getAge());

    }
    @Test
    void testSetempolyee(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sifg","67THEb",
                "098765432", "Part time",20,"Mr");});
        employee b = new employee("Tosin","67THEb"
                ,"098765432","Part time",20,"app");
        b.setTitle("Mr");
        assertEquals("mr",b.getTitle());

        b.setTitle("Mrs");
        assertEquals("mr",b.getTitle());
        b.setTitle("Ms");
        assertEquals("mr",b.getTitle());
    }
    @Test
    void testemployeeName(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sig","67THEb",
                "098765432", "Part time",20,"Mr");});
        assertEquals("name is too short",e.getMessage());

    }
    @Test
    void testEmployee_ID(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sifg","6",
                "098765432", "Part time",20,"Mr");});

        assertEquals(" ID is too short",e.getMessage());

    }
    @Test
    void testEmployeetype(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sifg","6",
                "098765432", "employed",20,"Mr");});
        assertEquals(" incorrect Employeee type",e.getMessage());


    }
    @Test
    void testEmployeephone(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sifg","6",
                "0987654", "employed",20,"Mr");});
        assertEquals(" phone number is not 9 charachter long",e.getMessage());

    }
    @Test
    void testEmployeeage(){
        Exception e = assertThrows(IllegalArgumentException.class,() ->{new employee("sifg","6",
                "0987654", "employed",10,"Mr");});
        assertEquals(" too young",e.getMessage());

    }

}
