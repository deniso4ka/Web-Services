
package main;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CarServiceImpl", targetNamespace = "http://main/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CarServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<main.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "remove", targetNamespace = "http://main/", className = "main.Remove")
    @ResponseWrapper(localName = "removeResponse", targetNamespace = "http://main/", className = "main.RemoveResponse")
    @Action(input = "http://main/CarServiceImpl/removeRequest", output = "http://main/CarServiceImpl/removeResponse")
    public List<Car> remove(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<main.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://main/", className = "main.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://main/", className = "main.UpdateResponse")
    @Action(input = "http://main/CarServiceImpl/updateRequest", output = "http://main/CarServiceImpl/updateResponse")
    public List<Car> update(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

    /**
     * 
     * @return
     *     returns java.util.List<main.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "displayCars", targetNamespace = "http://main/", className = "main.DisplayCars")
    @ResponseWrapper(localName = "displayCarsResponse", targetNamespace = "http://main/", className = "main.DisplayCarsResponse")
    @Action(input = "http://main/CarServiceImpl/displayCarsRequest", output = "http://main/CarServiceImpl/displayCarsResponse")
    public List<Car> displayCars();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<main.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCar", targetNamespace = "http://main/", className = "main.AddCar")
    @ResponseWrapper(localName = "addCarResponse", targetNamespace = "http://main/", className = "main.AddCarResponse")
    @Action(input = "http://main/CarServiceImpl/addCarRequest", output = "http://main/CarServiceImpl/addCarResponse")
    public List<Car> addCar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

}
