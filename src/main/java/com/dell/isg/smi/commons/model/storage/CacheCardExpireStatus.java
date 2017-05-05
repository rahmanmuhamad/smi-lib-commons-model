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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CacheCardExpireStatus.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="CacheCardExpireStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="ExpirationPending"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="NoBattery"/>
 *     &lt;enumeration value="AboutToExpire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CacheCardExpireStatus")
@XmlEnum
public enum CacheCardExpireStatus {

    @XmlEnumValue("Normal")
    NORMAL("Normal"), @XmlEnumValue("ExpirationPending")
    EXPIRATION_PENDING("ExpirationPending"), @XmlEnumValue("Expired")
    EXPIRED("Expired"), @XmlEnumValue("NoBattery")
    NO_BATTERY("NoBattery"), @XmlEnumValue("AboutToExpire")
    ABOUT_TO_EXPIRE("AboutToExpire");
    private final String value;


    CacheCardExpireStatus(String v) {
        value = v;
    }


    public String value() {
        return value;
    }


    public static CacheCardExpireStatus fromValue(String v) {
        for (CacheCardExpireStatus c : CacheCardExpireStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
