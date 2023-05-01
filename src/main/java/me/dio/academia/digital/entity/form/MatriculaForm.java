package me.dio.academia.digital.entity.form;
import javax.validation.constraints.*;
public class MatriculaForm {

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

}
