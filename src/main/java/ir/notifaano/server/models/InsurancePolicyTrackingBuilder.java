/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class InsurancePolicyTrackingBuilder {
    //the instance to build
    private InsurancePolicyTracking insurancePolicyTracking;

    /**
     * Default constructor to initialize the instance
     */
    public InsurancePolicyTrackingBuilder() {
        insurancePolicyTracking = new InsurancePolicyTracking();
    }

    public InsurancePolicyTrackingBuilder id(int id) {
        insurancePolicyTracking.setId(id);
        return this;
    }

    public InsurancePolicyTrackingBuilder aliasName(String aliasName) {
        insurancePolicyTracking.setAliasName(aliasName);
        return this;
    }

    public InsurancePolicyTrackingBuilder status(String status) {
        insurancePolicyTracking.setStatus(status);
        return this;
    }

    public InsurancePolicyTrackingBuilder createOnPersianDate(String createOnPersianDate) {
        insurancePolicyTracking.setCreateOnPersianDate(createOnPersianDate);
        return this;
    }

    public InsurancePolicyTrackingBuilder centerName(String centerName) {
        insurancePolicyTracking.setCenterName(centerName);
        return this;
    }

    public InsurancePolicyTrackingBuilder insurancePolicyType(int insurancePolicyType) {
        insurancePolicyTracking.setInsurancePolicyType(insurancePolicyType);
        return this;
    }

    public InsurancePolicyTrackingBuilder insuranceType(String insuranceType) {
        insurancePolicyTracking.setInsuranceType(insuranceType);
        return this;
    }

    public InsurancePolicyTrackingBuilder price(int price) {
        insurancePolicyTracking.setPrice(price);
        return this;
    }

    public InsurancePolicyTrackingBuilder paymented(String paymented) {
        insurancePolicyTracking.setPaymented(paymented);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InsurancePolicyTracking build() {
        return insurancePolicyTracking;
    }
}