package Product.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")

    public class UserController {

        @Autowired  // Auto-wire the service
        private UserService userService;

        // Register a new user
        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user) {
            try {
                User savedUser = userService.saveUser(user);
                return ResponseEntity.ok(savedUser);
            } catch (Exception e) {
                return ResponseEntity.status(400).build();
            }
        }



        // Get all users
        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        // Get user by ID
        @GetMapping("/{id}")
        public User getUserById(@PathVariable Long id) {
            return userService.getUserById(id);
        }

        // Update user
        @PutMapping("/{id}")
        public User updateUser(@PathVariable Long id, @RequestBody User user) {
            return userService.updateUser(id, user);
        }

        // Delete user
        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable Long id) {
            userService.deleteUser(id);
        }
    }
