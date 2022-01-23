package program;

import singleton.SingleLazyHolder;
import singleton.SingletonEager;
import singleton.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        //Testes Singleton:
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("1o lazy:"+lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println("2o lazy:"+lazy);

        SingletonEager eager =SingletonEager.getInstanciaEager();
        System.out.println("1o eager:"+eager);
         eager =SingletonEager.getInstanciaEager();
        System.out.println("2o eager:"+eager);

        SingleLazyHolder holder = SingleLazyHolder.getInstance();
        System.out.println("1o holder:"+holder);
         holder =SingleLazyHolder.getInstance();
        System.out.println("2o holder:"+holder);


    }
}
