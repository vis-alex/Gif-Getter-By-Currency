package com.alex.vis.client;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GifClient {

    ResponseEntity<Map> getRandomGif(String apiKey, String tag);

}
