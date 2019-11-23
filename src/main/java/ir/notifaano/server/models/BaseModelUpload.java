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
public class BaseModelUpload 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4278591425622081321L;
    private boolean isSuccess;
    private int status;
    private Object message;
    private String extraData;
    private String exception;
    /** GETTER
     * وضعیت موفقیت درخواست
     */
    @JsonGetter("isSuccess")
    public boolean getIsSuccess ( ) { 
        return this.isSuccess;
    }
    
    /** SETTER
     * وضعیت موفقیت درخواست
     */
    @JsonSetter("isSuccess")
    public void setIsSuccess (boolean value) { 
        this.isSuccess = value;
    }
 
    /** GETTER
     * کد وضعیت درخواست
     */
    @JsonGetter("status")
    public int getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * کد وضعیت درخواست
     */
    @JsonSetter("status")
    public void setStatus (int value) { 
        this.status = value;
    }
 
    /** GETTER
     * بدنه ی اصلی درخواست که با توجه به نوع درخواست، تغییر می کند
     */
    @JsonGetter("message")
    public Object getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * بدنه ی اصلی درخواست که با توجه به نوع درخواست، تغییر می کند
     */
    @JsonSetter("message")
    public void setMessage (Object value) { 
        this.message = value;
    }
 
    /** GETTER
     * اطلاعات اضافه ی درخواست
     */
    @JsonGetter("extraData")
    public String getExtraData ( ) { 
        return this.extraData;
    }
    
    /** SETTER
     * اطلاعات اضافه ی درخواست
     */
    @JsonSetter("extraData")
    public void setExtraData (String value) { 
        this.extraData = value;
    }
 
    /** GETTER
     * اطلاعات خطاهای رخ داده
     */
    @JsonGetter("exception")
    public String getException ( ) { 
        return this.exception;
    }
    
    /** SETTER
     * اطلاعات خطاهای رخ داده
     */
    @JsonSetter("exception")
    public void setException (String value) { 
        this.exception = value;
    }
 
}
