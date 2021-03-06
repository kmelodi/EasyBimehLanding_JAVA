/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class CarBrandBuilder {
    //the instance to build
    private CarBrand carBrand;

    /**
     * Default constructor to initialize the instance
     */
    public CarBrandBuilder() {
        carBrand = new CarBrand();
    }

    public CarBrandBuilder isSuccess(boolean isSuccess) {
        carBrand.setIsSuccess(isSuccess);
        return this;
    }

    public CarBrandBuilder status(int status) {
        carBrand.setStatus(status);
        return this;
    }

    public CarBrandBuilder message(List<DiviceFranchisee> message) {
        carBrand.setMessage(message);
        return this;
    }

    public CarBrandBuilder extraData(String extraData) {
        carBrand.setExtraData(extraData);
        return this;
    }

    public CarBrandBuilder exception(String exception) {
        carBrand.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CarBrand build() {
        return carBrand;
    }
}