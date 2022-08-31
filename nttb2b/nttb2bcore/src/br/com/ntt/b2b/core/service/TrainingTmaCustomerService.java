package br.com.ntt.b2b.core.service;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface TrainingTmaCustomerService {

    CustomerModel getTmaCustomerById(String tmaCustomerId);

    boolean registerTmaCustomer(CustomerModel tmaCustomerModel);

    boolean deleteTmaCustomerById(String tmaCustomerId);

    CustomerModel updateTmaCustomer(CustomerModel updatedTmaCustomerModel);

    List<CustomerModel> getAllTmaCustomers();
}
