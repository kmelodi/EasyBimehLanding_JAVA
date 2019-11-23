/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelPortalLandingContactAboutBuilder {
    //the instance to build
    private BaseModelPortalLandingContactAbout baseModelPortalLandingContactAbout;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelPortalLandingContactAboutBuilder() {
        baseModelPortalLandingContactAbout = new BaseModelPortalLandingContactAbout();
    }

    public BaseModelPortalLandingContactAboutBuilder isSuccess(boolean isSuccess) {
        baseModelPortalLandingContactAbout.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelPortalLandingContactAboutBuilder status(int status) {
        baseModelPortalLandingContactAbout.setStatus(status);
        return this;
    }

    public BaseModelPortalLandingContactAboutBuilder message(PortalLandingContactAbout message) {
        baseModelPortalLandingContactAbout.setMessage(message);
        return this;
    }

    public BaseModelPortalLandingContactAboutBuilder extraData(String extraData) {
        baseModelPortalLandingContactAbout.setExtraData(extraData);
        return this;
    }

    public BaseModelPortalLandingContactAboutBuilder exception(String exception) {
        baseModelPortalLandingContactAbout.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelPortalLandingContactAbout build() {
        return baseModelPortalLandingContactAbout;
    }
}