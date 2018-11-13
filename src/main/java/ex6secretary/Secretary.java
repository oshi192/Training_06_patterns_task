package ex6secretary;

import ex6secretary.administration.Accountant;
import ex6secretary.administration.Boss;
import ex6secretary.administration.ManagerCurator;
import ex6secretary.administration.StorageMan;

import java.util.HashMap;
import java.util.Map;

public class Secretary {
    private Employee employee;
    private Boss boss;
    private ManagerCurator managerCurator;
    private StorageMan storageMan;
    private Accountant accountant;
    private Map<QuestionType, Runnable> questionMap = new HashMap<>();

    public Secretary() {
    }

    public void setAdministration(Boss boss, ManagerCurator managerCurator, StorageMan storageMan, Accountant accountant) {
        this.boss = boss;
        this.managerCurator = managerCurator;
        this.storageMan = storageMan;
        this.accountant = accountant;
        fillQuestionMap();
    }
    private void fillQuestionMap(){
        questionMap.put(QuestionType.JOB_PROBLEM_HARD, () -> boss.interaction());
        questionMap.put(QuestionType.PAPER_TO_SIGN, () -> boss.interaction());
        questionMap.put(QuestionType.JOB_PROBLEM_SIMPLE, () -> managerCurator.interaction());
        questionMap.put(QuestionType.SALARY_QUESTION, () -> accountant.interaction());
        questionMap.put(QuestionType.NEW_ITEM, () -> storageMan.interaction());
    }

    public void employeeInteraction(Employee employee) {
        this.employee = employee;
        System.out.println("Secretary:\tHello " + employee.getName()+", how can I help you?");
        questionMap.get(employee.getQuestionType()).run();
        System.out.println("Secretary: \tBye...\n");
    }

    public Employee getEmployee() {
        return employee;
    }

    private void run() {
        System.out.println("start lambda");
        this.boss.interaction();
    }
}
