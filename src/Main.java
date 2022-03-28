import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Dominando Java ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Dominando Java na pratica");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("java mentoria");
        mentoria.setData(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Quality Assurance GFT");
        bootcamp.setDescricao("Quality Assurance GFT1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJacson = new Dev();
        devJacson.setNome("Jacson");
        devJacson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos jacson" + devJacson.getConteudosIncritos());
        devJacson.progredir();
        devJacson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos jacson" + devJacson.getConteudosIncritos());
        System.out.println("Conteudos concluidos jacson" + devJacson.getConteudosConcluidos());
        System.out.println("XP:" + devJacson.calcularTotalXp());
        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos joao" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos joao" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos concluidos joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}
