import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "viewbill")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ViewBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long viewbillId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "invoice_id", nullable = false)
    private Bill bill;

    private double amountPaid;
    private String service;
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
}
