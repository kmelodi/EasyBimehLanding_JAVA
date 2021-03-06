/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class MedicalCostCoverageBuilder {
    //the instance to build
    private MedicalCostCoverage medicalCostCoverage;

    /**
     * Default constructor to initialize the instance
     */
    public MedicalCostCoverageBuilder() {
        medicalCostCoverage = new MedicalCostCoverage();
    }

    public MedicalCostCoverageBuilder id(int id) {
        medicalCostCoverage.setId(id);
        return this;
    }

    public MedicalCostCoverageBuilder title(int title) {
        medicalCostCoverage.setTitle(title);
        return this;
    }

    public MedicalCostCoverageBuilder extraData(String extraData) {
        medicalCostCoverage.setExtraData(extraData);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MedicalCostCoverage build() {
        return medicalCostCoverage;
    }
}