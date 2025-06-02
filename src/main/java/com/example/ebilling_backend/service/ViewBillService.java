import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ebilling_backend.repository.ViewBillRepository;
import com.example.ebilling_backend.model.ViewBill;

import java.util.List;

@Service
public class ViewBillService {
    @Autowired
    private ViewBillRepository viewBillRepository;

    // Save a new view bill record
    public ViewBill createViewBill(ViewBill viewBill) {
        return viewBillRepository.save(viewBill);
    }

    // Get all view bills
    public List<ViewBill> getAllViewBills() {
        return viewBillRepository.findAll();
    }

    // Get a specific view bill record
    public ViewBill getViewBillById(Long viewbillId) {
        return viewBillRepository.findById(viewbillId).orElse(null);
    }
}
