 import java.util.Arrays;


    public class Main {
        public static void main(String[] args) {
            Phone phone1 = new Phone(715975, "apple", 10);
            Phone phone2 = new Phone(635428, "xiaomi", 20);
            Phone phone3 = new Phone(326975, "lg", 30);
            System.out.println("Phone1 :" + phone1 + "\n" + "Phone2 :" + phone2 + "\n" + "Phone3 :" + phone3);

            phone1.receiveCall("Bret Pitt");
            phone2.receiveCall("Monica Bellucci");
            phone3.receiveCall("Ashot");

            int number1 = phone1.getNumber();
            int number2 = phone2.getNumber();
            int number3 = phone3.getNumber();
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);

            phone1.receiveCall("Gorik", 54465153);
            phone2.receiveCall("Anna", 45615165);
            phone3.receiveCall("Gena", 5141115);

            int[] numbers = phone1.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
            System.out.println(Arrays.toString(numbers));
        }
    }

