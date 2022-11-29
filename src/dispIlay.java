public class dispIlay {
    public void wishes(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("good morning");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}