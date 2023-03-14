import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso básico de Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Curso básico de JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Programação Orientada a Objetos");
        mentoria.setDescricao("Mentoria sobre programação orientada a objetos com exemplos em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Bootcamp para formação de desenvolvedores Full Stack");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria));

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);

        List<Dev> devs = Arrays.asList(devCamila, devJoao, devPedro, devAna);

        for (Dev dev : devs) {
            Random random = new Random();
            int progresso = random.nextInt(3);
            for (int i = 0; i < progresso; i++) {
                dev.progredir();
            }
            System.out.println("Nome do Dev: " + dev.getNome());
            System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
            System.out.println("XP: " + dev.calcularTotalXp());
            System.out.println("--------");
        }
    }
    }

