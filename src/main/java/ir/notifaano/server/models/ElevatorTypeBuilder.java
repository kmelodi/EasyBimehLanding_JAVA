/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class ElevatorTypeBuilder {
    //the instance to build
    private ElevatorType elevatorType;

    /**
     * Default constructor to initialize the instance
     */
    public ElevatorTypeBuilder() {
        elevatorType = new ElevatorType();
    }

    public ElevatorTypeBuilder id(int id) {
        elevatorType.setId(id);
        return this;
    }

    public ElevatorTypeBuilder title(String title) {
        elevatorType.setTitle(title);
        return this;
    }

    public ElevatorTypeBuilder extraData(boolean extraData) {
        elevatorType.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ElevatorType build() {
        return elevatorType;
    }
}