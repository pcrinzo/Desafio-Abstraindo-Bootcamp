import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JAVA");
        mentoria1.setDescricao("Descrição mentoria JAVA");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devPatrick = new Dev();
        devPatrick.setNome("Patrick");
        devPatrick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos"+devPatrick.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+devPatrick.getConteudosConcluidos());
        devPatrick.progredir();
        System.out.println("Conteúdos Inscritos"+devPatrick.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+devPatrick.getConteudosConcluidos());
        System.out.println("XP: "+devPatrick.calcularXP());


        System.out.println("\n-----------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos"+devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+devMaria.getConteudosConcluidos());
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("Conteúdos Inscritos"+devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos"+devMaria.getConteudosConcluidos());
        System.out.println("XP: "+devMaria.calcularXP());


    }
}
