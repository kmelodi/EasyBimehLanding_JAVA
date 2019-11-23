/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class PopupImageGalleryieBuilder {
    //the instance to build
    private PopupImageGalleryie popupImageGalleryie;

    /**
     * Default constructor to initialize the instance
     */
    public PopupImageGalleryieBuilder() {
        popupImageGalleryie = new PopupImageGalleryie();
    }

    public PopupImageGalleryieBuilder cached(boolean cached) {
        popupImageGalleryie.setCached(cached);
        return this;
    }

    public PopupImageGalleryieBuilder url(String url) {
        popupImageGalleryie.setUrl(url);
        return this;
    }

    public PopupImageGalleryieBuilder thumbnailUrl(String thumbnailUrl) {
        popupImageGalleryie.setThumbnailUrl(thumbnailUrl);
        return this;
    }

    public PopupImageGalleryieBuilder altText(String altText) {
        popupImageGalleryie.setAltText(altText);
        return this;
    }

    public PopupImageGalleryieBuilder title(String title) {
        popupImageGalleryie.setTitle(title);
        return this;
    }

    public PopupImageGalleryieBuilder extUrl(String extUrl) {
        popupImageGalleryie.setExtUrl(extUrl);
        return this;
    }

    public PopupImageGalleryieBuilder extUrlTarget(String extUrlTarget) {
        popupImageGalleryie.setExtUrlTarget(extUrlTarget);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PopupImageGalleryie build() {
        return popupImageGalleryie;
    }
}