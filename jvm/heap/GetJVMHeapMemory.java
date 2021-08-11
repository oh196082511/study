package heap;

public class GetJVMHeapMemory {

    public static void main(String[] args) {
        //返回 JVM 堆大小
        long initalMemory = Runtime.getRuntime().totalMemory() / 1024 /1024;
        //返回 JVM 堆的最大内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 /1024;

        System.out.println("-Xms : "+initalMemory + "M");
        System.out.println("-Xmx : "+maxMemory + "M");

        // 此时 VM Option为 xms 128M    xmx 2048M 。为啥实时求出来的值对不上？


        // 默认情况下，初始堆内存大小为：电脑内存大小/64
        // 默认情况下，最大堆内存大小为：电脑内存大小/4
        System.out.println("系统内存大小：" + initalMemory * 64 / 1024 + "G");
        System.out.println("系统内存大小：" + maxMemory * 4 / 1024 + "G");

    }
}
