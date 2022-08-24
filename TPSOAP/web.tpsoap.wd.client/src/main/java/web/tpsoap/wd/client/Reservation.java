
package web.tpsoap.wd.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carteCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ch" type="{http://wd.tpsoap.web/}chambre" minOccurs="0"/&gt;
 *         &lt;element name="cl" type="{http://wd.tpsoap.web/}client" minOccurs="0"/&gt;
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idAgence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "carteCredit",
    "ch",
    "cl",
    "dateArrivee",
    "dateDepart",
    "idAgence",
    "login",
    "name",
    "password",
    "price",
    "surname"
})
public class Reservation {

    protected Long carteCredit;
    protected Chambre ch;
    protected Client cl;
    protected Long dateArrivee;
    protected Long dateDepart;
    protected Long idAgence;
    protected String login;
    protected String name;
    protected String password;
    protected int price;
    protected String surname;

    /**
     * Gets the value of the carteCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarteCredit() {
        return carteCredit;
    }

    /**
     * Sets the value of the carteCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarteCredit(Long value) {
        this.carteCredit = value;
    }

    /**
     * Gets the value of the ch property.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getCh() {
        return ch;
    }

    /**
     * Sets the value of the ch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setCh(Chambre value) {
        this.ch = value;
    }

    /**
     * Gets the value of the cl property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getCl() {
        return cl;
    }

    /**
     * Sets the value of the cl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setCl(Client value) {
        this.cl = value;
    }

    /**
     * Gets the value of the dateArrivee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateArrivee() {
        return dateArrivee;
    }

    /**
     * Sets the value of the dateArrivee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateArrivee(Long value) {
        this.dateArrivee = value;
    }

    /**
     * Gets the value of the dateDepart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateDepart() {
        return dateDepart;
    }

    /**
     * Sets the value of the dateDepart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateDepart(Long value) {
        this.dateDepart = value;
    }

    /**
     * Gets the value of the idAgence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAgence() {
        return idAgence;
    }

    /**
     * Sets the value of the idAgence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAgence(Long value) {
        this.idAgence = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
