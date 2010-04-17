package ws.example;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAttachmentRef;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * A book.
 * @version: $Id$
 * @author Roman Mazur (mailto: mazur.roman@gmail.com)
 */
@XmlElement
public class BookSearchResult {
  
  /** Error code. */
  private int errorCode;
  
  /** Message. */
  private String message;
  
  /** Content. */
  private DataHandler content;

  /**
   * @return the errorCode
   */
  @XmlElement
  public int getErrorCode() { return errorCode; }

  /**
   * @return the message
   */
  @XmlElement
  public String getMessage() { return message; }

  /**
   * @return the content
   */
  @XmlElement
  @XmlAttachmentRef
  public DataHandler getContent() { return content; }

  /**
   * @param errorCode the errorCode to set
   */
  public void setErrorCode(final int errorCode) { this.errorCode = errorCode; }

  /**
   * @param message the message to set
   */
  public void setMessage(final String message) { this.message = message; }

  /**
   * @param content the content to set
   */
  public void setContent(final DataHandler content) { this.content = content; }
  
}
