package ex6secretary;

public enum QuestionType {
    PAPER_TO_SIGN("I have papers for sign"),
    SALARY_QUESTION("I want to change prepayment date"),
    NEW_ITEM("I need some new stuff"),
    JOB_PROBLEM_SIMPLE("I have a little problem with my presentation"),
    JOB_PROBLEM_HARD("I have some trouble");
    public final String description;

    QuestionType(String description) {
        this.description = description;
    }
}
