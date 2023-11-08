import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat c;
    @BeforeEach
    void setUp(){
    c = new Cat("Cate", 'F', 5);
    }
    @Test
    void getName() {
        assertNotNull(c.getName());
        assertFalse(c.getName().isEmpty());
    }

    @Test
    void getGender() {
        assertTrue(c.getGender() =='M'|| c.getGender()=='F');
    }

    @Test
    void getWeightInKg() {
        assertTrue(c.getWeightInKg()>0&&c.getWeightInKg()<=10);
    }
}