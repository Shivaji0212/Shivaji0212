package com.api.listeners;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
  
	private static final Logger logger = LogManager.getLogger(TestListener.class);
	
	

    @Override
    public void onTestStart(ITestResult result) {
    	Configurator.setRootLevel(Level.INFO);
        logger.info("Test Started: {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	Configurator.setRootLevel(Level.INFO);
        logger.info("Test Passed: {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test Failed: {}", result.getMethod().getMethodName());
        logger.error("Exception: ", result.getThrowable());
    } 
}
