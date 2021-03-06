/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class InsuranceExtraCoverageExtraDataBuilder {
    //the instance to build
    private InsuranceExtraCoverageExtraData insuranceExtraCoverageExtraData;

    /**
     * Default constructor to initialize the instance
     */
    public InsuranceExtraCoverageExtraDataBuilder() {
        insuranceExtraCoverageExtraData = new InsuranceExtraCoverageExtraData();
    }

    public InsuranceExtraCoverageExtraDataBuilder defaultStatus(boolean defaultStatus) {
        insuranceExtraCoverageExtraData.setDefaultStatus(defaultStatus);
        return this;
    }

    public InsuranceExtraCoverageExtraDataBuilder requiringExpertVisit(boolean requiringExpertVisit) {
        insuranceExtraCoverageExtraData.setRequiringExpertVisit(requiringExpertVisit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InsuranceExtraCoverageExtraData build() {
        return insuranceExtraCoverageExtraData;
    }
}