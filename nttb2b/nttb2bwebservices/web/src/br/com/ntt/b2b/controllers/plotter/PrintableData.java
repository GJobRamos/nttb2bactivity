package br.com.ntt.b2b.controllers.plotter;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

public class PrintableData {
    private static final Logger LOGGER= Logger.getLogger(PrintableData.class);
    public void printData(CustomerData tmaCustomerData) {
        Assert.notNull(tmaCustomerData, "PrintableData arameter source cannot be null.");

        LOGGER.info("CUSTOMER WITH ID: " + tmaCustomerData.getCustomerId());
        LOGGER.info("{");
        LOGGER.info("\tbirthdate: to_be_implemented...");

        if(tmaCustomerData.getCurrency() != null) {
            LOGGER.info("\tcurrency {");
            LOGGER.info("\t\tactive: " + tmaCustomerData.getCurrency().isActive());
            LOGGER.info("\t\tisocode: " + tmaCustomerData.getCurrency().getIsocode());
            LOGGER.info("\t\tname: " + tmaCustomerData.getCurrency().getName());
            LOGGER.info("\t\tsymbol: " + tmaCustomerData.getCurrency().getSymbol());
            LOGGER.info("\t}");
        }

        LOGGER.info("\tcustomerId: " + tmaCustomerData.getCustomerId());
        LOGGER.info("\tdeactivationDate: " + tmaCustomerData.getDeactivationDate());

        if(tmaCustomerData.getDefaultAddress() != null) {
            LOGGER.info("\tdefaultAddress {");
            LOGGER.info("\t\tapartment: " + tmaCustomerData.getDefaultAddress().getApartment());
            LOGGER.info("\t\tbillingAddress: " + tmaCustomerData.getDefaultAddress().isBillingAddress());
            LOGGER.info("\t\tbuilding: " + tmaCustomerData.getDefaultAddress().getBuilding());
            LOGGER.info("\t\tcellphone: " + tmaCustomerData.getDefaultAddress().getCellphone());
            LOGGER.info("\t\tcompanyName: " + tmaCustomerData.getDefaultAddress().getCompanyName());
            LOGGER.info("\t\tcomplement: " + tmaCustomerData.getDefaultAddress().getCode() + " ?? CODE ??");

            if(tmaCustomerData.getDefaultAddress().getCountry() != null) {
                LOGGER.info("\t\tcountry {");
                LOGGER.info("\t\t\tisocode: " + tmaCustomerData.getDefaultAddress().getCountry().getIsocode());
                LOGGER.info("\t\t\tname: " + tmaCustomerData.getDefaultAddress().getCountry().getName());
                LOGGER.info("\t\t}");
            }

            LOGGER.info("\t\tdefaultAddress: " + tmaCustomerData.getDefaultAddress().isDefaultAddress());
            LOGGER.info("\t\tdistric: " + tmaCustomerData.getDefaultAddress().getDistrict());
            LOGGER.info("\t\temail: " + tmaCustomerData.getDefaultAddress().getEmail());
            LOGGER.info("\t\tfirstName: " + tmaCustomerData.getDefaultAddress().getFirstName());
            LOGGER.info("\t\tformattedAddress: " + tmaCustomerData.getDefaultAddress().getFormattedAddress());
            LOGGER.info("\t\tid: " + tmaCustomerData.getDefaultAddress().getId());
            LOGGER.info("\t\tinstallationAddress: " + tmaCustomerData.getDefaultAddress().isInstallationAddress());
            LOGGER.info("\t\tlastName: " + tmaCustomerData.getDefaultAddress().getLastName());
            LOGGER.info("\t\tline1: " + tmaCustomerData.getDefaultAddress().getLine1());
            LOGGER.info("\t\tline2: " + tmaCustomerData.getDefaultAddress().getLine2());
            LOGGER.info("\t\tphone: " + tmaCustomerData.getDefaultAddress().getPhone());
            LOGGER.info("\t\tpostalCode: " + tmaCustomerData.getDefaultAddress().getPostalCode());
            LOGGER.info("\t\treferencePoint: to_be_implemented...");

            if(tmaCustomerData.getDefaultAddress().getRegion() != null) {
                LOGGER.info("\t\tregion {");
                LOGGER.info("\t\t\tcountryIso: " + tmaCustomerData.getDefaultAddress().getRegion().getCountryIso());
                LOGGER.info("\t\t\tisocode: " + tmaCustomerData.getDefaultAddress().getRegion().getIsocode());
                LOGGER.info("\t\t\tisocodeShort" + tmaCustomerData.getDefaultAddress().getRegion().getIsocodeShort());
                LOGGER.info("\t\t\tname: " + tmaCustomerData.getDefaultAddress().getRegion().getName());
                LOGGER.info("\t\t\trole: to_be_implemented...");
                LOGGER.info("\t\t}");
            }

            LOGGER.info("\t\triskArea: " + tmaCustomerData.getDefaultAddress().getRiskArea());
            LOGGER.info("\t\tshippingAddress: " + tmaCustomerData.getDefaultAddress().isShippingAddress());
            LOGGER.info("\t\ttitle: " + tmaCustomerData.getDefaultAddress().getTitle());
            LOGGER.info("\t\ttitleCode: " + tmaCustomerData.getDefaultAddress().getTitleCode());
            LOGGER.info("\t\ttown: " + tmaCustomerData.getDefaultAddress().getTown());
            LOGGER.info("\t\tvisibleInAddressBook: " + tmaCustomerData.getDefaultAddress().isVisibleInAddressBook());
            LOGGER.info("\t}");
        }
        LOGGER.info("\tdisplayUid" + tmaCustomerData.getDisplayUid());
        LOGGER.info("\temail: " + tmaCustomerData.getEmail());
        LOGGER.info("\tfirstName: " + tmaCustomerData.getFirstName());

        if(!tmaCustomerData.getIdentifications().isEmpty()) {
            LOGGER.info("\tidentifications {");
            LOGGER.info("\t\tidentificationNumber: " + tmaCustomerData.getIdentifications().iterator().next().getIdentificationNumber());
            LOGGER.info("\t\tidentificaitonType: " + tmaCustomerData.getIdentifications().iterator().next().getIdentificationType());
            LOGGER.info("\t}");
        }

        if(tmaCustomerData.getLanguage() != null) {
            LOGGER.info("\tlanguage {");
            LOGGER.info("\t\tactive: " + tmaCustomerData.getLanguage().isActive());
            LOGGER.info("\t\tisocode: " + tmaCustomerData.getLanguage().getIsocode());
            LOGGER.info("\t\tname: " + tmaCustomerData.getLanguage().getName());
            LOGGER.info("\t\tnativeName: " + tmaCustomerData.getLanguage().getNativeName());
            LOGGER.info("\t}");
        }

        LOGGER.info("\tlastName: " + tmaCustomerData.getLastName());
        LOGGER.info("\tmobilephone: " + tmaCustomerData.getContactNumber());
        LOGGER.info("\tmothersName: to_be_implemented...\n");
        LOGGER.info("\tname: " + tmaCustomerData.getName());
        LOGGER.info("\tnickname: to_be_implemented...\n");
        LOGGER.info("\tsmsNotification: to_be_implemented...");
        LOGGER.info("\ttitle: " + tmaCustomerData.getTitle());
        LOGGER.info("\ttitleCode: " + tmaCustomerData.getTitleCode());
        LOGGER.info("\tuid: " + tmaCustomerData.getUid());
        LOGGER.info("\twhatsappNotification: to_be_implemented...");
        LOGGER.info("\trg: " + tmaCustomerData.getRg());
        LOGGER.info("\tpassport: " + tmaCustomerData.getPassport());
        LOGGER.info("}");
    }
}
