package com.dev.cejasclaudio.webappmascotas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veterinario {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String nombre;
    private String matricula;
    private String email;

    @OneToMany(mappedBy = "veterinario") //asi se llama el atributo de relacion que va a estar en mascotas.
    private List<Mascota> mascotasAtendidas;

}
