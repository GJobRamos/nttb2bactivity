package br.com.ntt.b2b.core.service.impl;

import br.com.ntt.b2b.core.Dao.impl.TrainingTmaCustomerDaoImpl;
import br.com.ntt.b2b.core.service.TrainingTmaCustomerService;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;

import java.util.List;

public class TrainingTmaCustomerServiceImpl implements TrainingTmaCustomerService {

    private static final Logger LOGGER = Logger.getLogger(TrainingTmaCustomerServiceImpl.class);

    private TrainingTmaCustomerDaoImpl trainingTmaCustomerDao;
    @Override
    public CustomerModel getTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("TmaCustomer Service received tmaCustomerId and pass through DAO to search a matching Customer at the Data Base...");

        return trainingTmaCustomerDao.getTmaCustomerById(tmaCustomerId);
    }

    @Override
    public boolean registerTmaCustomer(CustomerModel tmaCustomerModel) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("TmaCustomer Service received tmaCustomerModel and pass through DAO to populate the Data Base...");

        return trainingTmaCustomerDao.registerNewTmaCustomer(tmaCustomerModel);
    }

    @Override
    public boolean deleteTmaCustomerById(String tmaCustomerId) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("TmaCustomer Service received tmaCustomerModel to call DAO to search a matching Customer the Data Base and delete its data...");

        return trainingTmaCustomerDao.deleteTmaCustomerById(tmaCustomerId);
    }

    @Override
    public CustomerModel updateTmaCustomer(CustomerModel updatedTmaCustomerModel) {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Tma Customer Service received tmaCustomerModel and pass through DAO to update an existing Customer profile at the Data Base...");

        return trainingTmaCustomerDao.updateTmaCustomer(updatedTmaCustomerModel);
    }

    @Override
    public List<CustomerModel> getAllTmaCustomers() {
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Tma Customer Service received the order to pass through Dao to search for all existing CustomerProfile in the Data Base...");

        return trainingTmaCustomerDao.getAllTmaCustomers();
    }

    public TrainingTmaCustomerDaoImpl getTrainingTmaCustomerDao() {
        return trainingTmaCustomerDao;
    }

    public void setTrainingTmaCustomerDao(TrainingTmaCustomerDaoImpl trainingTmaCustomerDao) {
        this.trainingTmaCustomerDao = trainingTmaCustomerDao;
    }
}
