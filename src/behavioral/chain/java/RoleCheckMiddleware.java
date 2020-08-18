package behavioral.chain.java;

/**
 * @author Ting
 * @date 2020/8/17
 * @description 检查用户角色
 */
public class RoleCheckMiddleware extends Middleware {


    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")){
            System.out.println("Hello Admin!");
            return true;
        }
        System.out.println("Hello user!");
        return checkNext(email, password);
    }
}
