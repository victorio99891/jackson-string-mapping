package pl.wiktor.testjsonresponse.model;

import com.fasterxml.jackson.annotation.JsonRawValue;

import java.util.Objects;

public class Model {

    private final String testJsonBody = "{\"id\":1, \"component\": {\"id\":1001, \"name\":\"Test Name\"}}";

    private Long id;
    private String channelName;
    private String body;

    public Model(Long id, String channelName) {
        this.id = id;
        this.channelName = channelName;
        this.body = testJsonBody;
    }

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(id, model.id) &&
                Objects.equals(channelName, model.channelName) &&
                Objects.equals(body, model.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, channelName, body);
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
