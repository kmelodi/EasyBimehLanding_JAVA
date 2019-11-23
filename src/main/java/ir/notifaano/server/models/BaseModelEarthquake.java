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
public class BaseModelEarthquake 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8229656783750089046L;
    private boolean isSuccess;
    private int status;
    private Earthquake message;
    private String extraData;
    private String exception;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isSuccess")
    public boolean getIsSuccess ( ) { 
        return this.isSuccess;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isSuccess")
    public void setIsSuccess (boolean value) { 
        this.isSuccess = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public int getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (int value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public Earthquake getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    public void setMessage (Earthquake value) { 
        this.message = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("extraData")
    public String getExtraData ( ) { 
        return this.extraData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("extraData")
    public void setExtraData (String value) { 
        this.extraData = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exception")
    public String getException ( ) { 
        return this.exception;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exception")
    public void setException (String value) { 
        this.exception = value;
    }
 
}
