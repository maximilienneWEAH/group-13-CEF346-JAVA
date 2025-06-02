import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ebilling_backend
.repository.BillRepository;
import com.example.ebilling_backend
.model.Bill;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    // Save a new bill
    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    // Get all bills
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    // Get a bill by ID
    public Bill getBillById(Long invoiceId) {
        return billRepository.findById(invoiceId).orElse(null);
    }
}
