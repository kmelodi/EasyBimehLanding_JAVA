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
public class ExtraDataBaseModelPortalLandingPage 
        implements java.io.Serializable {
    private static final long serialVersionUID = -93808128968208804L;
    private boolean hasPlan;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hasPlan")
    public boolean getHasPlan ( ) { 
        return this.hasPlan;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hasPlan")
    public void setHasPlan (boolean value) { 
        this.hasPlan = value;
    }
 
}
