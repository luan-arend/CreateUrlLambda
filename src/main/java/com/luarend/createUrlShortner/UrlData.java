package com.luarend.createUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor //Todos argumentos pro construtor
@Setter // Todos atributos terao setters
@Getter // Todos atributos terao getters
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
