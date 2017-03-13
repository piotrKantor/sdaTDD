package FakeExample;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj id użytkownika");
        Scanner scanner=new Scanner(System.in);
        UserDAOImpl userDAOImpl=new UserDAOImpl();
        User user=userDAOImpl.findById(scanner.next());
        System.out.println(user.isEmailInGoogleDomain());
    }

}
