package scenario.browserbuddy;

public class Main {
    public static void main(String[] args) {

        BrowserBuddy browser = new BrowserBuddy();

        browser.visit("google.com");
        browser.visit("github.com");
        browser.back();
        browser.forward();

        browser.closeTab();
        browser.restoreTab();
    }
}
