package br.com.ntt.b2b.facades.populators.requestPopulators;

import br.com.ntt.b2b.Dto.TmaRegionRequest;
import de.hybris.platform.commercefacades.user.data.RegionData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class TmaRegionRequestConverter {
    private static final Logger LOGGER = Logger.getLogger(TmaRegionRequestConverter.class);

    public void convertRequest(RegionData target, TmaRegionRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("Customer Request Region Convertion started...");

        target.setCountryIso(source.getCountryIso());
        target.setIsocode(source.getIsocode());
        target.setIsocodeShort(source.getIsocodeShort());
        target.setName(source.getName());
    }
}
