package singleton;

/**
 * Singleton "Apressado"
 * @author murilo
 */
public class SingletonEager {
    private static SingletonEager instanciaEager = new SingletonEager();

    private SingletonEager(){
        super();

    }

    public static SingletonEager getInstanciaEager() {
        return instanciaEager;
    }
}
