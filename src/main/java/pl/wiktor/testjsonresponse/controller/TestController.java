package pl.wiktor.testjsonresponse.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wiktor.testjsonresponse.model.JSONModel;
import pl.wiktor.testjsonresponse.model.Model;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("channel")
public class TestController {

    private final Model testSingleChannel = new Model(1L, "MyChannelName");

    @GetMapping(path = "single", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getSingleResponse() {
        return testSingleChannel.getBody();
    }


    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<JSONModel> getCollection() throws JsonProcessingException {
        String jsonSet = Collections.singleton(testSingleChannel.getBody()).toString();
        return new ObjectMapper().readValue(jsonSet, Set.class);
    }


}
