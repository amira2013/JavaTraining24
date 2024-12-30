package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener {
    public void OnTestStart(ITestResult result){
        System.out.println("The test is starting");
    }
    public void onTestsucces(ITestResult result){
        System.out.println("The test passed successfully");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("The test is skipped");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("The test is failed");

    }

}
