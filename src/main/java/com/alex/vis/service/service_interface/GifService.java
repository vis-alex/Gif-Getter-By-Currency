package com.alex.vis.service.service_interface;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GifService {
    ResponseEntity<Map> getGif(String tag);
}
