package Allure;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class MyTestWatcher implements TestWatcher {
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        AllureAttachmentsManager.screenshot();
        TestWatcher.super.testFailed(context, cause);
    }
}
