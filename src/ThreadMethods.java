public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();

        Thread t = new Thread();

//        t.setDaemon(true);
        t.setName("My Thread");
        t.setPriority(10);
        t.join(500);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.toString());
        System.out.println(t.getId());

        Thread.sleep(2000);

        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());

    }
}
