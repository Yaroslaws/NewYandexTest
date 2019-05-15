package tests;


import org.testng.annotations.Test;


import java.util.ArrayList;


public class MainTest {



    //Массив тестов
    final ArrayList<Object> arrayList = new ArrayList<Object>();


    @Test
    public void test() throws InterruptedException {
        OneTest oneTest = new OneTest();
        final TwoTest twoTest = new TwoTest();
        arrayList.add(oneTest);
        arrayList.add(twoTest);


        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("тест 2");

                    System.out.println(arrayList.get(1));
                    ((TwoTest) arrayList.get(1)).testYandex2();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        oneTest.testYandex();
    }
}
