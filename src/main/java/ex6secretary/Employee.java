package ex6secretary;

public class Employee {
    Secretary secretary;
    QuestionType questionType;
    private String name;

    public Employee(String name, Secretary secretary, QuestionType questionType) {
        this.secretary = secretary;
        this.questionType = questionType;
        this.name=name;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getName() {
        return name;
    }
}
