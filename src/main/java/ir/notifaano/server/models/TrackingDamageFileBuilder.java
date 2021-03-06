/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class TrackingDamageFileBuilder {
    //the instance to build
    private TrackingDamageFile trackingDamageFile;

    /**
     * Default constructor to initialize the instance
     */
    public TrackingDamageFileBuilder() {
        trackingDamageFile = new TrackingDamageFile();
    }

    public TrackingDamageFileBuilder id(int id) {
        trackingDamageFile.setId(id);
        return this;
    }

    public TrackingDamageFileBuilder url(String url) {
        trackingDamageFile.setUrl(url);
        return this;
    }

    public TrackingDamageFileBuilder title(String title) {
        trackingDamageFile.setTitle(title);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TrackingDamageFile build() {
        return trackingDamageFile;
    }
}