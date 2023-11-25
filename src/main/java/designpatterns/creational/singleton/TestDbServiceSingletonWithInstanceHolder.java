package designpatterns.creational.singleton;

public class TestDbServiceSingletonWithInstanceHolder {

    private TestDbServiceSingletonWithInstanceHolder() {
        // private constructor
    }

    private static final class InstanceHolder {
        private static final TestDbServiceSingletonWithInstanceHolder instance = new TestDbServiceSingletonWithInstanceHolder();
    }

    public static TestDbServiceSingletonWithInstanceHolder getInstance() {
        return InstanceHolder.instance;
    }

}
