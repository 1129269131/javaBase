package senior.day16;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Create by koala on 2021-01-07
 */
public class DAOTest01 {

    @Test
    public void test1(){
        CustomerDAO01 dao1 = new CustomerDAO01();
        dao1.add(new Customer01());
        List<Customer01> list = dao1.getForList(10);

        StudentDAO01 dao2 = new StudentDAO01();
        Student01 student = dao2.getIndex(1);
    }

}
