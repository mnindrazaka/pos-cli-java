package Toko;

public class Transaksi {
    private Customer cus;
    private int indexBarang;
    private int jumlah;
    private int total;
    private int bayar;
    private int kembalian;

    public int getIndexBarang() {
        return indexBarang;
    }

    public void setIndexBarang(int indexBarang) {
        this.indexBarang = indexBarang;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
        setKembalian();
    }

    public void setKembalian() {
        kembalian = bayar - total;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setNameCus(String name) {
        cus.setName(name);
    }
}
