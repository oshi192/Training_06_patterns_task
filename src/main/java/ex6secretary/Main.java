package ex6secretary;

import ex6secretary.administration.Accountant;
import ex6secretary.administration.Boss;
import ex6secretary.administration.ManagerCurator;
import ex6secretary.administration.StorageMan;

public class Main {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setAdministration(new Boss(secretary),
                new ManagerCurator(secretary),
                new StorageMan(secretary),
                new Accountant(secretary));

        Employee employee0 = new Employee("Hikaru Sulu",secretary,QuestionType.SALARY_QUESTION);
        Employee employee1 = new Employee("James T. Kirk",secretary,QuestionType.JOB_PROBLEM_HARD);
        Employee employee2 = new Employee("Spock",secretary,QuestionType.JOB_PROBLEM_SIMPLE);
        Employee employee3 = new Employee("Nyota Uhura",secretary,QuestionType.NEW_ITEM);
        Employee employee4 = new Employee("Dr. Leonard \"Bones\" McCoy",secretary,QuestionType.PAPER_TO_SIGN);
        secretary.employeeInteraction(employee0);
        secretary.employeeInteraction(employee1);
        secretary.employeeInteraction(employee2);
        secretary.employeeInteraction(employee3);
        secretary.employeeInteraction(employee4);
    }
}
