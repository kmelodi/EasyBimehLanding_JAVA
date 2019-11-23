/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class BaseModelMedicalSpecialtiesBuilder {
    //the instance to build
    private BaseModelMedicalSpecialties baseModelMedicalSpecialties;

    /**
     * Default constructor to initialize the instance
     */
    public BaseModelMedicalSpecialtiesBuilder() {
        baseModelMedicalSpecialties = new BaseModelMedicalSpecialties();
    }

    public BaseModelMedicalSpecialtiesBuilder isSuccess(boolean isSuccess) {
        baseModelMedicalSpecialties.setIsSuccess(isSuccess);
        return this;
    }

    public BaseModelMedicalSpecialtiesBuilder status(int status) {
        baseModelMedicalSpecialties.setStatus(status);
        return this;
    }

    public BaseModelMedicalSpecialtiesBuilder message(List<ComboDataModel> message) {
        baseModelMedicalSpecialties.setMessage(message);
        return this;
    }

    public BaseModelMedicalSpecialtiesBuilder extraData(String extraData) {
        baseModelMedicalSpecialties.setExtraData(extraData);
        return this;
    }

    public BaseModelMedicalSpecialtiesBuilder exception(String exception) {
        baseModelMedicalSpecialties.setException(exception);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BaseModelMedicalSpecialties build() {
        return baseModelMedicalSpecialties;
    }
}