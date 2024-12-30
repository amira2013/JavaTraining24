package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

public class GroupingInTestNg {

        @Test(groups = {"smoke"})
        public void atest() {
            System.out.println("A test");
        }
        @Test(groups ={"smoke"})
        public void ctest(){
            System.out.println("C test");
        }
        @Test
        public void btest(){

            System.out.println("B test");
            Assert.assertTrue(false);
        }

    }
