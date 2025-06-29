public class PerformanceTester {
    public void performTask() {
        System.out.println("1. Task started");

        try {
            Thread.sleep(300);  // Simulate task (sleep for 300 ms)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("2. Task completed");
    }
}