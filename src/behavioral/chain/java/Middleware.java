package behavioral.chain.java;

/**
 * @author Ting
 * @date 2020/8/14
 * @description 基础验证接口
 */
public abstract class Middleware {
    private Middleware middleware;
    public Middleware linkWith(Middleware next){
        middleware = next;
        return next;
    }

    public abstract boolean check(String email,String password);

    protected boolean checkNext(String email,String password){
        if (middleware == null){
            return true;
        }
        return middleware.check(email, password);
    }
}
