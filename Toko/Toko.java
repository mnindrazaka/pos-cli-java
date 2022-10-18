package Toko;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M. ROM DONI
 */
public class Toko {
    private Barang[] listBarang;
    private Transaksi[] lisTransaksi;

    public Toko() {
        listBarang = new Barang[1];
        lisTransaksi = new Transaksi[1];
    }

    public void addListTransaksi(Transaksi t) {
        if (lisTransaksi[0] != null) {
            Transaksi[] temp = new Transaksi[lisTransaksi.length + 1];
            for (int i = 0; i < lisTransaksi.length; i++) {
                temp[i] = lisTransaksi[i];
            }
            temp[lisTransaksi.length] = t;
            lisTransaksi = temp;
        } else {
            lisTransaksi[0] = t;
        }
    }

    public void setListBarang(Barang[] listBarang) {
        this.listBarang = listBarang;
    }

    public void setLisTransaksi(Transaksi[] lisTransaksi) {
        this.lisTransaksi = lisTransaksi;
    }

    public void printListBarang() {
        System.out.println("List Barang: ");
        for (int i = 0; i < listBarang.length; i++) {
            System.out.println((i + 1) + ". " + listBarang[i].getNama() + " : Rp" + listBarang[i].getHarga());
        }
    }

    public void tambahTransaksi(Transaksi tr) {

    }

    public void setTotal() {
        int tot = listBarang[lisTransaksi[lisTransaksi.length - 1].getIndexBarang()].getHarga()
                * lisTransaksi[lisTransaksi.length - 1].getJumlah();
        lisTransaksi[lisTransaksi.length - 1].setTotal(tot);
    }

    public void view() {
        System.out.println("Nama\t: " + listBarang[0].getNama());
    }

    public void prinListTransaksi() {
        System.out.println("List transactions");
        for (int i = 0; i < lisTransaksi.length; i++) {
            System.out.println("Transaction: " + (i + 1));
            System.out.println("Customer name: " + lisTransaksi[i].getCus().getName());
            System.out.println("Product name: " + listBarang[lisTransaksi[i].getIndexBarang()].getNama());
            System.out.println("Product price: " + listBarang[lisTransaksi[i].getIndexBarang()].getHarga());
            System.out.println("Amount: " + lisTransaksi[i].getJumlah());
            System.out.println("Total: " + lisTransaksi[i].getTotal());
            System.out.println("Money: " + lisTransaksi[i].getBayar());
            System.out.println("Change: " + lisTransaksi[i].getKembalian());
            System.out.println("=".repeat(30));
        }
    }
}
