package pertemuan14.tugas3;

public class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total objek Counter yang telah dibuat: " + Counter.getInstanceCount());
    }
}
