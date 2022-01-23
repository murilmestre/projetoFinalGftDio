package singleton;

/**
 * Singleton "LazyHolder"
 * @author murilo
 */

public class SingleLazyHolder {
    public static class Holder{
        public static SingleLazyHolder instanciaLazyHolder = new SingleLazyHolder();
    }
    private SingleLazyHolder() {
        super();
    }
    public static SingleLazyHolder getInstance() {
        return Holder.instanciaLazyHolder;
    }
}
