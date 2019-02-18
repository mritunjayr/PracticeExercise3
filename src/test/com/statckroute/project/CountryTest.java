package com.statckroute.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryTest {
    Country country;
    @Before
    public void setUp() throws Exception {
        country=new Country();
    }

    @After
    public void tearDown() throws Exception {
        country=null;
    }

    @Test
    public void removeVowels() {
        String []input={"India",
                "United States" ,
                "Germany",
                "Egypt" ,
                "czechoslovakia"};
        String []expected={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals(expected,country.removeVowels(input));
    }
}