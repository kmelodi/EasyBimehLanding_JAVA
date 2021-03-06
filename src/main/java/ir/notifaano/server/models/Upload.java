/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Upload 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4293686892064748662L;
    private int id;
    private int metaMediaDirectoryId;
    private String title;
    private String alt;
    private String fileName;
    private String passwordHash;
    private String isActive;
    private String expireOn;
    private String fileLibraryLabelParam;
    private String fileSize;
    private String fileSizeValue;
    private String fileUrl;
    private String fileThumbnailUrl;
    private String expireOnPersianDate;
    private String updateOn;
    private String createOn;
    private String createOnPersianDate;
    private String updateOnPersianDate;
    private String filePath;
    /** GETTER
     * شناسه ی فایل
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * شناسه ی فایل
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * شناسه ی دایرکتوری فایل
     */
    @JsonGetter("metaMediaDirectoryId")
    public int getMetaMediaDirectoryId ( ) { 
        return this.metaMediaDirectoryId;
    }
    
    /** SETTER
     * شناسه ی دایرکتوری فایل
     */
    @JsonSetter("metaMediaDirectoryId")
    public void setMetaMediaDirectoryId (int value) { 
        this.metaMediaDirectoryId = value;
    }
 
    /** GETTER
     * عنوان
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * عنوان
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * توضیح فایل
     */
    @JsonGetter("alt")
    public String getAlt ( ) { 
        return this.alt;
    }
    
    /** SETTER
     * توضیح فایل
     */
    @JsonSetter("alt")
    public void setAlt (String value) { 
        this.alt = value;
    }
 
    /** GETTER
     * نام فایل
     */
    @JsonGetter("fileName")
    public String getFileName ( ) { 
        return this.fileName;
    }
    
    /** SETTER
     * نام فایل
     */
    @JsonSetter("fileName")
    public void setFileName (String value) { 
        this.fileName = value;
    }
 
    /** GETTER
     * پسورد فایل
     */
    @JsonGetter("passwordHash")
    public String getPasswordHash ( ) { 
        return this.passwordHash;
    }
    
    /** SETTER
     * پسورد فایل
     */
    @JsonSetter("passwordHash")
    public void setPasswordHash (String value) { 
        this.passwordHash = value;
    }
 
    /** GETTER
     * وضعیت اکتیو بودن فایل
     */
    @JsonGetter("isActive")
    public String getIsActive ( ) { 
        return this.isActive;
    }
    
    /** SETTER
     * وضعیت اکتیو بودن فایل
     */
    @JsonSetter("isActive")
    public void setIsActive (String value) { 
        this.isActive = value;
    }
 
    /** GETTER
     * زمان انقضای فایل
     */
    @JsonGetter("expireOn")
    public String getExpireOn ( ) { 
        return this.expireOn;
    }
    
    /** SETTER
     * زمان انقضای فایل
     */
    @JsonSetter("expireOn")
    public void setExpireOn (String value) { 
        this.expireOn = value;
    }
 
    /** GETTER
     * لیبل دسته بندی فایل
     */
    @JsonGetter("fileLibraryLabelParam")
    public String getFileLibraryLabelParam ( ) { 
        return this.fileLibraryLabelParam;
    }
    
    /** SETTER
     * لیبل دسته بندی فایل
     */
    @JsonSetter("fileLibraryLabelParam")
    public void setFileLibraryLabelParam (String value) { 
        this.fileLibraryLabelParam = value;
    }
 
    /** GETTER
     * اندازه ی فایل
     */
    @JsonGetter("fileSize")
    public String getFileSize ( ) { 
        return this.fileSize;
    }
    
    /** SETTER
     * اندازه ی فایل
     */
    @JsonSetter("fileSize")
    public void setFileSize (String value) { 
        this.fileSize = value;
    }
 
    /** GETTER
     * اندازه ی فایل
     */
    @JsonGetter("fileSizeValue")
    public String getFileSizeValue ( ) { 
        return this.fileSizeValue;
    }
    
    /** SETTER
     * اندازه ی فایل
     */
    @JsonSetter("fileSizeValue")
    public void setFileSizeValue (String value) { 
        this.fileSizeValue = value;
    }
 
    /** GETTER
     * آدرس فایل
     */
    @JsonGetter("fileUrl")
    public String getFileUrl ( ) { 
        return this.fileUrl;
    }
    
    /** SETTER
     * آدرس فایل
     */
    @JsonSetter("fileUrl")
    public void setFileUrl (String value) { 
        this.fileUrl = value;
    }
 
    /** GETTER
     * آدرس پیش نمایش فایل
     */
    @JsonGetter("fileThumbnailUrl")
    public String getFileThumbnailUrl ( ) { 
        return this.fileThumbnailUrl;
    }
    
    /** SETTER
     * آدرس پیش نمایش فایل
     */
    @JsonSetter("fileThumbnailUrl")
    public void setFileThumbnailUrl (String value) { 
        this.fileThumbnailUrl = value;
    }
 
    /** GETTER
     * تاریخ انقضای شمسی
     */
    @JsonGetter("expireOnPersianDate")
    public String getExpireOnPersianDate ( ) { 
        return this.expireOnPersianDate;
    }
    
    /** SETTER
     * تاریخ انقضای شمسی
     */
    @JsonSetter("expireOnPersianDate")
    public void setExpireOnPersianDate (String value) { 
        this.expireOnPersianDate = value;
    }
 
    /** GETTER
     * تاریخ بروز رسانی فایل
     */
    @JsonGetter("updateOn")
    public String getUpdateOn ( ) { 
        return this.updateOn;
    }
    
    /** SETTER
     * تاریخ بروز رسانی فایل
     */
    @JsonSetter("updateOn")
    public void setUpdateOn (String value) { 
        this.updateOn = value;
    }
 
    /** GETTER
     * تاریخ ثبت فایل
     */
    @JsonGetter("createOn")
    public String getCreateOn ( ) { 
        return this.createOn;
    }
    
    /** SETTER
     * تاریخ ثبت فایل
     */
    @JsonSetter("createOn")
    public void setCreateOn (String value) { 
        this.createOn = value;
    }
 
    /** GETTER
     * تاریخ ثبت فایل شمسی
     */
    @JsonGetter("createOnPersianDate")
    public String getCreateOnPersianDate ( ) { 
        return this.createOnPersianDate;
    }
    
    /** SETTER
     * تاریخ ثبت فایل شمسی
     */
    @JsonSetter("createOnPersianDate")
    public void setCreateOnPersianDate (String value) { 
        this.createOnPersianDate = value;
    }
 
    /** GETTER
     * تاریخ بروز رسانی فایل شمسی
     */
    @JsonGetter("updateOnPersianDate")
    public String getUpdateOnPersianDate ( ) { 
        return this.updateOnPersianDate;
    }
    
    /** SETTER
     * تاریخ بروز رسانی فایل شمسی
     */
    @JsonSetter("updateOnPersianDate")
    public void setUpdateOnPersianDate (String value) { 
        this.updateOnPersianDate = value;
    }
 
    /** GETTER
     * آدرس دایرکتوری فایل
     */
    @JsonGetter("filePath")
    public String getFilePath ( ) { 
        return this.filePath;
    }
    
    /** SETTER
     * آدرس دایرکتوری فایل
     */
    @JsonSetter("filePath")
    public void setFilePath (String value) { 
        this.filePath = value;
    }
 
}
