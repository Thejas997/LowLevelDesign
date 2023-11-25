package designpatterns.creational.singleton;

public class TestDbServiceSingletonWithDoubleCheckLock {

    private TestDbServiceSingletonWithDoubleCheckLock() {
        // private constructor
    }

    // reason for volatile ?
    private static volatile TestDbServiceSingletonWithDoubleCheckLock instance;


    public static TestDbServiceSingletonWithDoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (TestDbServiceSingletonWithDoubleCheckLock.class) {
                if(instance == null)
                    instance = new TestDbServiceSingletonWithDoubleCheckLock();
            }
        }
        return instance;
    }

}
