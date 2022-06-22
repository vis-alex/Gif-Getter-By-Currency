package com.alex.vis.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Feign клиент для получения рандомной гифки от giphy.com
 */
@FeignClient(name = "giphyClient", url = "${giphy.url.general}")
public interface FeignGiphyClient extends GifClient{

        @Override
        @GetMapping("/random")
        ResponseEntity<Map> getRandomGif(
                @RequestParam("api_key") String apiKey,
                @RequestParam("tag") String tag
        );

}
