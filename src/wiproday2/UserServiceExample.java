package wiproday2;

import java.util.Optional;

interface UserService {
    
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    
    Optional<String> getUser(String name);

    
    default String getPersonalizedMessage(String name) {
        return getUser(name)
                .map(userName -> "Welcome, " + userName + "!")
                .orElse(getWelcomeMessage());
    }
}

class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
}

public class UserServiceExample {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        
        System.out.println(userService.getPersonalizedMessage("Alice")); 
        System.out.println(userService.getPersonalizedMessage(null));    
    }
}

