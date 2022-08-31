package br.com.ntt.b2b.facades.populators.requestPopulators;

import br.com.ntt.b2b.facades.Dto.TmaCustomerRequest;
import de.hybris.platform.b2ctelcofacades.data.TmaIdentificationData;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class TmaCustomerRequestConverter {
    TmaAddressRequestConverter tmaAddressRequestPopulator;
    TmaIdentificationsRequestConverter tmaIdentificationsRequestConverter;
    private static final Logger LOGGER = Logger.getLogger(TmaCustomerRequestConverter.class);

    public void convertRequest(CustomerData target, TmaCustomerRequest source) {
        Assert.notNull(source, "Parameter source cannot be null.");
        Assert.notNull(target, "Parameter target cannot be null.");

        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("...");
        LOGGER.info("Customer Request Convertion started...");

        if(source.getAddress() != null) {
            AddressData addressData = new AddressData();
            tmaAddressRequestPopulator.convertRequest(addressData, source.getAddress());
            target.setDefaultAddress(addressData);
        }

        target.setFirstName(source.getFirstName());

        if(!source.getIdentifications().isEmpty()) {
            List<TmaIdentificationData> identifications = new ArrayList<TmaIdentificationData>();
            TmaIdentificationData identificationData = new TmaIdentificationData();
            tmaIdentificationsRequestConverter.convertRequest(identificationData, source.getIdentifications().iterator().next());
            identifications.add(identificationData);
            target.setIdentifications(identifications);
        }

        target.setLastName(source.getLastName());
        target.setName(source.getFirstName() + " " + source.getLastName());
        target.setTitle(source.getTitle());
        target.setTitleCode(source.getTitleCode());
        target.setUid(source.getUid());
        target.setRg(source.getRg());
        target.setCpf(source.getCpf());
        target.setPassport(source.getPassport());

        target.setCustomerId(generateCustomerID(source.getCpf(), source.getFirstName(), source.getLastName()));

        generateCurrency(target);
        generateLanguage(target);

    }

    private void generateCurrency(CustomerData target) {
        CurrencyData currencyModel = new CurrencyData();

        currencyModel.setActive(true);
        currencyModel.setIsocode("986");
        currencyModel.setName("Brazilian Real");
        currencyModel.setSymbol("BRL");

        target.setCurrency(currencyModel);
    }

    private void generateLanguage(CustomerData target) {
        LanguageData languageData = new LanguageData();
        languageData.setActive(true);
        languageData.setIsocode("pt-br");
        languageData.setName("Portuguese (Brazil)");
        languageData.setNativeName("Portugues");

        target.setLanguage(languageData);
    }

    private String generateCustomerID(String cpf, String firstName, String lastName){
        return firstName.charAt(0) + lastName.charAt(0) + cpf;
    }

    public void setTmaAddressRequestPopulator(TmaAddressRequestConverter tmaAddressRequestPopulator) {
        this.tmaAddressRequestPopulator = tmaAddressRequestPopulator;
    }

    public void setTmaIdentificationsRequestConverter(TmaIdentificationsRequestConverter tmaIdentificationsRequestConverter) {
        this.tmaIdentificationsRequestConverter = tmaIdentificationsRequestConverter;
    }
}
