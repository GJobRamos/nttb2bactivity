package br.com.ntt.b2b.facades.populators.requestPopulators;

import br.com.ntt.b2b.Dto.TmaIdentificationsRequest;
import de.hybris.platform.b2ctelcofacades.data.TmaIdentificationData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class TmaIdentificationsRequestConverter {
    private static final Logger LOGGER = Logger.getLogger(TmaIdentificationsRequestConverter.class);
    public void convertRequest(TmaIdentificationData target, TmaIdentificationsRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("Customer Request Identifications Convertion started...");

        target.setIdentificationNumber(source.getIdentificationNumber());
        target.setIdentificationType(source.getIdentificationNumber());

    }
}
