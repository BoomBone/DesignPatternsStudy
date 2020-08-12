package create.singleton.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description
 */
public class Singleton {

    private Singleton(){}

    private static class Holder{
        private static Singleton instance = new Singleton();
    }

    public static final Singleton getInstance(){
        return Holder.instance;
    }
}
