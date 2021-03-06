/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelTrakingCodeBuilder {
    //the instance to build
    private BaseModelTrakingCode baseModelTrakingCode;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelTrakingCodeBuilder() {
        baseModelTrakingCode = new BaseModelTrakingCode();
    }

    public BaseModelTrakingCodeBuilder isSuccess(boolean isSuccess) {
        baseModelTrakingCode.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelTrakingCodeBuilder status(int status) {
        baseModelTrakingCode.setStatus(status);
        return this;
    }

    public BaseModelTrakingCodeBuilder message(List<TrackingCode> message) {
        baseModelTrakingCode.setMessage(message);
        return this;
    }

    public BaseModelTrakingCodeBuilder extraData(String extraData) {
        baseModelTrakingCode.setExtraData(extraData);
        return this;
    }

    public BaseModelTrakingCodeBuilder exception(String exception) {
        baseModelTrakingCode.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelTrakingCode build() {
        return baseModelTrakingCode;
    }
}