import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ebilling_backend
.service.BillService;
import com.example.ebilling_backend
.model.Bill;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {
    @Autowired
    private BillService billService;

    // Create a new bill
    @PostMapping("/create")
    public Bill createBill(@RequestBody Bill bill) {
        return billService.createBill(bill);
    }

    // Get all bills
    @GetMapping("/all")
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    // Get a bill by ID
    @GetMapping("/{invoiceId}")
    public Bill getBillById(@PathVariable Long invoiceId) {
        return billService.getBillById(invoiceId);
    }
}
