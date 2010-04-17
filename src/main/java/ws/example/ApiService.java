package ws.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Methods that implement some API and are accessed via SOAP.
 * @version: $Id$
 * @author Roman Mazur (mailto: mazur.roman@gmail.com)
 */
@WebService(targetNamespace = "http://ws.example.org", name="API")
public class ApiService {

  /**
   * @param x first operand
   * @param y second operand
   * @return sum
   */
  @WebMethod
  public int add(@WebParam(name="x") final int x, @WebParam(name="y") final int y) {
    return x + y;
  }
  
  /**
   * @param x first operand
   * @param y second operand
   * @return division result
   */
  @WebMethod
  public int div(@WebParam(name="x") final int x, @WebParam(name="y") final int y) {
    return x / y;
  }

  /**
   * @return new circle instance 
   */
  public @WebResult Circle createCircle() {
    return new Circle() {{
      setR(10); setX(3); setY(5);
    }};
  }
  
}
