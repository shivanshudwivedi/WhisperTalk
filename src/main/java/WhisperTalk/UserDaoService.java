package WhisperTalk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // Control and access things from database here

    private static int usersCount;
    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(++usersCount,"Shivanshu", "123"));
        users.add(new User(++usersCount,"Anupam", "456"));
        users.add(new User(++usersCount,"Shash", "789"));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(Integer id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

}
