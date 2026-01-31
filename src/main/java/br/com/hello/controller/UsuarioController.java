package br.com.hello.controller;

import br.com.hello.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @PostMapping("/login")
    public ResponseEntity<Usuario> Login(@RequestBody Usuario dadosLogin) {
        System.out.println("Recebido:" +dadosLogin.getEmail() + ":" + dadosLogin.getSenha());
        if(dadosLogin.getEmail().equals("leo@leo.com")){
            if(dadosLogin.getSenha().equals("1234")){
                Usuario resposta = new Usuario();
                resposta.setId(1234);
                resposta.setNome("Leo");
                resposta.setSenha("*****");
                return ResponseEntity.ok(resposta);

            }
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.notFound().build();
    }
}
