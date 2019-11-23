/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class InsuranceDataFireInsuranceBuilder {
    //the instance to build
    private InsuranceDataFireInsurance insuranceDataFireInsurance;

    /**
     * Default constructor to initialize the instance
     */
    public InsuranceDataFireInsuranceBuilder() {
        insuranceDataFireInsurance = new InsuranceDataFireInsurance();
    }

    public InsuranceDataFireInsuranceBuilder insurancePolicyTypeVelue(int insurancePolicyTypeVelue) {
        insuranceDataFireInsurance.setInsurancePolicyTypeVelue(insurancePolicyTypeVelue);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder fireInsurancePolicyExtendView(FireInsurancePolicyExtendView fireInsurancePolicyExtendView) {
        insuranceDataFireInsurance.setFireInsurancePolicyExtendView(fireInsurancePolicyExtendView);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder fireInsurancePolicyFilter(FireInsurancePolicyFilter fireInsurancePolicyFilter) {
        insuranceDataFireInsurance.setFireInsurancePolicyFilter(fireInsurancePolicyFilter);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder id(int id) {
        insuranceDataFireInsurance.setId(id);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder selectedInsurancePolicyHasBeenChanged(boolean selectedInsurancePolicyHasBeenChanged) {
        insuranceDataFireInsurance.setSelectedInsurancePolicyHasBeenChanged(selectedInsurancePolicyHasBeenChanged);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder isPaymented(boolean isPaymented) {
        insuranceDataFireInsurance.setIsPaymented(isPaymented);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder payable(String payable) {
        insuranceDataFireInsurance.setPayable(payable);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder paymented(String paymented) {
        insuranceDataFireInsurance.setPaymented(paymented);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder conflict(String conflict) {
        insuranceDataFireInsurance.setConflict(conflict);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder hasConflictDocument(boolean hasConflictDocument) {
        insuranceDataFireInsurance.setHasConflictDocument(hasConflictDocument);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder initialPrice(String initialPrice) {
        insuranceDataFireInsurance.setInitialPrice(initialPrice);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder finalPrice(String finalPrice) {
        insuranceDataFireInsurance.setFinalPrice(finalPrice);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insuranceCompanyName(String insuranceCompanyName) {
        insuranceDataFireInsurance.setInsuranceCompanyName(insuranceCompanyName);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insuranceCentreName(String insuranceCentreName) {
        insuranceDataFireInsurance.setInsuranceCentreName(insuranceCentreName);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder isInsuranceCentreAdmin(boolean isInsuranceCentreAdmin) {
        insuranceDataFireInsurance.setIsInsuranceCentreAdmin(isInsuranceCentreAdmin);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insurancePolicyPaymentDocuments(List<String> insurancePolicyPaymentDocuments) {
        insuranceDataFireInsurance.setInsurancePolicyPaymentDocuments(insurancePolicyPaymentDocuments);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insurancePolicyConflict(String insurancePolicyConflict) {
        insuranceDataFireInsurance.setInsurancePolicyConflict(insurancePolicyConflict);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insurancePolicyCondition(String insurancePolicyCondition) {
        insuranceDataFireInsurance.setInsurancePolicyCondition(insurancePolicyCondition);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder person(String person) {
        insuranceDataFireInsurance.setPerson(person);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder insurancePolicy(String insurancePolicy) {
        insuranceDataFireInsurance.setInsurancePolicy(insurancePolicy);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder shoppingCard(String shoppingCard) {
        insuranceDataFireInsurance.setShoppingCard(shoppingCard);
        return this;
    }

    public InsuranceDataFireInsuranceBuilder shoppingCardPostalPacket(String shoppingCardPostalPacket) {
        insuranceDataFireInsurance.setShoppingCardPostalPacket(shoppingCardPostalPacket);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InsuranceDataFireInsurance build() {
        return insuranceDataFireInsurance;
    }
}