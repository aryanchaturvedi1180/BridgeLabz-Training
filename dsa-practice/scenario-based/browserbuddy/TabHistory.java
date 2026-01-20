package scenario.browserbuddy;

public class TabHistory {
    private Node current;
    
    public void visit(String url) {
        Node newNode = new Node(url);

        if (current != null) {
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }
    
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No forward page");
        }
    }

    public String getCurrentPage() {
        return current != null ? current.url : "Empty Tab";
    }
}
