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
public class Status 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1555654258669132161L;
    private String id;
    private String entityId;
    private int primaryEntityName;
    private String statusCollectionId;
    private String formData;
    private String statusTitle;
    private boolean editable;
    private String statusCollectionParentId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("entityId")
    public String getEntityId ( ) { 
        return this.entityId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("entityId")
    public void setEntityId (String value) { 
        this.entityId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("primaryEntityName")
    public int getPrimaryEntityName ( ) { 
        return this.primaryEntityName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("primaryEntityName")
    public void setPrimaryEntityName (int value) { 
        this.primaryEntityName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("statusCollectionId")
    public String getStatusCollectionId ( ) { 
        return this.statusCollectionId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("statusCollectionId")
    public void setStatusCollectionId (String value) { 
        this.statusCollectionId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("formData")
    public String getFormData ( ) { 
        return this.formData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("formData")
    public void setFormData (String value) { 
        this.formData = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("statusTitle")
    public String getStatusTitle ( ) { 
        return this.statusTitle;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("statusTitle")
    public void setStatusTitle (String value) { 
        this.statusTitle = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("editable")
    public boolean getEditable ( ) { 
        return this.editable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("editable")
    public void setEditable (boolean value) { 
        this.editable = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("statusCollectionParentId")
    public String getStatusCollectionParentId ( ) { 
        return this.statusCollectionParentId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("statusCollectionParentId")
    public void setStatusCollectionParentId (String value) { 
        this.statusCollectionParentId = value;
    }
 
}
