class Shared {
    private volatile int z;
    private int x;
    private int y;

    @Override
    public String toString() {
        return "[ " + x + ", " + y + ", " + z + " ]";
    }

    /**
     * In this method var x & y will directly reflect in main memory along with z because they are updated before volatile var z & they are updated in catch
     * @param x
     * @param y
     * @param z
     */
    public void update1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * In this method var z will directly reflect in main memory but var x & y will not get updated instant because they not volatile and they are not updating before volatile var.
     * @param x
     * @param y
     * @param z volatile
     */
    public void update2(int x, int y, int z) {
        this.z = z;
        this.x = x;
        this.y = y;
    }
}

public class VolatileExample {

    public static void main(String[] args) {

        Shared s = new Shared();

        Runnable runnable1 = () -> {
            for(int i = 1; i <= 10; i++) {
                s.update1(i, i*2, i*3);
                System.out.println(s);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();

    }
}