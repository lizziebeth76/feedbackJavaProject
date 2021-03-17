package com.tts.feedback.controller;

import com.tts.feedback.model.Response;
import com.tts.feedback.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @Autowired
    private ResponseService responseService;
    @GetMapping("/response")
    public Response getResponse(){
        Response response = new Response("Lionel", "Alec");
        return response;
    }
}
