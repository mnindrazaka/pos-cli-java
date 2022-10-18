/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Toko;

import java.util.Scanner;

/**
 *
 * @author M. ROM DONI
 */
public class Main {
    public static void menu() {
        System.out.println("Doni Shop\n");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("\t1. Add Transaction");
        System.out.println("\t2. Show Transactions");
        System.out.println("\t3. Close");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Toko tk = new Toko();
        Barang b1 = new Barang("Coca cola", 7500);
        Barang b2 = new Barang("Aqua", 5000);
        Barang b3 = new Barang("Fres Tea", 8000);
        Barang[] br = { b1, b2, b3 };
        tk.setListBarang(br);
        do {
            menu();
            System.out.println("Please input your option: ");
            int pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1 -> {
                    Customer cs = new Customer();
                    Transaksi tr = new Transaksi();
                    tr.setCus(cs);

                    System.out.println("Please input customer name: ");
                    String name = input.nextLine();
                    cs.setName(name);

                    tk.printListBarang();
                    System.out.println("Please input your production option: ");
                    int pilihanBarang = input.nextInt() - 1;
                    input.nextLine();
                    tr.setIndexBarang(pilihanBarang);

                    System.out.println("Input amount: ");
                    int jumlah = input.nextInt();
                    input.nextLine();
                    tr.setJumlah(jumlah);
                    tk.addListTransaksi(tr);
                    tk.setTotal();
                    System.out.println("Total: " + tr.getTotal());
                    System.out.println("Input price: ");
                    int uang = input.nextInt();
                    input.nextLine();
                    tr.setBayar(uang);
                    System.out.println("Change: " + tr.getKembalian());
                }
                case 2 -> tk.prinListTransaksi();
                case 3 -> {
                    System.out.println("Thanks for coming to Doni Shop");
                    System.exit(0);
                }
                default -> {
                }
            }
        } while (true);

    }

}
