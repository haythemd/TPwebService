package com.example.tpProject;




import com.example.tpProject.SoapGen.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SoapController {
    @Autowired
    private SoapClient soapClient;

    @PostMapping("/Add")
    public AddResponse add(@RequestBody String request) throws JsonProcessingException {
       ObjectMapper objectMapper= new ObjectMapper();
        Add X=objectMapper.readValue(request, Add.class);
       System.out.println("ok");
       return soapClient.addResult(X);

    }
    @PostMapping("/Divide")
    public DivideResponse divide(@RequestBody String request) throws JsonProcessingException {
        ObjectMapper objectMapper= new ObjectMapper();
        Divide X=objectMapper.readValue(request, Divide.class);
        System.out.println("ok");
        return soapClient.divideResult(X);

    }
    @PostMapping("/Multiply")
    public MultiplyResponse multiply(@RequestBody String request) throws JsonProcessingException {
        ObjectMapper objectMapper= new ObjectMapper();
        Multiply X=objectMapper.readValue(request, Multiply.class);
        System.out.println("ok");
        return soapClient.multiplyResult(X);

    }

}
