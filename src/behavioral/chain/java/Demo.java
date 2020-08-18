package behavioral.chain.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ting
 * @date 2020/8/17
 * @description
 */
public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init() {
        server = new Server();
        server.register("admin@example.com", "adminpassword");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) {
        init();
        boolean success;
        do {
            System.out.println("Enter email");
            String email = null;
            try {
                email = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Input password=");
            String password = null;
            try {
                password = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            success = server.logIn(email,password);
        }while (!success);
    }
}
