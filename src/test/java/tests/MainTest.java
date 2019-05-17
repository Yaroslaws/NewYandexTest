package tests;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;


public class MainTest {

    //Mass Treads
    final ArrayList<Object> arrayObject = new ArrayList<Object>();
    public boolean aBoolean = true;

    @Test
    public void test() throws InterruptedException {

        //start test in Treads
      new Thread(new TwoTest()).start();
      new Thread(new ThreeTest()).start();
      new Thread(new FourTest()).start();
      new Thread(new FiveTest()).start();
      new Thread(new SixTest()).start();

      OneTest oneTest = new OneTest();
      oneTest.test1();



    }
}
