package com.tts.feedback.service;

import com.tts.feedback.model.Response;
import com.tts.feedback.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepository responseRepository;
    public Response getResponse(Long id) {
        return responseRepository.findById(id).orElseThrow();
    }
//    write a method that creates/ saves the response to the database
    public void saveResponse(Response response){
        responseRepository.save(response);
    }
}
