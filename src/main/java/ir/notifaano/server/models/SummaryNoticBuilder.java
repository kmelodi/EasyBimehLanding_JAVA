/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class SummaryNoticBuilder {
    //the instance to build
    private SummaryNotic summaryNotic;

    /**
     * Default constructor to initialize the instance
     */
    public SummaryNoticBuilder() {
        summaryNotic = new SummaryNotic();
    }

    public SummaryNoticBuilder id(int id) {
        summaryNotic.setId(id);
        return this;
    }

    public SummaryNoticBuilder insuranceCentreId(int insuranceCentreId) {
        summaryNotic.setInsuranceCentreId(insuranceCentreId);
        return this;
    }

    public SummaryNoticBuilder articleType(int articleType) {
        summaryNotic.setArticleType(articleType);
        return this;
    }

    public SummaryNoticBuilder title(String title) {
        summaryNotic.setTitle(title);
        return this;
    }

    public SummaryNoticBuilder summary(String summary) {
        summaryNotic.setSummary(summary);
        return this;
    }

    public SummaryNoticBuilder articleGroup(String articleGroup) {
        summaryNotic.setArticleGroup(articleGroup);
        return this;
    }

    public SummaryNoticBuilder metaMediaFileId(int metaMediaFileId) {
        summaryNotic.setMetaMediaFileId(metaMediaFileId);
        return this;
    }

    public SummaryNoticBuilder metaMediaFileUrl(String metaMediaFileUrl) {
        summaryNotic.setMetaMediaFileUrl(metaMediaFileUrl);
        return this;
    }

    public SummaryNoticBuilder publishPersianDate(String publishPersianDate) {
        summaryNotic.setPublishPersianDate(publishPersianDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SummaryNotic build() {
        return summaryNotic;
    }
}