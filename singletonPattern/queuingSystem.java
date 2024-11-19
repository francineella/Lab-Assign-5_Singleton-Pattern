package singletonPattern;

public class queuingSystem {
    private static queuingSystem instance;
    private int currentQueueNum;

    private queuingSystem () {
        currentQueueNum = 0;
    }

    public static synchronized queuingSystem getInstance() {
        if (instance == null)
                instance = new queuingSystem();
        return instance;
    }

    public synchronized int getNextQueueNum() {
        currentQueueNum++;
        return currentQueueNum;
    }
    public synchronized String resetQueue(int newQueue) {
        if (newQueue >=0) {
            currentQueueNum = newQueue;
            return "Queue succesfully reset to: " + newQueue;
        } else {
            return "Queue number should be a positive number";
        }
    }
    public synchronized int getCurrentQueueNum(){
        return currentQueueNum;
    }

}