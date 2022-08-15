package co.gov.minambiente.modelo;

import java.util.HashMap;

/**
 *
 * @author Natalia García
 */
public class CategoryBModel extends CategoryModel{
    private String typeOperation;
    private HashMap<Integer, String> revenuesExpected;
    private String associatedCategory;
    private String methodUtilization;

    public CategoryBModel(String name) {
        super(name);
        this.typeOperation = "";
        this.revenuesExpected = new HashMap<>();
        this.associatedCategory = "";
        this.methodUtilization = "";
    }

    public CategoryBModel(String typeOperation, HashMap<Integer, String> revenuesExpected, String associatedCategory, String methodUtilization, String name) {
        super(name);
        this.typeOperation = typeOperation;
        this.revenuesExpected = revenuesExpected;
        this.associatedCategory = associatedCategory;
        this.methodUtilization = methodUtilization;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public HashMap<Integer, String> getRevenuesExpected() {
        return revenuesExpected;
    }

    public void setRevenuesExpected(HashMap<Integer, String> revenuesExpected) {
        this.revenuesExpected = revenuesExpected;
    }

    public String getAssociatedCategory() {
        return associatedCategory;
    }

    public void setAssociatedCategory(String associatedCategory) {
        this.associatedCategory = associatedCategory;
    }

    public String getMethodUtilization() {
        return methodUtilization;
    }

    public void setMethodUtilization(String methodUtilization) {
        this.methodUtilization = methodUtilization;
    } 
}
