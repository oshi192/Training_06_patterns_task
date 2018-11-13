package ex6secretary.administration;

import ex6secretary.Employee;
import ex6secretary.Secretary;

public class Accountant implements Administration{
    private Secretary secretary;

    public Accountant(Secretary secretary) {
        this.secretary = secretary;
    }

    @Override
    public void interaction() {
        System.out.println("Accountant:\t Hi! What a problem?");
        System.out.println(secretary.getEmployee().getName() + ":\t" +
                secretary.getEmployee().getQuestionType().description);
        System.out.println("Accountant:\tall done, have a nice day!");
    }
}
