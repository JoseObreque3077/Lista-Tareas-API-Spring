package com.example.listatareas.restTemplate;

import com.example.listatareas.model.Tarea;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class restTemplateProvider {

    public Tarea getTareaFromApi(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "http://localhost:8080/api/tarea/" + id;
        ResponseEntity<Tarea> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    public List<Tarea> getTareasFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url = "http://localhost:8080/api/tareas";
        ResponseEntity<List<Tarea>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    public void saveTareaToApi(Tarea tarea) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Tarea> request = new HttpEntity<>(tarea, headers);
        String url = "http://localhost:8080/api/tarea";
        ResponseEntity<Object> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                request,
                new ParameterizedTypeReference<>() {}
        );
    }

    //TODO: método para trabajar con edición de una tarea (el formulario de edición debe indicar si un nuevo titulo ya está en uso!)
}
