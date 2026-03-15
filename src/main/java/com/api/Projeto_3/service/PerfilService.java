package com.api.Projeto_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.AfiliacaoDtos;
import com.api.Projeto_3.dtos.PerfilsDtos;
import com.api.Projeto_3.dtos.MoradiaDto;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.model.AfiliacaoModelo;
import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.MedicoModelo;
import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.model.PerfisModelo;
import com.api.Projeto_3.model.RolesModel;
import com.api.Projeto_3.model.TreinadorModel;
import com.api.Projeto_3.repository.AtletaRespository;
import com.api.Projeto_3.repository.MedicoRespository;
import com.api.Projeto_3.repository.RoleRepository;
import com.api.Projeto_3.repository.TreinadorRespository;

import jakarta.transaction.Transactional;

@Service
public class PerfilService {
    
    @Autowired
    AtletaRespository respository;

    @Autowired
    MedicoRespository jpaMedico;

    @Autowired
    TreinadorRespository jpaTreinador;

    @Autowired
    RoleRepository roles;

    //SAVALNDO ATLETA
    @Transactional
    public PerfilsDtos InsertAtleta(PerfilsDtos dtos ){
        AtletaModelo atl = new AtletaModelo();           
        
        preencherDadosBasicos(atl,dtos);
        salvarPerfil(dtos,atl );
        salvarAfiliado(dtos.getPais_fk(), atl);
        salvarMoradia(dtos.getMoradia_fk(), atl);
        
        AtletaModelo salvo = respository.save(atl);
        
        return new PerfilsDtos(salvo);
    }

    //salvando MEDICO
    @Transactional
    public PerfilsDtos insertMeidco( PerfilsDtos dos){
        MedicoModelo med = new MedicoModelo();
        
        preencherDadosBasicos(med, dos);
        salvarPerfil(dos, med);
        salvarAfiliado(dos.getPais_fk(), med);
        salvarMoradia(dos.getMoradia_fk(), med);

        MedicoModelo salveMeidco = jpaMedico.save(med);

        return new PerfilsDtos(salveMeidco);
    }


    //SALVANDO  TREINADOR

     @Transactional
    public PerfilsDtos insertTreinador( PerfilsDtos dos){
        TreinadorModel trei = new TreinadorModel();
        
        preencherDadosBasicos(trei, dos);
        salvarPerfil(dos, trei);
        salvarAfiliado(dos.getPais_fk(), trei);
        salvarMoradia(dos.getMoradia_fk(), trei);

        TreinadorModel salveTrei = jpaTreinador.save(trei);

        return new PerfilsDtos(salveTrei);
    }


    //BUSCANDO ROLE DE PERFIL
        public RoleDtos infoRoles(Long id){
            var rol = roles.findById(id).orElseThrow(()-> new RuntimeException());
            return new RoleDtos(rol);
        }





   //SALVANDO DOS FORMULARIO DO (ATLETA , MEDICO , TREINADOR) 
     private void   preencherDadosBasicos(PerfisModelo perMod, PerfilsDtos dtos){
            perMod.setName(dtos.getName());
            perMod.setDataNascimento(dtos.getDataNascimento());
            perMod.setCpf(dtos.getCpf());
            perMod.setRg(dtos.getRg());
            perMod.setEmail(dtos.getEmail());
            perMod.setSenha(dtos.getSenha());
            perMod.setTelefoneFixo(dtos.getTelefoneFixo());
            perMod.setTelefoneZap(dtos.getTelefoneZap());
            perMod.setPesoMigrama(dtos.getPesoMigrama());
            perMod.setUf(dtos.getUfDtos());
           
            perMod.setAlturaCetimentro(dtos.getAlturaCetimentro());
            perMod.setSangue(dtos.getSangue());
            perMod.setSexo(dtos.getGenero());

     }

     //SALVANDO PERIFLS EM CADA DE CADA UM 
      private   void salvarPerfil(PerfilsDtos dos,PerfisModelo atl){
        RolesModel roleReal = roles.findById(dos.getRoles().getId()).orElseThrow(() -> new RuntimeException("Role não encontrada"));
       atl.setRole(roleReal);
    }

    //SALVANDO AFILIAÇÃO
    private void salvarAfiliado(AfiliacaoDtos afi , PerfisModelo perMod){
         AfiliacaoModelo pais = new AfiliacaoModelo();

            pais.setMaeNome(afi.getMaeNome());
            pais.setMaeTelefone(afi.getMaeTelefone());
            pais.setMaeEmail(afi.getMaeEmail());
            pais.setPaiName(afi.getPaiName());
            pais.setPaiTelefone(afi.getPaiTelefone());
            pais.setPaiEmail(afi.getPaiEmail());

            perMod.setPais_fk(pais);

    }
    
     private void salvarMoradia(MoradiaDto morDtos , PerfisModelo perMod){
            MoradiaModel mor = new MoradiaModel();

            mor.setCep(morDtos.getCep());
            mor.setAvenida(morDtos.getAvenida());
            mor.setSn(morDtos.getSn());
            mor.setBairro(morDtos.getBairro());
            mor.setCidade(morDtos.getCidade());
            
           perMod.setMoradia_fk(mor);

    }


}

    
 
