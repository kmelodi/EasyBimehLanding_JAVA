/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class CarBrandModelBuilder {
    //the instance to build
    private CarBrandModel carBrandModel;

    /**
     * Default constructor to initialize the instance
     */
    public CarBrandModelBuilder() {
        carBrandModel = new CarBrandModel();
    }

    public CarBrandModelBuilder id(int id) {
        carBrandModel.setId(id);
        return this;
    }

    public CarBrandModelBuilder title(String title) {
        carBrandModel.setTitle(title);
        return this;
    }

    public CarBrandModelBuilder extraData(String extraData) {
        carBrandModel.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CarBrandModel build() {
        return carBrandModel;
    }
}