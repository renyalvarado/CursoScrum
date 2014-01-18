package com.cursoscrum.service;

import com.cursoscrum.domain.User;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cleteci
 */
public class WiredUserServiceTest {

    private static User martin;
    private static User kent;
    private static User bill;
    private static List<User> users;

    public WiredUserServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        martin = new User();
        martin.setUsername("martinfowler");
        martin.setPassword("12345");

        kent = new User();
        kent.setUsername("kentbeck");
        kent.setPassword("abcde");

        bill = new User();
        bill.setUsername("billgates");
        bill.setPassword("1qaz2w");

        users = Arrays.asList(new User[]{martin, kent});
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findUser method, of class WiredUserService.
     */
    @Test
    public void testFindValidUser() {
        IUserService instance = new WiredUserService(users);

        User user = instance.findUser(martin);
        assertEquals(martin, user);
    }

    @Test
    public void testFindInvalidUser() {
        IUserService instance = new WiredUserService(users);

        User user = instance.findUser(bill);
        assertNull(user);
    }
}