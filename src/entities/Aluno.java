package entities;

public class Aluno {
    public String Nome;
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double FinalGrade() {
        return Nota1 + Nota2 + Nota3;
    }

    public double MissingGrade() {
        if (FinalGrade() < 60.0) {
            return ((FinalGrade() - 60.0) * (-1));
        } else {
            return 0.0;
        }
    }
}
