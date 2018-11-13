package ex6secretary.administration;

import ex6secretary.Employee;
import ex6secretary.Secretary;

public class StorageMan implements Administration {
    private Secretary secretary;

    public StorageMan(Secretary secretary) {
        this.secretary = secretary;
    }

    @Override
    public void interaction() {
        System.out.println("StorageMan:\t Hi!");
        System.out.println(secretary.getEmployee().getName() + ":\t" +
                secretary.getEmployee().getQuestionType().description);
        System.out.println("StorageMan:\tHere it is, bye!");
    }
}
