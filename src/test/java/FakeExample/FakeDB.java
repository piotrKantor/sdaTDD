package FakeExample;

import java.util.HashSet;
import java.util.Set;

public class FakeDB {

    Set<User> users=new HashSet<User>();

    public FakeDB() {
        users.add(new User("1", "Adam", "Kowalski", "a.kowalski@gmail.com"));
        users.add(new User("2", "Adam", "Nowak", "anowak@wp.pl"));
        users.add(new User("3", "Marek", "Kowalski", "a.kowalski@o2.pl"));
        users.add(new User("4", "Kamil", "Nowak", "a.kowalski@gmail.com"));
    }

    User findById(String id){
        for (User user:users) {
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

}
