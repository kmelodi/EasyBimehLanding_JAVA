/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class Status200Builder {
    //the instance to build
    private Status200 status200;

    /**
     * Default constructor to initialize the instance
     */
    public Status200Builder() {
        status200 = new Status200();
    }

    public Status200Builder isSuccess(boolean isSuccess) {
        status200.setIsSuccess(isSuccess);
        return this;
    }

    public Status200Builder status(int status) {
        status200.setStatus(status);
        return this;
    }

    public Status200Builder message(GetAccessTokenUserInfo message) {
        status200.setMessage(message);
        return this;
    }

    public Status200Builder extraData(String extraData) {
        status200.setExtraData(extraData);
        return this;
    }

    public Status200Builder exception(String exception) {
        status200.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Status200 build() {
        return status200;
    }
}