import java.util.*;

import For_java_HW.Laptop;
import For_java_HW.промежатестация;

public class промежаттестация2 {
    public static void main(String[] args) {

        final Laptop l1 = new Laptop();
        промежатестация l2 = new промежатестация(2, 4, 256, "Windows 11", "Красный");
        промежатестация l3 = new промежатестация(3, 32, 512, "Windows 10", "Серый");
        промежатестация l4 = new промежатестация(4, 16, 256, "Windows 11", "Черный");
        System.out.println(l1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
            if(choice == 1){

                System.out.printf("Введите значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram >=32){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
                }else if(ram < 32){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
                }else if(ram < 16){
                    System.out.printf(l1.toString() + "\n" + l2.toString());
                }else if(ram < 4){
                    System.out.printf(l1.toString());
                }else System.out.println("Таких ноутбуков нет!");

            }else if(choice == 2){

                System.out.printf("Введите значение SSD: ");
                Integer ssd = sc.nextInt();
                if(ssd >=512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
                }else if(ssd < 512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
                }else if(ssd < 256){
                    System.out.printf(l1.toString() + "\n" + l2.toString());
                }else if(ssd < 128){
                    System.out.printf(l1.toString());
                }else System.out.println("Таких ноутбуков нет!");

            }else if(choice == 3){

                System.out.println("Введите название OS");
                Scanner sc1 = new Scanner(System.in);
                String os = sc1.nextLine();
                if(os.equals("Windows")){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
                }else if(os.equals("Windows 10")){
                    System.out.printf(l1.toString() + "\n" + l3.toString());
                }else if(os.equals("Windows 11")){
                    System.out.printf(l2.toString() + "\n" + l4.toString());
                }else System.out.println("Таких ноутбуков нет!");
                sc1.close();
                }
                
            sc.close();
            }
        
        }

