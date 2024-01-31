package Allure;

import Allure.AllureAttachmentsManager;
import io.qameta.allure.Step;

import java.util.logging.Logger;

public class AllureLogger {
    private final Logger logger;

    public AllureLogger(Logger logger) {
        this.logger = logger;
    }

    @Step("{logText}")
    public void info(String longText) {
        logger.info(longText);
    }

    @Step("{logText}")
        public void infoWithScreenshot(String logText){
        logger.info(logText);
        AllureAttachmentsManager.screenshot();
        }
}
