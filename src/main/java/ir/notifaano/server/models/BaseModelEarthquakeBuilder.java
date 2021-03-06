/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelEarthquakeBuilder {
    //the instance to build
    private BaseModelEarthquake baseModelEarthquake;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelEarthquakeBuilder() {
        baseModelEarthquake = new BaseModelEarthquake();
    }

    public BaseModelEarthquakeBuilder isSuccess(boolean isSuccess) {
        baseModelEarthquake.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelEarthquakeBuilder status(int status) {
        baseModelEarthquake.setStatus(status);
        return this;
    }

    public BaseModelEarthquakeBuilder message(Earthquake message) {
        baseModelEarthquake.setMessage(message);
        return this;
    }

    public BaseModelEarthquakeBuilder extraData(String extraData) {
        baseModelEarthquake.setExtraData(extraData);
        return this;
    }

    public BaseModelEarthquakeBuilder exception(String exception) {
        baseModelEarthquake.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelEarthquake build() {
        return baseModelEarthquake;
    }
}