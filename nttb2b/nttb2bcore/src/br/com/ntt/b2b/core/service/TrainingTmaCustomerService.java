package br.com.ntt.b2b.core.service;

import de.hybris.platform.core.model.user.CustomerModel;

public interface TrainingTmaCustomerService {

    CustomerModel getTmaCustomerById(String tmaCustomerId);

    boolean registerTmaCustomer(CustomerModel tmaCustomerModel);

    boolean deleteTmaCustomerById(String tmaCustomerId);

    CustomerModel updateTmaCustomer(CustomerModel updatedTmaCustomerModel);
}
