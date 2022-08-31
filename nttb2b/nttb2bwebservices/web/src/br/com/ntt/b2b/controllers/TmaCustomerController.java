package br.com.ntt.b2b.controllers;

import br.com.ntt.b2b.Dto.TmaCustomerRequest;
import br.com.ntt.b2b.controllers.plotter.PrintableData;
import br.com.ntt.b2b.facades.tmaCustomer.TrainingTmaCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/tmaCustomer")
@Api(tags="TmaCustomer")
public class TmaCustomerController {
    @Resource(name = "trainingTmaCustomerFacade")
    private TrainingTmaCustomerFacade tmaCustomerFacade;
    private static final Logger LOGGER= Logger.getLogger(TmaCustomerController.class);
    private PrintableData printableData;


        @PostMapping(value = "/registerTmaCustomer")
        @ResponseBody
        @ResponseStatus(HttpStatus.CREATED)
        @ApiOperation(nickname = "registerTmaCustomer", value = "Register a customer", notes = "Register a new customer.", produces = "application/json", consumes = "application/json", authorizations = {
                @Authorization(value = "oauth2_client_credentials")})
        @ApiBaseSiteIdParam
        public void registerTmaCustomerProfile(
                @ApiParam(value = "Sample request body parameter (DTO in xml or json format). It should be returned as response DTO", required = true) @RequestBody final TmaCustomerRequest tmaCustomerRequest
        ) {

            CustomerData tmaCustomerData = new CustomerData();

            tmaCustomerFacade.convertRequest(tmaCustomerData, tmaCustomerRequest);

            printTitle("REGISTER NEW TMACUSTOMER");
            printableData = new PrintableData();
            printableData.printData(tmaCustomerData);

            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("TmaCustomer populate process started...");
            LOGGER.info("");

            boolean status = tmaCustomerFacade.registerTmaCustomer(tmaCustomerData);

            if (status) {
                LOGGER.info("Registration Status: " + status);
                printTitle("NEW STUDENT SAVED");
            } else {
                LOGGER.info("Student could not be inserted in the DB.");
            }
        }

        @GetMapping(value = "/getCustomerProfile/{tmaCustomerId}")
        @ResponseBody
        @ApiOperation(  nickname = "getCustomerProfile",
                value = "Get a customer profile",
                notes = "Get an existing customer profile.",
                authorizations = {@Authorization(value = "oauth2_client_credentials")})
        @ApiBaseSiteIdParam
        public void getCustomerProfile(@ApiParam(defaultValue = "insert a valid Customer Id", required = true)  @PathVariable final String tmaCustomerId) {

            printTitle("SEARCHING TMACUSTOMER ID: " + tmaCustomerId);

            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("TmaCustomer search by id process started...");
            LOGGER.info("");

            CustomerData tmaCustomerData = tmaCustomerFacade.getTmaCustomerById(tmaCustomerId);

            if(tmaCustomerData != null) {
                printableData = new PrintableData();
                printableData.printData(tmaCustomerData);
            } else {
                LOGGER.info("...");
                LOGGER.info("...");
                LOGGER.info("...");
                LOGGER.info("ALERT: TMACUSTOMER WITH ID " + tmaCustomerId + " NOT FOUND!!!");
            }
        }

        @PutMapping(value = "/updateCustomerProfile")
        @ResponseBody
        @ApiOperation(  nickname = "updateCustomerProfile",
                value = "Update a customer profile",
                notes = "Update an existing cutomer profile.",
                authorizations = {@Authorization(value = "oauth2_client_credentials")})
        @ApiBaseSiteIdParam
        public void updateCustomerProfile(@RequestBody TmaCustomerRequest tmaCustomerRequest) {

            LOGGER.info("TmaCustomer update starting...");
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");

            CustomerData tmaCustomerData = new CustomerData();

            tmaCustomerFacade.convertRequest(tmaCustomerData, tmaCustomerRequest);

            CustomerData updatedTmaCustomer = tmaCustomerFacade.updateTmaCustomer(tmaCustomerData);

            printableData = new PrintableData();
            printableData.printData(updatedTmaCustomer);

            printTitle("TMACUSTOMER PROFILE UPDATE FINISHED");
        }

        @DeleteMapping (value = "/deleteCustomerProfile/{tmaCustomerId}")
        @ResponseBody
        @ApiOperation(  nickname = "deleteCustomerProfile",
                value = "Delete a customer profile",
                notes = "Delete an existing cutomer profile.",
                authorizations = {@Authorization(value = "oauth2_client_credentials")})
        @ApiBaseSiteIdParam
        public void deleteCustomerProfile(@ApiParam(defaultValue = "insert a valid Customer Id", required = true)  @RequestParam final String tmaCustomerId) {

            printTitle("DELETING TMACUSTOMER ID: " + tmaCustomerId);

            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("...");
            LOGGER.info("TmaCustomer deleting by id process started...");
            LOGGER.info("");


            boolean status = tmaCustomerFacade.deleteTmaCustomerById(tmaCustomerId);

            if(status)
                LOGGER.info("DELETING STATUS: " + status);
            else {
                LOGGER.info("...");
                LOGGER.info("...");
                LOGGER.info("...");
                LOGGER.info("ALERT: TMACUSTOMER WITH ID " + tmaCustomerId + " NOT FOUND!!!");
            }
        }

    // Impime título
    public void printTitle(String title) {
        StringBuilder bar = new StringBuilder();

        bar.append("-".repeat(Math.max(0, title.length() + 4)));

        LOGGER.info("\t" + bar.toString());
        LOGGER.info("\t- " + title + " -");
        LOGGER.info("\t" + bar.toString());
    }
}
