import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ebilling_backend.service.ViewBillService;
import com.example.ebilling_backend.model.ViewBill;

import java.util.List;

@RestController
@RequestMapping("/api/viewbills")
public class ViewBillController {
    @Autowired
    private ViewBillService viewBillService;

    // Create a new view bill entry
    @PostMapping("/create")
    public ViewBill createViewBill(@RequestBody ViewBill viewBill) {
        return viewBillService.createViewBill(viewBill);
    }

    // Get all view bill records
    @GetMapping("/all")
    public List<ViewBill> getAllViewBills() {
        return viewBillService.getAllViewBills();
    }

    // Get a specific view bill record
    @GetMapping("/{viewbillId}")
    public ViewBill getViewBillById(@PathVariable Long viewbillId) {
        return viewBillService.getViewBillById(viewbillId);
    }
}
