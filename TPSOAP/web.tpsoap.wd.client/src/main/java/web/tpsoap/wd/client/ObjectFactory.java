
package web.tpsoap.wd.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web.tpsoap.wd.client package. 
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

    private final static QName _GetAgence_QNAME = new QName("http://wd.tpsoap.web/", "getAgence");
    private final static QName _GetAgenceResponse_QNAME = new QName("http://wd.tpsoap.web/", "getAgenceResponse");
    private final static QName _IsPartenaire_QNAME = new QName("http://wd.tpsoap.web/", "isPartenaire");
    private final static QName _IsPartenaireResponse_QNAME = new QName("http://wd.tpsoap.web/", "isPartenaireResponse");
    private final static QName _MakeReservation_QNAME = new QName("http://wd.tpsoap.web/", "makeReservation");
    private final static QName _MakeReservationResponse_QNAME = new QName("http://wd.tpsoap.web/", "makeReservationResponse");
    private final static QName _SearchChambre_QNAME = new QName("http://wd.tpsoap.web/", "searchChambre");
    private final static QName _SearchChambreResponse_QNAME = new QName("http://wd.tpsoap.web/", "searchChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web.tpsoap.wd.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAgence }
     * 
     */
    public GetAgence createGetAgence() {
        return new GetAgence();
    }

    /**
     * Create an instance of {@link GetAgenceResponse }
     * 
     */
    public GetAgenceResponse createGetAgenceResponse() {
        return new GetAgenceResponse();
    }

    /**
     * Create an instance of {@link IsPartenaire }
     * 
     */
    public IsPartenaire createIsPartenaire() {
        return new IsPartenaire();
    }

    /**
     * Create an instance of {@link IsPartenaireResponse }
     * 
     */
    public IsPartenaireResponse createIsPartenaireResponse() {
        return new IsPartenaireResponse();
    }

    /**
     * Create an instance of {@link MakeReservation }
     * 
     */
    public MakeReservation createMakeReservation() {
        return new MakeReservation();
    }

    /**
     * Create an instance of {@link MakeReservationResponse }
     * 
     */
    public MakeReservationResponse createMakeReservationResponse() {
        return new MakeReservationResponse();
    }

    /**
     * Create an instance of {@link SearchChambre }
     * 
     */
    public SearchChambre createSearchChambre() {
        return new SearchChambre();
    }

    /**
     * Create an instance of {@link SearchChambreResponse }
     * 
     */
    public SearchChambreResponse createSearchChambreResponse() {
        return new SearchChambreResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAgence }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "getAgence")
    public JAXBElement<GetAgence> createGetAgence(GetAgence value) {
        return new JAXBElement<GetAgence>(_GetAgence_QNAME, GetAgence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAgenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "getAgenceResponse")
    public JAXBElement<GetAgenceResponse> createGetAgenceResponse(GetAgenceResponse value) {
        return new JAXBElement<GetAgenceResponse>(_GetAgenceResponse_QNAME, GetAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPartenaire }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsPartenaire }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "isPartenaire")
    public JAXBElement<IsPartenaire> createIsPartenaire(IsPartenaire value) {
        return new JAXBElement<IsPartenaire>(_IsPartenaire_QNAME, IsPartenaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPartenaireResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsPartenaireResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "isPartenaireResponse")
    public JAXBElement<IsPartenaireResponse> createIsPartenaireResponse(IsPartenaireResponse value) {
        return new JAXBElement<IsPartenaireResponse>(_IsPartenaireResponse_QNAME, IsPartenaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "makeReservation")
    public JAXBElement<MakeReservation> createMakeReservation(MakeReservation value) {
        return new JAXBElement<MakeReservation>(_MakeReservation_QNAME, MakeReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "makeReservationResponse")
    public JAXBElement<MakeReservationResponse> createMakeReservationResponse(MakeReservationResponse value) {
        return new JAXBElement<MakeReservationResponse>(_MakeReservationResponse_QNAME, MakeReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "searchChambre")
    public JAXBElement<SearchChambre> createSearchChambre(SearchChambre value) {
        return new JAXBElement<SearchChambre>(_SearchChambre_QNAME, SearchChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wd.tpsoap.web/", name = "searchChambreResponse")
    public JAXBElement<SearchChambreResponse> createSearchChambreResponse(SearchChambreResponse value) {
        return new JAXBElement<SearchChambreResponse>(_SearchChambreResponse_QNAME, SearchChambreResponse.class, null, value);
    }

}
