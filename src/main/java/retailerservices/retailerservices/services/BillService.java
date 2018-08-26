package retailerservices.retailerservices.services;

import retailerservices.retailerservices.models.*;

public interface BillService {

    public BillResponse make(BillRequest billRequest);
    public BillResponse get(long Id);
    public BillResponse getTotal();

}
