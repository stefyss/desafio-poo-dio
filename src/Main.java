import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso Java");
        mentoria.setDescricao("Descrição mentoria do curso Java");
        mentoria.setData(LocalDate.now());
        //LocalDate now = LocalDate.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        //String formattedDate = formatter.format(now);
        //System.out.println(formattedDate);

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStefanni = new Dev();
        devStefanni.setNome("Stéfanni");
        devStefanni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stéfanni" + devStefanni.getConteudosInscritos());

        devStefanni.progredir();
        devStefanni.progredir();
        System.out.println("");

        System.out.println("Conteúdos Concluídos Stéfanni" + devStefanni.getConteudosConcluidos());
        System.out.println("");
        System.out.println("Conteúdos Inscritos Stéfanni" + devStefanni.getConteudosInscritos());
        System.out.println("XP:" + devStefanni.calcularTotalXp());
        System.out.println("----------------------------------------------------------------------------");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos José" + devJose.getConteudosInscritos());

        devJose.progredir();
        devJose.progredir();
        devJose.progredir();


        System.out.println("");
        System.out.println("Conteúdos Concluídos José" + devJose.getConteudosConcluidos());
        System.out.println("");
        System.out.println("Conteúdos Inscritos José" + devJose.getConteudosInscritos());
        System.out.println("XP:" + devJose.calcularTotalXp());

    }
}
