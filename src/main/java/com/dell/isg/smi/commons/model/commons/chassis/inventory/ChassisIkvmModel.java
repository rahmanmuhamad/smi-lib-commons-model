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
 * <p>
 * Java class for ChassisIkvm complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChassisIkvm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="powerStatus" type="{http://esg.dell.com/icee/infrastructure/model/chassis}PowerStatus"/>
 *         &lt;element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frontPanelEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="health" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisIkvm", propOrder = { "id", "name", "manufacturer", "partNumber", "powerStatus", "firmwareVersion", "frontPanelEnabled", "health" })
public class ChassisIkvmModel {

    public ChassisIkvmModel() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    protected String partNumber;
    @XmlElement(required = true)
    protected PowerStatus powerStatus;
    @XmlElement(required = true)
    protected String firmwareVersion;
    protected int frontPanelEnabled;
    @XmlElement(required = true)
    protected String health;


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
     * Gets the value of the manufacturer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }


    /**
     * Gets the value of the partNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the value of the partNumber property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }


    /**
     * Gets the value of the powerStatus property.
     * 
     * @return possible object is {@link PowerStatus }
     * 
     */
    public PowerStatus getPowerStatus() {
        return powerStatus;
    }


    /**
     * Sets the value of the powerStatus property.
     * 
     * @param value allowed object is {@link PowerStatus }
     * 
     */
    public void setPowerStatus(PowerStatus value) {
        this.powerStatus = value;
    }


    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }


    /**
     * Gets the value of the frontPanelEnabled property.
     * 
     */
    public int getFrontPanelEnabled() {
        return frontPanelEnabled;
    }


    /**
     * Sets the value of the frontPanelEnabled property.
     * 
     */
    public void setFrontPanelEnabled(int value) {
        this.frontPanelEnabled = value;
    }


    /**
     * Gets the value of the health property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHealth() {
        return health;
    }


    /**
     * Sets the value of the health property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHealth(String value) {
        this.health = value;
    }

}
