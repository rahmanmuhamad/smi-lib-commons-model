/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for VolumeGrowth complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolumeGrowth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimatedFullTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activeGrowth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="snapshotSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="actualGrowth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeGrowth", propOrder = { "estimatedFullTime", "activeGrowth", "snapshotSpace", "actualGrowth" })
public class VolumeGrowth {

    @XmlElement(required = true)
    protected String estimatedFullTime;
    protected long activeGrowth;
    protected long snapshotSpace;
    protected long actualGrowth;


    /**
     * Gets the value of the estimatedFullTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEstimatedFullTime() {
        return estimatedFullTime;
    }


    /**
     * Sets the value of the estimatedFullTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEstimatedFullTime(String value) {
        this.estimatedFullTime = value;
    }


    /**
     * Gets the value of the activeGrowth property.
     * 
     */
    public long getActiveGrowth() {
        return activeGrowth;
    }


    /**
     * Sets the value of the activeGrowth property.
     * 
     */
    public void setActiveGrowth(long value) {
        this.activeGrowth = value;
    }


    /**
     * Gets the value of the snapshotSpace property.
     * 
     */
    public long getSnapshotSpace() {
        return snapshotSpace;
    }


    /**
     * Sets the value of the snapshotSpace property.
     * 
     */
    public void setSnapshotSpace(long value) {
        this.snapshotSpace = value;
    }


    /**
     * Gets the value of the actualGrowth property.
     * 
     */
    public long getActualGrowth() {
        return actualGrowth;
    }


    /**
     * Sets the value of the actualGrowth property.
     * 
     */
    public void setActualGrowth(long value) {
        this.actualGrowth = value;
    }

}
