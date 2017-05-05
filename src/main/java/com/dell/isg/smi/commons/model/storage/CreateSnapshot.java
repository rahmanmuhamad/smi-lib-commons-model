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
 * Java class for CreateSnapshot complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSnapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="neverExpire" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expireTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeUnit" type="{http://esg.dell.com/icee/infrastructure/model/storage}TimeUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSnapshot", propOrder = { "description", "neverExpire", "expireTime", "timeUnit" })
public class CreateSnapshot {

    @XmlElement(required = true)
    protected String description;
    protected boolean neverExpire;
    protected int expireTime;
    @XmlElement(required = true)
    protected TimeUnit timeUnit;


    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }


    /**
     * Gets the value of the neverExpire property.
     * 
     */
    public boolean isNeverExpire() {
        return neverExpire;
    }


    /**
     * Sets the value of the neverExpire property.
     * 
     */
    public void setNeverExpire(boolean value) {
        this.neverExpire = value;
    }


    /**
     * Gets the value of the expireTime property.
     * 
     */
    public int getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the value of the expireTime property.
     * 
     */
    public void setExpireTime(int value) {
        this.expireTime = value;
    }


    /**
     * Gets the value of the timeUnit property.
     * 
     * @return possible object is {@link TimeUnit }
     * 
     */
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the value of the timeUnit property.
     * 
     * @param value allowed object is {@link TimeUnit }
     * 
     */
    public void setTimeUnit(TimeUnit value) {
        this.timeUnit = value;
    }

}
