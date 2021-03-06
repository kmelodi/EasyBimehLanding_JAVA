/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class HasPlanBuilder {
    //the instance to build
    private HasPlan hasPlan;

    /**
     * Default constructor to initialize the instance
     */
    public HasPlanBuilder() {
        hasPlan = new HasPlan();
    }

    public HasPlanBuilder isSuccess(boolean isSuccess) {
        hasPlan.setIsSuccess(isSuccess);
        return this;
    }

    public HasPlanBuilder status(int status) {
        hasPlan.setStatus(status);
        return this;
    }

    /**
     * آیا طرح بیمه ای دارد؟
     */
    public HasPlanBuilder message(boolean message) {
        hasPlan.setMessage(message);
        return this;
    }

    public HasPlanBuilder extraData(String extraData) {
        hasPlan.setExtraData(extraData);
        return this;
    }

    public HasPlanBuilder exception(String exception) {
        hasPlan.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HasPlan build() {
        return hasPlan;
    }
}