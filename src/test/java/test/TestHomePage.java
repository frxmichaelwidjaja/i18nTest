package test;

import org.junit.jupiter.api.Test;
import sample.pages.HomepagePage;


public class TestHomePage {


    /**
     * This test case is to test the English version of the homepage
     */
    @Test
    void validateEnVersion(){
        HomepagePage.validateHomepage("en");
    }

    /**
     * This test case is to test the German version of the homepage
     */
    @Test
    void validateDEVersion() {
        HomepagePage.validateHomepage("de");
    }

    /**
     * This test case is to test the Japanese version of the homepage
     */
    @Test
    void validateJpVersion() {
        HomepagePage.validateHomepage("ja-jp");
    }

    /**
     * This test case is to test the Korean version of the homepage
     */
    @Test
    void validateKrVersion() {
        HomepagePage.validateHomepage("ko-kr");
    }

    /**
     * This test case is to test the Chinese/Mandarin version of the homepage
     */
    @Test
    void validateCnVersion() {
        HomepagePage.validateHomepage("zh-cn");
    }
}
