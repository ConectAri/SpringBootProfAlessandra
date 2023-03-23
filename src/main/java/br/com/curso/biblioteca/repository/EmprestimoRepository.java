package br.com.curso.biblioteca.repository;

import br.com.curso.biblioteca.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Repository
public interface EmprestimoRepository  extends JpaRepository<Emprestimo, Long> {

    // Lógica para registrar que um usuário emprestou uma obra

    public static void emprestarObra(Long idUsuario, Long idObra, Date dataEmprestimo) {

    }

    // Lógica para registrar que um usuário devolveu uma obra
    public static void devolverObra(Long idUsuario, Long idObra, Date dataDevolucao) {

    }


    // Lógica para listar as obras que um usuário pegou emprestado

        // Adicione os IDs das obras emprestadas na lista obrasEmprestadas

    public default List<Long> listarObrasEmprestadas(Long idUsuario) {

        List<Long> obrasEmprestadas = new ArrayList<Long>();
        return obrasEmprestadas;
    }


    }



