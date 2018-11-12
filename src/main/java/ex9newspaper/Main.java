package ex9newspapper;

public class Main {
    public static void main(String[] args) {
        Typography jobSite = new Typography();

        jobSite.addVaconcy("the Village Thruth! release# 1");
        jobSite.addVaconcy("the Village Thruth! release# 2");
        jobSite.addVaconcy("the Village Thruth! release# 3");

        jobSite.addObserver(new Subscriber ("Peter Pettigrew"));
        jobSite.addObserver(new Subscriber ("Haiman Agil"));
        jobSite.addObserver(new Subscriber ("Dmitriy Kolikov"));

        jobSite.addVaconcy("the Village Thruth! release# 4");
    }
}