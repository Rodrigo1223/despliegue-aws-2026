package cl.duoc.plataformacursos.repository;

import cl.duoc.plataformacursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    // Aquí puedes añadir métodos de búsqueda personalizados si lo necesitas
}