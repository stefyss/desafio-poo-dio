import br.com.dio.desafio.dominio.Curso;
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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do curso Java");
        mentoria1.setDescricao("Descrição mentoria do curso Java");
        mentoria1.setData(LocalDate.now());
        //LocalDate now = LocalDate.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        //String formattedDate = formatter.format(now);
        //System.out.println(formattedDate);





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
