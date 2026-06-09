package com.estagio.estagio;

import org.springframework.stereotype.Service;

@Service
public class MediaService {
    public String calcularResultado(MediaRequest request) {
        double media = (request.getNota1() + request.getNota2()) / 2.0;

        if (media > 5.0) {
            return "Parabéns " + request.getNome() + ", você foi aprovado.";
        } else if (media < 5.0) {
            return request.getNome() + ", você foi reprovado.";
        } else {
            return request.getNome() + ", você não atingiu a nota de corte e está de exame.";
        }
    }
}
