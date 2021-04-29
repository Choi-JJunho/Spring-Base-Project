package controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.PhraseService;

@Controller
public class PhraseController {
    @Autowired
    PhraseService phraseService;
    
    @RequestMapping(value="/phrase", method=RequestMethod.GET)
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>(phraseService.getPhrase(), HttpStatus.OK);
    } 
}
