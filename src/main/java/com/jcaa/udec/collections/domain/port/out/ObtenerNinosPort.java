package com.jcaa.udec.collections.domain.port.out;

import com.jcaa.udec.collections.domain.core.model.Child;
import java.util.List;
import java.util.Optional;

public interface ObtenerNinosPort {
    List<Child> obtenerTodos();
    Optional<Child> obtenerPorId(String id);
    Optional<Child> obtenerPorMatricula(String matricula);
}