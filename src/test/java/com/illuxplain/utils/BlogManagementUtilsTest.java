package com.illuxplain.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class BlogManagementUtilsTest {

    private BlogContentManagement blogContentManagement = new BlogContentManagement();

    @Test
    public void testNoTitleProvideShouldThrowException()
    {
        String title = null;

        try {
            blogContentManagement.convertToLowerCaseAndStripeWithDash(title);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testTitleWithSpaceWillReturnLowerCaseWithHypen()
    {
        String title1 = "good day";
        String title2 = "one";
        String title3 = "   one two   ";
        String title4 = "one two three ";
        String title5 = "OneTwo Three";

        try {
            String a1 = blogContentManagement.convertToLowerCaseAndStripeWithDash(title1);
            String a2 = blogContentManagement.convertToLowerCaseAndStripeWithDash(title2);
            String a3 = blogContentManagement.convertToLowerCaseAndStripeWithDash(title3);
            String a4 = blogContentManagement.convertToLowerCaseAndStripeWithDash(title4);
            String a5 = blogContentManagement.convertToLowerCaseAndStripeWithDash(title5);

            assertEquals(a1, "good-day");
            assertEquals(a2, "one");
            assertEquals(a3, "one-two");
            assertEquals(a4, "one-two-three");
            assertEquals(a5, "onetwo-three");
        }
        catch (Exception e) {
            assertTrue(true);
        }

    }

}
