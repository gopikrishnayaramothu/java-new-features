package java8.interfacechanges.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferences {
    public static void main(String[] args) {
        User user = new User();
        List<String> userList = Arrays.asList(new String[]{"foo", "bar", "gopi", "pava"});
        System.out.println("static Method Reference "+userList.stream().anyMatch(User::isValidUser));
        System.out.println("instance Method Reference "+userList.stream().anyMatch(user::isNameHavingMinLength));
        System.out.println("Count of validUsers " + userList.stream().filter(User::isValidUser).count());

        Stream<User> userMap = userList.stream().filter(User::isValidUser).map(User::new);
        System.out.println("userMap Length " + userMap.count());
    }
    }

class User {
    String name;

    User() {
    }

    User(String name) {
        this.name = name;
    }

    static boolean isValidUser(String name) {
        return name.equals("gopi");
    }

    boolean isNameHavingMinLength(String name ){
       return name.length()>=5;
    }
}
