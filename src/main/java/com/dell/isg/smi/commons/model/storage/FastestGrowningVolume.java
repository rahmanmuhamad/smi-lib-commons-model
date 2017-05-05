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
 * Java class for FastestGrowningVolume complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FastestGrowningVolume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="healthy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mappedService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="growth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="percentFull" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="estimatedFullTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FastestGrowningVolume", propOrder = { "id", "name", "healthy", "mappedService", "configured", "size", "growth", "percentFull", "estimatedFullTime", "lastUpdated" })
public class FastestGrowningVolume {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected boolean healthy;
    @XmlElement(required = true)
    protected String mappedService;
    protected boolean configured;
    protected long size;
    protected long growth;
    protected float percentFull;
    @XmlElement(required = true)
    protected String estimatedFullTime;
    @XmlElement(required = true)
    protected String lastUpdated;


    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the healthy property.
     * 
     */
    public boolean isHealthy() {
        return healthy;
    }


    /**
     * Sets the value of the healthy property.
     * 
     */
    public void setHealthy(boolean value) {
        this.healthy = value;
    }


    /**
     * Gets the value of the mappedService property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMappedService() {
        return mappedService;
    }


    /**
     * Sets the value of the mappedService property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMappedService(String value) {
        this.mappedService = value;
    }


    /**
     * Gets the value of the configured property.
     * 
     */
    public boolean isConfigured() {
        return configured;
    }


    /**
     * Sets the value of the configured property.
     * 
     */
    public void setConfigured(boolean value) {
        this.configured = value;
    }


    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }


    /**
     * Gets the value of the growth property.
     * 
     */
    public long getGrowth() {
        return growth;
    }


    /**
     * Sets the value of the growth property.
     * 
     */
    public void setGrowth(long value) {
        this.growth = value;
    }


    /**
     * Gets the value of the percentFull property.
     * 
     */
    public float getPercentFull() {
        return percentFull;
    }


    /**
     * Sets the value of the percentFull property.
     * 
     */
    public void setPercentFull(float value) {
        this.percentFull = value;
    }


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
     * Gets the value of the lastUpdated property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

}
