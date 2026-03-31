package linear_and_binary_search;

public class StringPerformanceCheck {

    public static void main(String[] args) {
        int n = 1_000_000;

        // StringBuffer Checking
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // StringBuilder Checking
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            stringBuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // Output results
        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
