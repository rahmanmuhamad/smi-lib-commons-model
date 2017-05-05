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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DevicePowerState.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="DevicePowerState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Power Off Soft"/>
 *     &lt;enumeration value="Power Cycle Soft"/>
 *     &lt;enumeration value="Master Bus Reset"/>
 *     &lt;enumeration value="Diagnostic Interrupt"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DevicePowerState")
@XmlEnum
public enum DevicePowerState {

    @XmlEnumValue("On")
    ON("On"), @XmlEnumValue("Off")
    OFF("Off"), @XmlEnumValue("Power Off Soft")
    POWER_OFF_SOFT("Power Off Soft"), @XmlEnumValue("Power Cycle Soft")
    POWER_CYCLE_SOFT("Power Cycle Soft"), @XmlEnumValue("Master Bus Reset")
    MASTER_BUS_RESET("Master Bus Reset"), @XmlEnumValue("Diagnostic Interrupt")
    DIAGNOSTIC_INTERRUPT("Diagnostic Interrupt"), @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;


    DevicePowerState(String v) {
        value = v;
    }


    public String value() {
        return value;
    }


    public static DevicePowerState fromValue(String v) {
        for (DevicePowerState c : DevicePowerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
