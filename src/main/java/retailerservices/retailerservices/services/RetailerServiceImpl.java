package retailerservices.retailerservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retailerservices.retailerservices.entity.Retailer;
import retailerservices.retailerservices.models.RetailerRequest;
import retailerservices.retailerservices.models.RetailerResponse;
import retailerservices.retailerservices.repository.RetailerRepository;

@Service
public class RetailerServiceImpl implements RetailerService {

    @Autowired
    private RetailerRepository retailerRepository;

    @Override
    public Retailer add(RetailerRequest retailerRequest) {
        Retailer retailer = new Retailer();
        retailer.setName(retailerRequest.getName());
        retailer.setGstIn(retailerRequest.getGstIn());
        retailer.setPassword(retailerRequest.getPassword());
        retailer.setType(retailerRequest.getType());

        retailerRepository.saveAndFlush(retailer);
        return retailer;
    }

    @Override
    public RetailerResponse remove(RetailerRequest retailerRequest) throws Exception {

        Retailer retailer = retailerRepository.findBymdn(retailerRequest.getMdn());
        if(retailer==null){
            throw new Exception("Retailer is not found.");
        }
        retailerRepository.delete(retailer);
        return null;
    }

    @Override
    public Retailer getInfo(String mdn) throws Exception {

        Retailer retailer = retailerRepository.findBymdn(mdn);
        if(retailer==null){
            throw new Exception("Retailer is not found.");
        }
        return retailer;
    }

    @Override
    public RetailerResponse update(RetailerRequest retailerRequest) throws Exception {

        Retailer retailer = retailerRepository.findBymdn(retailerRequest.getMdn());
        if(retailer==null){
            throw new Exception("Retailer is not found.");
        }

        retailer.setName(retailerRequest.getName());
        retailer.setType(retailerRequest.getType());
        retailer.setPassword(retailerRequest.getPassword());
        retailer.setGstIn(retailerRequest.getGstIn());
        retailer.setMdn(retailerRequest.getMdn());

        retailerRepository.saveAndFlush(retailer);
        return null;
    }
}
