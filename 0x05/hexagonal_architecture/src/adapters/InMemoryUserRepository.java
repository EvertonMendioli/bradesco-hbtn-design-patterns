
package adapters;
import domain.User;
import ports.UserRepository;
import java.util.*;
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> database = new HashMap<>();


    public void save(User user) 
    { 
        save(user);
    }

    public User findById(String id) 
    { 
        return findById(id);
    }

    public List<User> findAll() 
    { 
        return findAll();
    }
}