/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelDiviceFranchiseeBuilder {
    //the instance to build
    private BaseModelDiviceFranchisee baseModelDiviceFranchisee;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelDiviceFranchiseeBuilder() {
        baseModelDiviceFranchisee = new BaseModelDiviceFranchisee();
    }

    public BaseModelDiviceFranchiseeBuilder isSuccess(boolean isSuccess) {
        baseModelDiviceFranchisee.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelDiviceFranchiseeBuilder status(int status) {
        baseModelDiviceFranchisee.setStatus(status);
        return this;
    }

    public BaseModelDiviceFranchiseeBuilder message(List<DiviceFranchisee> message) {
        baseModelDiviceFranchisee.setMessage(message);
        return this;
    }

    public BaseModelDiviceFranchiseeBuilder extraData(String extraData) {
        baseModelDiviceFranchisee.setExtraData(extraData);
        return this;
    }

    public BaseModelDiviceFranchiseeBuilder exception(String exception) {
        baseModelDiviceFranchisee.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelDiviceFranchisee build() {
        return baseModelDiviceFranchisee;
    }
}