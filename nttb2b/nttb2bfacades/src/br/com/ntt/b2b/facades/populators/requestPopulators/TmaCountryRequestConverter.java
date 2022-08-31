package br.com.ntt.b2b.facades.populators.requestPopulators;

import br.com.ntt.b2b.facades.Dto.TmaCountryRequest;
import de.hybris.platform.commercefacades.user.data.CountryData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class TmaCountryRequestConverter {
    private static final Logger LOGGER = Logger.getLogger(TmaCountryRequestConverter.class);

    public void convertRequest(CountryData target, TmaCountryRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("Customer Request Country Convertion started...");

        target.setIsocode(source.getIsocode());
        target.setName(source.getName());
    }
}
