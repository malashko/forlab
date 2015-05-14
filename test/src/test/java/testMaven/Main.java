package com.main;
import testWeb.testDriver;

/**
 * Created by FallOutBoy on 10.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        testDriver.init();
        if(testDriver.login()){
            System.out.println("success login");
        }
        else{
            System.out.println("fail login");
        }
        if(testDriver.createRepos()){
            System.out.println("success create");
        }
        else{
            System.out.println("fail create");
        }
    }
}
