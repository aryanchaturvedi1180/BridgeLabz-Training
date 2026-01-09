package LinkedList;
class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movie found for this director");
    }

    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movie found with this rating");
    }
    
    void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    void displayForward() {
        MovieNode temp = head;
        if (temp == null) {
            System.out.println("No movies available");
            return;
        }

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        if (temp == null) {
            System.out.println("No movies available");
            return;
        }

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper method
    void displayMovie(MovieNode m) {
        System.out.println("Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "Cameron", 2009, 7.9);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.2);

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");

        System.out.println("\nFinal List:");
        list.displayForward();
    }
}
