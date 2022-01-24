package program;

import singleton.SingleLazyHolder;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Main {
    public static void main(String[] args) {
        //Testes Singleton:
       /** SingletonLazy lazy = SingletonLazy.getInstance();
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
        System.out.println("2o holder:"+holder);*/

       //testes strategy
       /** ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo =new ComportamentoAgressivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
       robo.mover();
       robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();*/


    }
}
