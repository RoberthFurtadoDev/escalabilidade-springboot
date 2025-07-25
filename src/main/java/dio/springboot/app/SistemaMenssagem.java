package dio.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMenssagem implements CommandLineRunner {

    private  String nome = "ROBERTH FURTADO";
    private  String email = "ROBERTH.EXEPLO@GMAIL.COM";
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long []{98988747741L}));

@Override
public void run(String... args) throws Exception{
    System.out.println("Mensagem enviada por: " + nome + "\nE-mail:" + email + "\nCom telefones para contato: " + telefones);
    System.out.println("Seu cadastro foi Aprovado");
    }
}
