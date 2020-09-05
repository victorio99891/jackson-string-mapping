package pl.wiktor.testjsonresponse.model;

public class JSONModel {
    private Long id;
    private JSONComponent component;

    public JSONModel(Long id, JSONComponent component) {
        this.id = id;
        this.component = component;
    }

    public JSONModel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JSONComponent getComponent() {
        return component;
    }

    public void setComponent(JSONComponent component) {
        this.component = component;
    }
}
