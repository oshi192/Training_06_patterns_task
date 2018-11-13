package ex6secretary.administration;

import ex6secretary.Secretary;

public class ManagerCurator implements Administration{
    private Secretary secretary;

    public ManagerCurator(Secretary secretary) {
        this.secretary = secretary;
    }

    @Override
    public void interaction() {
        System.out.println("ManagerCurator:\t Hi! What a problem?");
        System.out.println(secretary.getEmployee().getName() + ":\t" +
                secretary.getEmployee().getQuestionType().description);
        System.out.println("ManagerCurator:\tI hope I helped you");
    }
}
