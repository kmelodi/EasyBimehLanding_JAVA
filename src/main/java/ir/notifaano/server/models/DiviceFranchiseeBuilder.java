/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class DiviceFranchiseeBuilder {
    //the instance to build
    private DiviceFranchisee diviceFranchisee;

    /**
     * Default constructor to initialize the instance
     */
    public DiviceFranchiseeBuilder() {
        diviceFranchisee = new DiviceFranchisee();
    }

    public DiviceFranchiseeBuilder id(int id) {
        diviceFranchisee.setId(id);
        return this;
    }

    public DiviceFranchiseeBuilder title(String title) {
        diviceFranchisee.setTitle(title);
        return this;
    }

    public DiviceFranchiseeBuilder extraData(String extraData) {
        diviceFranchisee.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DiviceFranchisee build() {
        return diviceFranchisee;
    }
}