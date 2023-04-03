package net.netbase.entities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class BaseEntity {
    protected String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static <T> T fromJsonClass (String value, Class<T> type) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(value, type);
    }

    public String toJsonString() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }
}
