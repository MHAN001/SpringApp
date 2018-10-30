package info7255.JsonSchema.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchemaController {
    @RequestMapping("/getSchemas")
    public String getSchemas(){
        System.out.println("*******request reach here*******");
        return "This is getEntity in Schema controller";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addSchema")
    public ResponseEntity addSchema(@RequestBody String tmp){
        System.out.println(tmp);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
