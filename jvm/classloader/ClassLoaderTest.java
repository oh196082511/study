package classloader;

public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        //从上面的结果可以看出，并没有获取到ExtClassLoader的父Loader，
        // 原因是BootstrapLoader(引导类加载器)是用C语言实现的，找不到一个确定的返回父Loader的方式，于是就返回null
        System.out.println(ClassLoaderTest.class.getResource("/"));
    }
}
