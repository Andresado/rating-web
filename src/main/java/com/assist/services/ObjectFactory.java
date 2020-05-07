
package com.assist.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.assist.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoTest_QNAME = new QName("http://services.assist.com/", "doTest");
    private final static QName _DoTestResponse_QNAME = new QName("http://services.assist.com/", "doTestResponse");
    private final static QName _GetsalidaEmision_QNAME = new QName("http://services.assist.com/", "getsalidaEmision");
    private final static QName _GetsalidaEmisionResponse_QNAME = new QName("http://services.assist.com/", "getsalidaEmisionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.assist.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoTest }
     * 
     */
    public DoTest createDoTest() {
        return new DoTest();
    }

    /**
     * Create an instance of {@link DoTestResponse }
     * 
     */
    public DoTestResponse createDoTestResponse() {
        return new DoTestResponse();
    }

    /**
     * Create an instance of {@link GetsalidaEmision }
     * 
     */
    public GetsalidaEmision createGetsalidaEmision() {
        return new GetsalidaEmision();
    }

    /**
     * Create an instance of {@link GetsalidaEmisionResponse }
     * 
     */
    public GetsalidaEmisionResponse createGetsalidaEmisionResponse() {
        return new GetsalidaEmisionResponse();
    }

    /**
     * Create an instance of {@link SalidaEmision }
     * 
     */
    public SalidaEmision createSalidaEmision() {
        return new SalidaEmision();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assist.com/", name = "doTest")
    public JAXBElement<DoTest> createDoTest(DoTest value) {
        return new JAXBElement<DoTest>(_DoTest_QNAME, DoTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assist.com/", name = "doTestResponse")
    public JAXBElement<DoTestResponse> createDoTestResponse(DoTestResponse value) {
        return new JAXBElement<DoTestResponse>(_DoTestResponse_QNAME, DoTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetsalidaEmision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assist.com/", name = "getsalidaEmision")
    public JAXBElement<GetsalidaEmision> createGetsalidaEmision(GetsalidaEmision value) {
        return new JAXBElement<GetsalidaEmision>(_GetsalidaEmision_QNAME, GetsalidaEmision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetsalidaEmisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assist.com/", name = "getsalidaEmisionResponse")
    public JAXBElement<GetsalidaEmisionResponse> createGetsalidaEmisionResponse(GetsalidaEmisionResponse value) {
        return new JAXBElement<GetsalidaEmisionResponse>(_GetsalidaEmisionResponse_QNAME, GetsalidaEmisionResponse.class, null, value);
    }

}
