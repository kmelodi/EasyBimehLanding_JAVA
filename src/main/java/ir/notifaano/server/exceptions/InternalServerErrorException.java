/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import ir.notifaano.server.http.client.HttpContext;
import ir.notifaano.server.models.*;

public class InternalServerErrorException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5438815285616096366L;
    private boolean isSuccess;
    private int status;
    private String message;
    private String extraData;
    private Exception exception;
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
    private void setIsSuccess (boolean value) { 
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
    private void setStatus (int value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    private void setMessage (String value) { 
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
    private void setExtraData (String value) { 
        this.extraData = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("exception")
    public Exception getException ( ) { 
        return this.exception;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("exception")
    private void setException (Exception value) { 
        this.exception = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public InternalServerErrorException(String reason, HttpContext context) {
        super(reason, context);
    }
}
