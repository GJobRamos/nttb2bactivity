package br.com.ntt.b2b.core.Dao.impl;

import br.com.ntt.b2b.core.Dao.TrainingTmaCustomerDao;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class TrainingTmaCustomerDaoImpl extends AbstractItemDao implements TrainingTmaCustomerDao {

    private static final Logger LOGGER = Logger.getLogger(TrainingTmaCustomerDaoImpl.class);

    private final String TMA_CUSTOMER_ID_QUERY = "SELECT { " + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "" +
            "} WHERE {" + CustomerModel.CUSTOMERID +"} =?customerId"  ;

    @Override
    public CustomerModel getTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("DAO received tmaCustomerId to search a Tma Customer Profile in the Data Base");

        ServicesUtil.validateParameterNotNull(tmaCustomerId,"Tma customer ID must not be null");
        final Map<String,String> param =new HashMap<>();
        param.put("customerId",tmaCustomerId);
        SearchResult<CustomerModel> tmaCustomer = getFlexibleSearchService().search(TMA_CUSTOMER_ID_QUERY, param);

        if (tmaCustomer.getResult().get(0) == null){
            throw new RuntimeException("Customer not found by ID: " + tmaCustomerId);
        }

        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Customer found: " + tmaCustomer.getResult().get(0).getName());

        return tmaCustomer.getResult().get(0);
    }

    @Override
    public boolean registerNewTmaCustomer(CustomerModel tmaCustomerModel) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("DAO received tmaCustomerModel to populate the Data Base");

        if (getModelService().isNew(tmaCustomerModel)) {
            getModelService().save(tmaCustomerModel);


            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");
            //printableData.printTitle("TMACUTOMER REGISTERED");
            //printableData.printModel(newTmaCustomerModel);
        }
        if(getTmaCustomerById(tmaCustomerModel.getCustomerID()) == null)
            return false;
        return true;
    }

    @Override
    public boolean deleteTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("DAO received tmaCustomerModel to delete an existing Tma Customer Profile from Data Base");

        CustomerModel existingTmaCustomerProfile = getTmaCustomerById(tmaCustomerId);
        getModelService().remove(existingTmaCustomerProfile);

        return getModelService().isRemoved(existingTmaCustomerProfile);
    }

    @Override
    public CustomerModel updateTmaCustomer(CustomerModel updatedTmaCustomerModel) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("DAO received tmaCustomerModel to update an existing Tma Customer Profile in the Data Base");

        CustomerModel existingTmaCustomer = getTmaCustomerById(updatedTmaCustomerModel.getCustomerID());

        existingTmaCustomer.setCpf(updatedTmaCustomerModel.getCpf());
        existingTmaCustomer.setRg(updatedTmaCustomerModel.getRg());
        existingTmaCustomer.setPassport(updatedTmaCustomerModel.getPassport());

        existingTmaCustomer.getAddresses().iterator().next().setRiskArea(updatedTmaCustomerModel.getAddresses().iterator().next().getRiskArea());

        getModelService().save(existingTmaCustomer);

        if (getModelService().isModified(existingTmaCustomer)) {
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("DAO updated tmaCustomerModel");
            return existingTmaCustomer;
    }
        return null;
    }
}
