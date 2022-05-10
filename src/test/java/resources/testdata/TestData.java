package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobSearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Software Tester", "Sutton", "up to 5 miles", "30000", "500000", "Per annum","Permanent", "Permanent Software Tester jobs in Sutton"},
                {"Automation Tester", "London", "up to 15 miles", "30000", "50000", "Per annum","Contract", "Automation Tester jobs in London"},
                {"Manual Tester", "Surrey", "up to 7 miles", "30000", "60000", "Per annum","Any", "Manual Software Tester jobs in surrey"},
                {"Developer", "Croydon", "up to 25 miles", "30000", "50000", "Per annum","Permanent", "Permanent Developer jobs"},
                {"Selenium- Java jobs", "SM1 1UB", "up to 10 miles", "300", "400", "Per day","Contract", " java/selenium base jobs in sutton"},
                {"QA", "SM1 1UB", "up to 10 miles", "400", "500", "Per day","Contract", "QA jobs in SM1 area"},
                {"QC", "Cheam,Surrey", "up to 5 miles", "40000", "60000", "Per annum","Contract", "software QC jobs in surrey"},
        };
    }
}
