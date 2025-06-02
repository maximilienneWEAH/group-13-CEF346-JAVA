import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ebilling_backend
.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
