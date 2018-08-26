package retailerservices.retailerservices.services;

import retailerservices.retailerservices.entity.Retailer;
import retailerservices.retailerservices.models.*;

public interface RetailerService {

    public Retailer add(RetailerRequest retailerRequest);
    public RetailerResponse remove(RetailerRequest retailerRequest) throws Exception;
    public Retailer getInfo(String mdn) throws Exception;
    public RetailerResponse update(RetailerRequest retailerRequest) throws Exception;

}
