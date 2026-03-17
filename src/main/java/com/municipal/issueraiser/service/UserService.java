public interface UserService {
    User registerUser(RegisterRequest registerRequest);
    User getUserById(Long userId);
    User updateUser(Long userId, User user);
    void deleteUser(Long userId);
    UserDetails loadUserByUsername(String username);
    String login(LoginRequest loginRequest);
}