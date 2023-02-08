package com.bootcamp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
@RequestMapping("/api/v1")
public class MessageRestController {

    @GetMapping("/message")
    public String getMessage(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
        return name;
    }



}*/
@RestController
@RequestMapping("/api/v1")
public class MessageRestController {
/*
    @Value("${course.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage(@RequestParam(value = "name", defaultValue = "${course.message}") String name) {
        return name;
    }
*/
    /*
    Hay capa path
    capa lógica
    capa datos
     */
    private MessageService messageService;

    @Autowired
    public MessageRestController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return this.messageService.getMessage();
    }


}



