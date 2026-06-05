package com.estagio.estagio;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MediaController {
    private final MediaService mediaService;

    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @PostMapping("/calcular-media")
    public String calcularMedia(@RequestBody MediaRequest request) {
        return mediaService.calcularResultado(request);
    }

    @GetMapping("/data-hora")
    public String dataHora() {
        return LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
