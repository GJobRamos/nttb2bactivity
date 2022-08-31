package br.com.ntt.b2b.facades.tmaCustomer.impl;

import br.com.ntt.b2b.facades.Dto.TmaCustomerRequest;
import br.com.ntt.b2b.core.service.TrainingTmaCustomerService;
import br.com.ntt.b2b.facades.populators.requestPopulators.TmaCustomerRequestConverter;
import br.com.ntt.b2b.facades.populators.TrainingTmaCustomerPopulator;
import br.com.ntt.b2b.facades.populators.TrainingTmaCustomerReversePopulator;
import br.com.ntt.b2b.facades.tmaCustomer.TrainingTmaCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class TrainingTmaCustomerFacadeImpl implements TrainingTmaCustomerFacade {

    private static final Logger LOGGER = Logger.getLogger(TrainingTmaCustomerFacadeImpl.class);
    private TrainingTmaCustomerReversePopulator tmaCustomerReversePopulator;
    private TmaCustomerRequestConverter tmaCustomerRequestConverter;
    private TrainingTmaCustomerService tmaCustomerService;

    private Converter<CustomerModel, CustomerData> customerConverter;

    @Override
    public CustomerData getTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received tmaCustomerId to pass through tmaCustomerService to search for a CustomerProfile in the Data Base...");

        return customerConverter.convert(tmaCustomerService.getTmaCustomerById(tmaCustomerId));
    }

    @Override
    public boolean registerTmaCustomer(CustomerData tmaCustomerData) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received tmaCustomerData to be converted into tmaCustomerModel and pass through tmaCustomerService to register a new Customer prifile at the Data Base...");

        return tmaCustomerService.registerTmaCustomer(convertDataToModel(tmaCustomerData));
    }

    @Override
    public boolean deleteTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received tmaCustomerId to pass through tmaCustomerService to delete an existing CustomerProfile in the Data Base...");

        return tmaCustomerService.deleteTmaCustomerById(tmaCustomerId);
    }

    @Override
    public CustomerData updateTmaCustomer(CustomerData updatedTmaCustomerData) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received tmaCustomerData to be converted into tmaCustomerModel and pass through tmaCustomerService to update an existing Customer profile at the Data Base...");

        return customerConverter.convert(tmaCustomerService.updateTmaCustomer(convertDataToModel(updatedTmaCustomerData)));
    }

    @Override
    public void convertRequest(CustomerData target, TmaCustomerRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received tmaCustomerResquest to be converted into tmaCustomerData and pass back to tmaCustomerController to update an existing Customer profile at the Data Base...");

        tmaCustomerRequestConverter.convertRequest(target,source);
    }

    @Override
    public List<CustomerData> getAllTmaCustomers() {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Facade received the order to pass through tmaCustomerService to search for all existing CustomerProfile in the Data Base...");

        List<CustomerData> tmaCustomerDataList = new ArrayList<>();
        List<CustomerModel> tmaCustomerModelList = tmaCustomerService.getAllTmaCustomers();
        for (CustomerModel tmaCustomerModel : tmaCustomerModelList) {
            CustomerData tmaCustomerData = customerConverter.convert(tmaCustomerModel);
            tmaCustomerDataList.add(tmaCustomerData);
        }
        return tmaCustomerDataList;
    }


    private CustomerModel convertDataToModel(CustomerData tmaCustomerData) {
        CustomerModel tmaCustomerModel = new CustomerModel();

        getTmaCustomerReversePopulator().populate(tmaCustomerData, tmaCustomerModel);

        return tmaCustomerModel;
    }

    public TrainingTmaCustomerReversePopulator getTmaCustomerReversePopulator() {
        return tmaCustomerReversePopulator;
    }

    public void setTmaCustomerReversePopulator(TrainingTmaCustomerReversePopulator tmaCustomerReversePopulator) {
        this.tmaCustomerReversePopulator = tmaCustomerReversePopulator;
    }

    public TrainingTmaCustomerService getTmaCustomerService() {
        return tmaCustomerService;
    }

    public void setTmaCustomerService(TrainingTmaCustomerService tmaCustomerService) {
        this.tmaCustomerService = tmaCustomerService;
    }

    public void setTmaCustomerRequestConverter(TmaCustomerRequestConverter tmaCustomerRequestConverter) {
        this.tmaCustomerRequestConverter = tmaCustomerRequestConverter;
    }

    public TmaCustomerRequestConverter getTmaCustomerRequestConverter() {
        return tmaCustomerRequestConverter;
    }

    public Converter<CustomerModel, CustomerData> getCustomerConverter() {
        return customerConverter;
    }

    public void setCustomerConverter(Converter<CustomerModel, CustomerData> customerConverter) {
        this.customerConverter = customerConverter;
    }
}
