/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class CommitmentCeilingBuilder {
    //the instance to build
    private CommitmentCeiling commitmentCeiling;

    /**
     * Default constructor to initialize the instance
     */
    public CommitmentCeilingBuilder() {
        commitmentCeiling = new CommitmentCeiling();
    }

    public CommitmentCeilingBuilder id(int id) {
        commitmentCeiling.setId(id);
        return this;
    }

    public CommitmentCeilingBuilder title(String title) {
        commitmentCeiling.setTitle(title);
        return this;
    }

    public CommitmentCeilingBuilder extraData(String extraData) {
        commitmentCeiling.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CommitmentCeiling build() {
        return commitmentCeiling;
    }
}