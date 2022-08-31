package br.com.ntt.b2b.facades.populators.requestPopulators;

import br.com.ntt.b2b.facades.Dto.TmaAddressRequest;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.RegionData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class TmaAddressRequestConverter {
    TmaCountryRequestConverter tmaCountryRequestConverter;
    TmaRegionRequestConverter tmaRegionRequestConverter;
    private static final Logger LOGGER = Logger.getLogger(TmaAddressRequestConverter.class);

    public void convertRequest(AddressData target, TmaAddressRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("Customer Request Address Convertion started...");

        target.setApartment(source.getApartment());
        target.setBillingAddress(source.isBillingAddress());
        target.setBuilding(source.getBuilding());
        target.setCellphone(source.getCellphone());
        target.setCompanyName(source.getCompanyName());

        if (source.getCountry() != null) {
            CountryData countryData = new CountryData();
            tmaCountryRequestConverter.convertRequest(countryData, source.getCountry());
            target.setCountry(countryData);
        }

        target.setDefaultAddress(source.isDefaultAddress());
        target.setDistrict(source.getDistrict());
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setFormattedAddress(source.getFormattedAddress());
        target.setLastName(source.getLastName());
        target.setLine1(source.getLine1());
        target.setLine2(source.getLine2());
        target.setPhone(source.getPhone());
        target.setPostalCode(source.getPostalCode());

        if(source.getRegion() != null) {
            RegionData regionData = new RegionData();
            tmaRegionRequestConverter.convertRequest(regionData, source.getRegion());
            target.setRegion(regionData);
        }

        target.setRiskArea(source.isRiskArea());
        target.setShippingAddress(source.isShippingAddress());
        target.setTitle(source.getTitle());
        target.setTitleCode(source.getTitleCode());
        target.setTown(source.getTown());
        target.setVisibleInAddressBook(source.isVisibleInAddressBook());
    }

    public void setTmaCountryRequestConverter(TmaCountryRequestConverter tmaCountryRequestConverter) {
        this.tmaCountryRequestConverter = tmaCountryRequestConverter;
    }

    public void setTmaRegionRequestConverter(TmaRegionRequestConverter tmaRegionRequestConverter) {
        this.tmaRegionRequestConverter = tmaRegionRequestConverter;
    }
}
