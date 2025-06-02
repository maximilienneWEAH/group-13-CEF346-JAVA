import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bills")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String paymentMethod;
    private double amount;
}
