/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelInsurancePolicyTrackingBuilder {
    //the instance to build
    private BaseModelInsurancePolicyTracking baseModelInsurancePolicyTracking;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelInsurancePolicyTrackingBuilder() {
        baseModelInsurancePolicyTracking = new BaseModelInsurancePolicyTracking();
    }

    public BaseModelInsurancePolicyTrackingBuilder isSuccess(boolean isSuccess) {
        baseModelInsurancePolicyTracking.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelInsurancePolicyTrackingBuilder status(int status) {
        baseModelInsurancePolicyTracking.setStatus(status);
        return this;
    }

    public BaseModelInsurancePolicyTrackingBuilder message(InsurancePolicyTracking message) {
        baseModelInsurancePolicyTracking.setMessage(message);
        return this;
    }

    public BaseModelInsurancePolicyTrackingBuilder extraData(String extraData) {
        baseModelInsurancePolicyTracking.setExtraData(extraData);
        return this;
    }

    public BaseModelInsurancePolicyTrackingBuilder exception(String exception) {
        baseModelInsurancePolicyTracking.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelInsurancePolicyTracking build() {
        return baseModelInsurancePolicyTracking;
    }
}