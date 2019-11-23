/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class ExpertiseBuilder {
    //the instance to build
    private Expertise expertise;

    /**
     * Default constructor to initialize the instance
     */
    public ExpertiseBuilder() {
        expertise = new Expertise();
    }

    public ExpertiseBuilder id(int id) {
        expertise.setId(id);
        return this;
    }

    public ExpertiseBuilder title(String title) {
        expertise.setTitle(title);
        return this;
    }

    public ExpertiseBuilder extraData(String extraData) {
        expertise.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Expertise build() {
        return expertise;
    }
}