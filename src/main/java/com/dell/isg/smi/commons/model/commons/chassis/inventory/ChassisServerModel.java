/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.17 at 12:15:24 AM CDT 
//

package com.dell.isg.smi.commons.model.commons.chassis.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ChassisServerModel.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisServerModel", propOrder = { "id", "serviceTag", "chassisSlotName", "healthStatus", "powerStatus", "presence" })
public class ChassisServerModel {

    /**
     * Instantiates a new chassis server model.
     */
    public ChassisServerModel() {
        super();
    }

    protected long id;
    @XmlElement(required = true)
    protected String serviceTag;
    @XmlElement(required = true)
    protected String chassisSlotName;
    @XmlElement(required = true)
    protected String healthStatus;
    @XmlElement(required = true)
    protected String powerStatus;
    @XmlElement(required = true)
    protected String presence;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the serviceTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }


    /**
     * Gets the value of the chassisSlotName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getChassisSlotName() {
        return chassisSlotName;
    }


    /**
     * Sets the value of the chassisSlotName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setChassisSlotName(String value) {
        this.chassisSlotName = value;
    }


    /**
     * Gets the value of the healthStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHealthStatus() {
        return healthStatus;
    }


    /**
     * Sets the value of the healthStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHealthStatus(String value) {
        this.healthStatus = value;
    }


    /**
     * Gets the value of the powerStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPowerStatus() {
        return powerStatus;
    }


    /**
     * Sets the value of the powerStatus property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPowerStatus(String value) {
        this.powerStatus = value;
    }


    /**
     * Gets the value of the presence property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPresence() {
        return presence;
    }


    /**
     * Sets the value of the presence property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPresence(String value) {
        this.presence = value;
    }

}
