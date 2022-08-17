package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryC1Model extends CategoryCModel{
    private String individualStatus;

    public CategoryC1Model(String locationOrType) {
        super(locationOrType);
        individualStatus = "";
    }

    public CategoryC1Model(String locationOrType, String individualStatus) {
        super(locationOrType);
        this.individualStatus = individualStatus;
    } 

    public String getIndividualStatus() {
        return individualStatus;
    }

    public void setIndividualStatus(String individualStatus) {
        this.individualStatus = individualStatus;
    }
}
