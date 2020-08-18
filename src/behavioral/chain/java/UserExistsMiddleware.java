package behavioral.chain.java;

/**
 * @author Ting
 * @date 2020/8/14
 * @description 检查用户登录信息
 */
public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("This email is not register");
            return false;
        }
        if (server.isValidPassword(email, password)){
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(email, password);
    }
}
