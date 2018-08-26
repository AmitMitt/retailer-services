package retailerservices.retailerservices.services;

import org.springframework.stereotype.Service;
import retailerservices.retailerservices.entity.Bill;
import retailerservices.retailerservices.models.BillRequest;
import retailerservices.retailerservices.models.BillResponse;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Override
    public BillResponse make(BillRequest billRequest) {
        List<BillRequest> bill;

        BillResponse billResponse = new BillResponse();
        return billResponse;
    }

    @Override
    public BillResponse get(long Id) {
        return null;
    }

    @Override
    public BillResponse getTotal() {
        return null;
    }
}
