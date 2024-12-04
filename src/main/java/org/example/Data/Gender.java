package org.example.Data;

import java.util.Objects;
import java.util.stream.Stream;

public enum Gender {
    MALE ("M"),
    FEMALE ("F");

    private final String asInProtocol;

    Gender(String asInProtocol) {
        this.asInProtocol = asInProtocol;
    }

    public static Gender isG (String asInProtocol) {
        return Stream.of(values())
                .filter(g -> Objects.equals(g.asInProtocol, asInProtocol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown gender: " + asInProtocol));
    }
}
