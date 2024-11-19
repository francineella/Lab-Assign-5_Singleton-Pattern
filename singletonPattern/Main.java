package singletonPattern;

public class Main {
    public static void main(String[] args) {

        helpDeskStation s1 = new helpDeskStation("Help Desk 1");
        helpDeskStation s2 = new helpDeskStation("Help Desk 2");
        helpDeskStation s3 = new helpDeskStation("Help Desk 3");

        s1.nextCustomer();
        s2.nextCustomer();
        s3.nextCustomer();

        s1.nextCustomer();
        s2.resetQueue(0);
        s3.nextCustomer();

        s2.nextCustomer();
        s2.resetQueue(-1);
        s2.resetQueue(1);
    }
}