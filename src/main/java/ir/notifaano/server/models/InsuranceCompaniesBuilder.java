/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class InsuranceCompaniesBuilder {
    //the instance to build
    private InsuranceCompanies insuranceCompanies;

    /**
     * Default constructor to initialize the instance
     */
    public InsuranceCompaniesBuilder() {
        insuranceCompanies = new InsuranceCompanies();
    }

    public InsuranceCompaniesBuilder isSuccess(boolean isSuccess) {
        insuranceCompanies.setIsSuccess(isSuccess);
        return this;
    }

    public InsuranceCompaniesBuilder status(int status) {
        insuranceCompanies.setStatus(status);
        return this;
    }

    public InsuranceCompaniesBuilder message(List<ComboDataModel> message) {
        insuranceCompanies.setMessage(message);
        return this;
    }

    public InsuranceCompaniesBuilder extraData(String extraData) {
        insuranceCompanies.setExtraData(extraData);
        return this;
    }

    public InsuranceCompaniesBuilder exception(String exception) {
        insuranceCompanies.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InsuranceCompanies build() {
        return insuranceCompanies;
    }
}