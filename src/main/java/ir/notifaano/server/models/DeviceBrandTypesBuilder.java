/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;

public class DeviceBrandTypesBuilder {
    //the instance to build
    private DeviceBrandTypes deviceBrandTypes;

    /**
     * Default constructor to initialize the instance
     */
    public DeviceBrandTypesBuilder() {
        deviceBrandTypes = new DeviceBrandTypes();
    }

    public DeviceBrandTypesBuilder id(int id) {
        deviceBrandTypes.setId(id);
        return this;
    }

    public DeviceBrandTypesBuilder title(String title) {
        deviceBrandTypes.setTitle(title);
        return this;
    }

    public DeviceBrandTypesBuilder deviceGroup(int deviceGroup) {
        deviceBrandTypes.setDeviceGroup(deviceGroup);
        return this;
    }

    public DeviceBrandTypesBuilder deviceTypeId(Integer deviceTypeId) {
        deviceBrandTypes.setDeviceTypeId(deviceTypeId);
        return this;
    }

    public DeviceBrandTypesBuilder deviceBrandId(String deviceBrandId) {
        deviceBrandTypes.setDeviceBrandId(deviceBrandId);
        return this;
    }

    public DeviceBrandTypesBuilder createOn(String createOn) {
        deviceBrandTypes.setCreateOn(createOn);
        return this;
    }

    public DeviceBrandTypesBuilder updateOn(String updateOn) {
        deviceBrandTypes.setUpdateOn(updateOn);
        return this;
    }

    public DeviceBrandTypesBuilder createdBy(String createdBy) {
        deviceBrandTypes.setCreatedBy(createdBy);
        return this;
    }

    public DeviceBrandTypesBuilder updatedBy(String updatedBy) {
        deviceBrandTypes.setUpdatedBy(updatedBy);
        return this;
    }

    public DeviceBrandTypesBuilder createOnPersianDate(String createOnPersianDate) {
        deviceBrandTypes.setCreateOnPersianDate(createOnPersianDate);
        return this;
    }

    public DeviceBrandTypesBuilder updateOnPersianDate(String updateOnPersianDate) {
        deviceBrandTypes.setUpdateOnPersianDate(updateOnPersianDate);
        return this;
    }

    public DeviceBrandTypesBuilder deviceTypeTitle(String deviceTypeTitle) {
        deviceBrandTypes.setDeviceTypeTitle(deviceTypeTitle);
        return this;
    }

    public DeviceBrandTypesBuilder deviceBrandTitle(String deviceBrandTitle) {
        deviceBrandTypes.setDeviceBrandTitle(deviceBrandTitle);
        return this;
    }

    public DeviceBrandTypesBuilder deviceTypeBrandModelTitle(String deviceTypeBrandModelTitle) {
        deviceBrandTypes.setDeviceTypeBrandModelTitle(deviceTypeBrandModelTitle);
        return this;
    }

    public DeviceBrandTypesBuilder deviceBrandIds(List<String> deviceBrandIds) {
        deviceBrandTypes.setDeviceBrandIds(deviceBrandIds);
        return this;
    }

    public DeviceBrandTypesBuilder deviceBrandsTitle(String deviceBrandsTitle) {
        deviceBrandTypes.setDeviceBrandsTitle(deviceBrandsTitle);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeviceBrandTypes build() {
        return deviceBrandTypes;
    }
}