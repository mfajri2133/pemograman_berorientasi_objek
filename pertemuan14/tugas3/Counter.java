package pertemuan14.tugas3;

public class Counter {
    static int instanceCount;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
