package br.com.ntt.b2b.facades.tmaCustomer;

import br.com.ntt.b2b.Dto.TmaCustomerRequest;
import de.hybris.platform.commercefacades.user.data.CustomerData;

public interface TrainingTmaCustomerFacade {

    CustomerData getTmaCustomerById(String tmaCustomerId);

    boolean registerTmaCustomer(CustomerData tmaCustomerData);

    boolean deleteTmaCustomerById(String tmaCustomerId);

    CustomerData updateTmaCustomer(CustomerData updatedTmaCustomerData);

    void convertRequest(CustomerData target, TmaCustomerRequest source);

}