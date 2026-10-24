package by.LogiCom;

import java.util.Scanner;

public class LogisticsApp {

    public static Logistic logistic;

    public static void doLogistic() {
        logistic.dologistics();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        configureLogisticType(type);
        doLogistic();
    }

    private static void configureLogisticType(String type) {
        switch (type) {
            case "truck":
                logistic = new RoadLogistic();
                break;
            case "ship":
                logistic = new SeaLogistic();
                break;
        }
    }
}
