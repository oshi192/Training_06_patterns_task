package ex6secretary.administration;

import ex6secretary.Secretary;

public class Boss implements Administration {
    private Secretary secretary;

    public Boss(Secretary secretary) {
        this.secretary = secretary;
    }

    @Override
    public void interaction() {
        System.out.println("Boss:\t Hi! What a problem?");
        System.out.println(secretary.getEmployee().getName() + ":\t" +
                secretary.getEmployee().getQuestionType().description);
        System.out.println("Boss:\tall done, have a nice day!");
    }
}
