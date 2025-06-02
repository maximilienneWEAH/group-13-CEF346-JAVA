import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ebilling_backend
.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
