package singletonPattern;

public class helpDeskStation {
    private String stationName;

    public helpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void nextCustomer() {
        queuingSystem queueSystem = queuingSystem.getInstance();
        int nextQueueNum = queueSystem.getNextQueueNum();
        System.out.println(stationName + " is now serving queue number: " + nextQueueNum);
    }

    public void resetQueue(int startNum) {
        queuingSystem queueSystem = queuingSystem.getInstance();
        String result = queueSystem.resetQueue(startNum);
        System.out.println(stationName + " - " + result);
    }
}