import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // Must match MySQL table name
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private int age;

    private String location;
    private String sex;

    @Column(nullable = false)
    private String password;
}
