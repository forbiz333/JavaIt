//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.15 at 08:49:15 PM MSK 
//


package moduleTwoResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soil">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="podsolic"/>
 *               &lt;enumeration value="ground"/>
 *               &lt;enumeration value="sod-podzolic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visualParameters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="colorOfStalk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="avSizeSM" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="growingTips">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="tempDg" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="wateringMlW" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="multiplying">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="semen"/>
 *               &lt;enumeration value="cutting"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * *
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plants", propOrder = {
    "name",
    "soil",
    "origin",
    "visualParameters",
    "growingTips",
    "multiplying"
})
public class Plants {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String soil;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected Plants.VisualParameters visualParameters;
    @XmlElement(required = true)
    protected Plants.GrowingTips growingTips;
    @XmlElement(required = true)
    protected String multiplying;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the soil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoil() {
        return soil;
    }

    /**
     * Sets the value of the soil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoil(String value) {
        this.soil = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Plants.VisualParameters }
     *     
     */
    public Plants.VisualParameters getVisualParameters() {
        return visualParameters;
    }

    /**
     * Sets the value of the visualParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plants.VisualParameters }
     *     
     */
    public void setVisualParameters(Plants.VisualParameters value) {
        this.visualParameters = value;
    }

    /**
     * Gets the value of the growingTips property.
     * 
     * @return
     *     possible object is
     *     {@link Plants.GrowingTips }
     *     
     */
    public Plants.GrowingTips getGrowingTips() {
        return growingTips;
    }

    /**
     * Sets the value of the growingTips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plants.GrowingTips }
     *     
     */
    public void setGrowingTips(Plants.GrowingTips value) {
        this.growingTips = value;
    }

    /**
     * Gets the value of the multiplying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplying() {
        return multiplying;
    }

    /**
     * Sets the value of the multiplying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplying(String value) {
        this.multiplying = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="tempDg" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="wateringMlW" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GrowingTips {

        @XmlAttribute(name = "tempDg")
        protected Integer tempDg;
        @XmlAttribute(name = "wateringMlW")
        protected Integer wateringMlW;

        /**
         * Gets the value of the tempDg property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTempDg() {
            return tempDg;
        }

        /**
         * Sets the value of the tempDg property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTempDg(Integer value) {
            this.tempDg = value;
        }

        /**
         * Gets the value of the wateringMlW property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWateringMlW() {
            return wateringMlW;
        }

        /**
         * Sets the value of the wateringMlW property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWateringMlW(Integer value) {
            this.wateringMlW = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="colorOfStalk" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="avSizeSM" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VisualParameters {

        @XmlAttribute(name = "colorOfStalk")
        protected String colorOfStalk;
        @XmlAttribute(name = "avSizeSM")
        protected Integer avSizeSM;

        /**
         * Gets the value of the colorOfStalk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColorOfStalk() {
            return colorOfStalk;
        }

        /**
         * Sets the value of the colorOfStalk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColorOfStalk(String value) {
            this.colorOfStalk = value;
        }

        /**
         * Gets the value of the avSizeSM property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAvSizeSM() {
            return avSizeSM;
        }

        /**
         * Sets the value of the avSizeSM property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAvSizeSM(Integer value) {
            this.avSizeSM = value;
        }

    }

}
