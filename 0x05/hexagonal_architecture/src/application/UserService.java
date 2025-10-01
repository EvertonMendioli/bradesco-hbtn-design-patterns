

import java.util.List;

import ports.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String id, String name) {
        // implemente o metodo
        InMemoryUserRepository memory = new InMemoryUserRepository();
        User user = new User(id, name);

        memory.save(user);
    }

    public User getUser(String id) {
        InMemoryUserRepository memory = new InMemoryUserRepository();
        return memory.findById(id);
    }

    public List<User> listUsers() {
        InMemoryUserRepository memory = new InMemoryUserRepository();
        return memory.findAll();

    }
}
