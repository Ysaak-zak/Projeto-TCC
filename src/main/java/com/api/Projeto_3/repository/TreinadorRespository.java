package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.dtos.interfaceCustomer.CustomerNome;
import com.api.Projeto_3.dtos.interfaceCustomer.TreinadorCustomer;
import com.api.Projeto_3.dtos.model.PerfilsDtos;
import com.api.Projeto_3.model.TreinadorModel;

@Repository
public interface TreinadorRespository  extends JpaRepository<TreinadorModel,Long> {

    PerfilsDtos findByCpf(String cpf);

    @Query(value = "SELECT * FROM  perfis_modelo  AS per "
       +" INNER JOIN treinadores tre On tre.id = per.id "
       +" INNER JOIN moradia mor ON per.id = mor.id "
       +" INNER JOIN afliacao afl ON per.fal_fk = afl.id "
       +" WHERE per.cpf = :cpf " , nativeQuery = true)
    public TreinadorCustomer listTreinador(String cpf);


    @Query(value = " SELECT per.per_nome FROM perfis_modelo AS per " 
                 +" INNER JOIN treinadores tre ON tre.id = per.id "
                 +" WHERE per.cpf = :cpf "
                 , nativeQuery = true)
    public CustomerNome buscarNomes(String cpf);

    
    

    
}
