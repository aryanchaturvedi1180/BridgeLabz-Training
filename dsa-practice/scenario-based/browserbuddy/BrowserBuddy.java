package scenario.browserbuddy;
import java.util.*;

class BrowserBuddy {

    private TabHistory activeTab;
    private Stack<TabHistory> closedTabs;

    public BrowserBuddy() {
        activeTab = new TabHistory();
        closedTabs = new Stack<>();
    }

    public void visit(String url) {
        activeTab.visit(url);
    }

    public void back() {
        activeTab.back();
    }

    public void forward() {
        activeTab.forward();
    }

    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new TabHistory();
        System.out.println("Tab closed");
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Restored tab: " + activeTab.getCurrentPage());
        } else {
            System.out.println("No tabs to restore");
        }
    }
}
