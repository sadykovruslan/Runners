package org.example.Data;

import java.util.Objects;
import java.util.stream.Stream;

public enum Distance {
FIVE_KM ("5 km"),
TEN_KM ("10 km");

private final String asInProtocol;

    Distance (String asInProtocol) {
        this.asInProtocol = asInProtocol;
    }


    public static Distance isD (String asInProtocol){
        return Stream.of(values())
                .filter(d -> Objects.equals(d.asInProtocol, asInProtocol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown distance: " + asInProtocol));
    }
}
