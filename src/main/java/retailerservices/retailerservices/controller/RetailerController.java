package retailerservices.retailerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import retailerservices.retailerservices.entity.Retailer;
import retailerservices.retailerservices.repository.RetailerRepository;
import retailerservices.retailerservices.models.*;
import org.springframework.http.*;
import retailerservices.retailerservices.services.RetailerService;

@RestController
@RequestMapping("Retailer")
public class RetailerController {

    @Autowired
    private RetailerRepository retailerRepository;
    @Autowired
    private RetailerService retailerService;

    @PostMapping("/add")
    public ResponseEntity<RetailerResponse> add(@RequestBody RetailerRequest retailerRequest){

        Retailer retailer = retailerService.add(retailerRequest);
        RetailerResponse retailerResponse = new RetailerResponse();
        retailerResponse.setId(retailer.getId());
        retailerResponse.setMessage("Retailer Successfully Added.");
        return ResponseEntity.ok(retailerResponse);
    }

    @GetMapping("/get/{mdn}")
    public ResponseEntity<RetailerResponse> get(@PathVariable (value = "mdn") String mdn) throws Exception {

        Retailer retailer = retailerService.getInfo(mdn);
        RetailerResponse retailerResponse = new RetailerResponse();
        retailerResponse.setName(retailer.getName());
        retailerResponse.setGstIn(retailer.getGstIn());
        retailerResponse.setType(retailer.getType());
        return ResponseEntity.ok(retailerResponse);
    }

    @PostMapping("/remove")
    public ResponseEntity<RetailerResponse> remove(@RequestBody RetailerRequest retailerRequest) throws Exception {

        retailerService.remove(retailerRequest);
        RetailerResponse retailerResponse = new RetailerResponse();
        retailerResponse.setMessage("Retailer is Successfully Deleted.");
        return ResponseEntity.ok(retailerResponse);
    }

    @PostMapping("/update")
    public ResponseEntity<RetailerResponse> update (@RequestBody RetailerRequest retailerRequest) throws Exception {

        retailerService.update(retailerRequest);
        RetailerResponse retailerResponse = new RetailerResponse();
        retailerResponse.setMessage("Successfully Update.");
        return ResponseEntity.ok(retailerResponse);
    }
}
