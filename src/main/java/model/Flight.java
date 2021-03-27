package model;

import java.time.LocalDate;
import java.util.Date;

public class Flight {

    private LocalDate fechaIda;
    private String origen;
    private String destino;

    public Flight(String origen, String destino) {
        this.fechaIda = LocalDate.now().plusDays(1);;
        this.origen = origen;
        this.destino = destino;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
