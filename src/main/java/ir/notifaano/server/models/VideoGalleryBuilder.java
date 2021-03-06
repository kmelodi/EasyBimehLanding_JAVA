/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class VideoGalleryBuilder {
    //the instance to build
    private VideoGallery videoGallery;

    /**
     * Default constructor to initialize the instance
     */
    public VideoGalleryBuilder() {
        videoGallery = new VideoGallery();
    }

    public VideoGalleryBuilder id(int id) {
        videoGallery.setId(id);
        return this;
    }

    public VideoGalleryBuilder galleryType(int galleryType) {
        videoGallery.setGalleryType(galleryType);
        return this;
    }

    public VideoGalleryBuilder title(String title) {
        videoGallery.setTitle(title);
        return this;
    }

    public VideoGalleryBuilder alt(String alt) {
        videoGallery.setAlt(alt);
        return this;
    }

    public VideoGalleryBuilder description(String description) {
        videoGallery.setDescription(description);
        return this;
    }

    public VideoGalleryBuilder isActive(boolean isActive) {
        videoGallery.setIsActive(isActive);
        return this;
    }

    public VideoGalleryBuilder isMain(boolean isMain) {
        videoGallery.setIsMain(isMain);
        return this;
    }

    public VideoGalleryBuilder isAttachFile(boolean isAttachFile) {
        videoGallery.setIsAttachFile(isAttachFile);
        return this;
    }

    public VideoGalleryBuilder sortPriority(String sortPriority) {
        videoGallery.setSortPriority(sortPriority);
        return this;
    }

    public VideoGalleryBuilder createOnPersianDate(String createOnPersianDate) {
        videoGallery.setCreateOnPersianDate(createOnPersianDate);
        return this;
    }

    public VideoGalleryBuilder metaMediaFileId(int metaMediaFileId) {
        videoGallery.setMetaMediaFileId(metaMediaFileId);
        return this;
    }

    public VideoGalleryBuilder metaMediaFileUrl(String metaMediaFileUrl) {
        videoGallery.setMetaMediaFileUrl(metaMediaFileUrl);
        return this;
    }

    public VideoGalleryBuilder metaMediaFileThumbnailUrl(String metaMediaFileThumbnailUrl) {
        videoGallery.setMetaMediaFileThumbnailUrl(metaMediaFileThumbnailUrl);
        return this;
    }

    public VideoGalleryBuilder popupImageGalleryies(List<String> popupImageGalleryies) {
        videoGallery.setPopupImageGalleryies(popupImageGalleryies);
        return this;
    }

    public VideoGalleryBuilder galleryDetails(List<String> galleryDetails) {
        videoGallery.setGalleryDetails(galleryDetails);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VideoGallery build() {
        return videoGallery;
    }
}