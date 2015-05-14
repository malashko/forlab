package com.main;
import initGit.initGit;
import loginGit.loginGit;
import createReposGit.createReposGit;
import pageObject.loginPage;
import pageObject.openGit;
import testWeb.testDriver;

/**
 * Created by FallOutBoy on 10.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        /*testDriver.init();
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
        }*/
        initGit.init();
        if( loginGit.login()){
            System.out.println("success login");
        }else{
            System.out.println("fail login");
        }

        if( createReposGit.createRepos()){
            System.out.println("success create");

        }
        else{
            System.out.println("fail create");
        }
       /* PageObject
        openGit git = new openGit();
        loginPage page = git.open("https://github.com/");
        page.singGit();
        page.signIn();
        page.fill();
        page.login();
       */
    }
}
