/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class ZoneBuilder {
    //the instance to build
    private Zone zone;

    /**
     * Default constructor to initialize the instance
     */
    public ZoneBuilder() {
        zone = new Zone();
    }

    public ZoneBuilder id(String id) {
        zone.setId(id);
        return this;
    }

    public ZoneBuilder title(String title) {
        zone.setTitle(title);
        return this;
    }

    public ZoneBuilder extraData(String extraData) {
        zone.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Zone build() {
        return zone;
    }
}