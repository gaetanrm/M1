
package web.tpsoap.wd.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chambre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listResa" type="{http://wd.tpsoap.web/}reservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nbPersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "id",
    "listResa",
    "nbPersonnes",
    "price"
})
public class Chambre {

    protected int id;
    @XmlElement(nillable = true)
    protected List<Reservation> listResa;
    protected int nbPersonnes;
    protected int price;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the listResa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listResa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListResa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation }
     * 
     * 
     */
    public List<Reservation> getListResa() {
        if (listResa == null) {
            listResa = new ArrayList<Reservation>();
        }
        return this.listResa;
    }

    /**
     * Gets the value of the nbPersonnes property.
     * 
     */
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    /**
     * Sets the value of the nbPersonnes property.
     * 
     */
    public void setNbPersonnes(int value) {
        this.nbPersonnes = value;
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

}
