package ws.example;

import java.io.File;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@MTOM
@WebService(targetNamespace = "http://ws.example.org", name="Book")
public class BookService {

  /**
   * @param name book name
   * @return search result
   */
  public @WebResult BookSearchResult searchBook(final String name) throws IOException {
    BookSearchResult res = new BookSearchResult();
    File f = new File(name);
    if (!f.exists()) {
      res.setErrorCode(1);
      res.setMessage("not found");
      return res;
    }
    res.setErrorCode(0);
    res.setContent(new DataHandler(f.toURI().toURL()));
    return res;
  }
  
}
