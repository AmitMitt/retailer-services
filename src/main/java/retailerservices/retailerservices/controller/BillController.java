package retailerservices.retailerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retailerservices.retailerservices.entity.Bill;
import retailerservices.retailerservices.models.BillRequest;
import retailerservices.retailerservices.models.BillResponse;
import retailerservices.retailerservices.repository.BillRepository;
import retailerservices.retailerservices.services.BillService;

@RestController
@RequestMapping("Bill")
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BillService billService;

    @PostMapping("/make")
    public ResponseEntity<BillResponse> make (@RequestBody BillRequest billRequest){

        BillResponse billResponse = new BillResponse();
        billResponse = billService.make(billRequest);
        billResponse.getTotal();
        return ResponseEntity.ok(billResponse);
    }

}
