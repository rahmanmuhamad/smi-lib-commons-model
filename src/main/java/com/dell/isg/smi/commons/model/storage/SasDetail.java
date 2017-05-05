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
 * Java class for SasDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SasDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://esg.dell.com/icee/infrastructure/model/storage}DetailBase">
 *       &lt;sequence>
 *         &lt;element name="faultDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SasDetail", propOrder = { "faultDomain", "purpose" })
public class SasDetail extends DetailBase {

    @XmlElement(required = true)
    protected String faultDomain;
    @XmlElement(required = true)
    protected String purpose;


    /**
     * Gets the value of the faultDomain property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFaultDomain() {
        return faultDomain;
    }


    /**
     * Sets the value of the faultDomain property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFaultDomain(String value) {
        this.faultDomain = value;
    }


    /**
     * Gets the value of the purpose property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPurpose() {
        return purpose;
    }


    /**
     * Sets the value of the purpose property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

}
