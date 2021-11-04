import java.util.Scanner;

public class Atm {
    Scanner sc = new Scanner(System.in);
    private int total = 20000;
    private int pin;

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }

    public void installPin(){
        System.out.println("Enter new pin:");
        int variablePin = sc.nextInt();
        setPin(variablePin);
        System.out.println("Pin set");
        }

    public void pin() {
        System.out.println("Enter pin:");
        int enterPin = sc.nextInt();
        while (enterPin != getPin()) {
            System.out.println("Try again");
            System.out.println("Enter pin:");
            pin = sc.nextInt();
        }
        System.out.println("Welcome to our bank!");
    }

    public void menu() {
        System.out.println("Choose next variant:");
        System.out.println("1- To show all money on the screen");
        System.out.println("2- To get the money");
        System.out.println("Enter number:");
    }

    public void money() {
        while (getTotal() != -1) {
            menu();
            int decision = sc.nextInt();
            if (decision == 1) {
                System.out.println(getTotal() + "UAH");
            } else if (decision == 2) {
                while (decision == 2) {
                    System.out.println("How much?");
                    int number = sc.nextInt();
                    if (number <= getTotal() && number > 0) {
                        System.out.println("Take your money!");
                        setTotal(getTotal() - number);
                        break;
                    } else if (number > getTotal()) {
                        System.out.println("Not enough money");
                        continue;
                    } else if (number < 1) {
                        System.out.println("Incorrect number!");
                        System.out.println("Try again:");
                        continue;
                    }
                }
            }
            System.out.println("Would you like to continue?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            int quit = sc.nextInt();
            if (quit == 2) {
                break;
            } else if (quit == 1) {
                continue;
            }
        }
    }

        public static void main(String[] args) {
            Atm ivan = new Atm();
            ivan.installPin();
            ivan.pin();
            ivan.money();
        }
    }
