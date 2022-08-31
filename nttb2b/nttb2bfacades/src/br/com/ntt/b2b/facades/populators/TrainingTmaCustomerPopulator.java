package br.com.ntt.b2b.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class TrainingTmaCustomerPopulator extends CustomerPopulator {
    private static final Logger LOGGER = Logger.getLogger(TrainingTmaCustomerPopulator.class);

    @Override
    public void populate(final CustomerModel source, final CustomerData target) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("TmaCustomer Populator received tmaCustomerData to convert to tmaCustomerModel...");

        super.populate(source, target);

        target.setCpf(source.getCpf());
        target.setRg(source.getRg());
        target.setPassport(source.getPassport());

        LOGGER.info("...");
        LOGGER.info("Convertion concluded...");
    }

}
