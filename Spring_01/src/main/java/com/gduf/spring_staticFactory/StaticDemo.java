package com.gduf.spring_staticFactory;

/**
 * Created by thz on 2017/5/25.
 */
public class StaticDemo {
public void test(){
    System.out.print(StaticTest.medo());
    StaticTest medo1;
    medo1=new StaticTest();
    System.out.print(medo1.medo2());
}

}
