package br.com.ntt.b2b.core.Dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface TrainingTmaCustomerDao extends Dao {

    CustomerModel getTmaCustomerById(String tmaCustomerId);

    boolean registerNewTmaCustomer(CustomerModel tmaCustomerModel);

    boolean deleteTmaCustomerById(String tmaCustomerId);

    CustomerModel updateTmaCustomer(CustomerModel updatedTmaCustomerModel);
}
