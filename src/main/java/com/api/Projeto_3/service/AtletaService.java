package com.api.Projeto_3.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.api.Projeto_3.dtos.AfiliacaoDtos;
import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.dtos.MoradiaDto;
import com.api.Projeto_3.model.AfiliacaoModelo;
import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.repository.AtletaRespository;

import jakarta.transaction.Transactional;

@Service
public class AtletaService {
    
    @Autowired
    AtletaRespository respository;

  
    private static String caminho = "/home/ysaak/FACULDADE/PROJETO_TCC/api/Projeto-TCC/uplods";

    @Transactional
    public AtletaDtos InsertAtleta(AtletaDtos dtos , MultipartFile file){
            AtletaModelo atl = new AtletaModelo();
           
            salvarAtleta(atl, dtos);
          
            salvarAfiliado(dtos.getPais_fk(), atl);
            salvarMoradia(dtos.getMoradia_fk(), atl);
            salvaImg(dtos , file , atl);
            
            respository.save(atl);

           return new AtletaDtos(atl);
    }

    //SALVANDO ATLETAS

    private void salvarAtleta( AtletaModelo atl , AtletaDtos dtos){

           
            atl.setName(dtos.getName());
            atl.setDataNascimento(dtos.getDataNascimento());
            atl.setCpf(dtos.getCpf());
            atl.setRg(dtos.getRg());
            atl.setEmail(dtos.getEmail());
            atl.setSenha(dtos.getSenha());
            atl.setTelefoneFixo(dtos.getTelefoneFixo());
            atl.setTelefoneZap(dtos.getTelefoneZap());
            atl.setPesoMigrama(dtos.getPesoMigrama());
            atl.setAlturaCetimentro(dtos.getAlturaCetimentro());
    }

    //SALVANDOS OS AFILIADOS
    private void salvarAfiliado(AfiliacaoDtos afi , AtletaModelo atl){
          AfiliacaoModelo pais = new AfiliacaoModelo();

            pais.setMaeNome(afi.getMaeNome());
            pais.setMaeTelefone(afi.getMaeTelefone());
            pais.setMaeEmail(afi.getMaeEmail());
            pais.setPaiName(afi.getPaiName());
            pais.setPaiTelefone(afi.getPaiTelefone());
            pais.setPaiEmail(afi.getPaiEmail());


            atl.setPais(pais);

    }

    //Salvados Moradias

    private void salvarMoradia(MoradiaDto en , AtletaModelo atl){
            MoradiaModel mor = new MoradiaModel();

            mor.setCep(en.getCep());
            mor.setAvenida(en.getAvenida());
            mor.setSn(en.getSn());
            mor.setBairro(en.getBairro());
            mor.setCidade(en.getCidade());
            
           atl.setMoradia_fk(mor);

    }

  
    
    //img

    private void salvaImg(AtletaDtos dos , MultipartFile ar , AtletaModelo atl){
        try {
                if(!ar.isEmpty()){
                    byte[] bytesImg = ar.getBytes();
                    Path path = Paths.get(caminho+String.valueOf(atl.getId()+ar.getOriginalFilename()));
                    Files.write(path, bytesImg);

                    atl.setFotoImg(String.valueOf(atl.getId())+ ar.getOriginalFilename());

                    
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    



    }

    
 
