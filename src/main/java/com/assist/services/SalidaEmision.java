
package com.assist.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para salidaEmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="salidaEmision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transaccion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transacciontransaccion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cuntransaccionadnegocio"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Id_provedor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="usr_usario"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="psswd_proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rr_datos"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datoprocsados"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salidaEmision", propOrder = {
    "transaccion",
    "transacciontransaccion",
    "cuntransaccionadnegocio",
    "proveedortecnologico",
    "idProvedor",
    "usrUsario",
    "psswdProveedortecnologico",
    "rrDatos",
    "datoprocsados"
})
public class SalidaEmision {

    @XmlElement(required = true)
    protected String transaccion;
    @XmlElement(required = true)
    protected String transacciontransaccion;
    @XmlElement(required = true)
    protected String cuntransaccionadnegocio;
    @XmlElement(required = true)
    protected String proveedortecnologico;
    @XmlElement(name = "Id_provedor", required = true)
    protected String idProvedor;
    @XmlElement(name = "usr_usario", required = true)
    protected String usrUsario;
    @XmlElement(name = "psswd_proveedortecnologico", required = true)
    protected String psswdProveedortecnologico;
    @XmlElement(name = "rr_datos", required = true)
    protected String rrDatos;
    @XmlElement(required = true)
    protected String datoprocsados;

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccion(String value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad transacciontransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacciontransaccion() {
        return transacciontransaccion;
    }

    /**
     * Define el valor de la propiedad transacciontransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacciontransaccion(String value) {
        this.transacciontransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad cuntransaccionadnegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuntransaccionadnegocio() {
        return cuntransaccionadnegocio;
    }

    /**
     * Define el valor de la propiedad cuntransaccionadnegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuntransaccionadnegocio(String value) {
        this.cuntransaccionadnegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedortecnologico() {
        return proveedortecnologico;
    }

    /**
     * Define el valor de la propiedad proveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedortecnologico(String value) {
        this.proveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProvedor() {
        return idProvedor;
    }

    /**
     * Define el valor de la propiedad idProvedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProvedor(String value) {
        this.idProvedor = value;
    }

    /**
     * Obtiene el valor de la propiedad usrUsario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrUsario() {
        return usrUsario;
    }

    /**
     * Define el valor de la propiedad usrUsario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrUsario(String value) {
        this.usrUsario = value;
    }

    /**
     * Obtiene el valor de la propiedad psswdProveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsswdProveedortecnologico() {
        return psswdProveedortecnologico;
    }

    /**
     * Define el valor de la propiedad psswdProveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsswdProveedortecnologico(String value) {
        this.psswdProveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad rrDatos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrDatos() {
        return rrDatos;
    }

    /**
     * Define el valor de la propiedad rrDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrDatos(String value) {
        this.rrDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad datoprocsados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoprocsados() {
        return datoprocsados;
    }

    /**
     * Define el valor de la propiedad datoprocsados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoprocsados(String value) {
        this.datoprocsados = value;
    }

}
