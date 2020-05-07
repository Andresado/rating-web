package com.assist.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-05-03T13:55:51.921-05:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://services.assist.com/", name = "TestWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface TestWebService {

    @WebMethod
    @RequestWrapper(localName = "doTest", targetNamespace = "http://services.assist.com/", className = "com.assist.services.DoTest")
    @ResponseWrapper(localName = "doTestResponse", targetNamespace = "http://services.assist.com/", className = "com.assist.services.DoTestResponse")
    public void doTest(
        @WebParam(name = "testInput", targetNamespace = "")
        com.assist.services.SalidaEmision testInput
    );

    @WebMethod
    @RequestWrapper(localName = "getsalidaEmision", targetNamespace = "http://services.assist.com/", className = "com.assist.services.GetsalidaEmision")
    @ResponseWrapper(localName = "getsalidaEmisionResponse", targetNamespace = "http://services.assist.com/", className = "com.assist.services.GetsalidaEmisionResponse")
    public void getsalidaEmision(
        @WebParam(name = "testtransaccion", targetNamespace = "")
        java.lang.String testtransaccion,
        @WebParam(mode = WebParam.Mode.OUT, name = "fueprocesado", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Boolean> fueprocesado,
        @WebParam(mode = WebParam.Mode.OUT, name = "msjerror", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> msjerror
    );
}
