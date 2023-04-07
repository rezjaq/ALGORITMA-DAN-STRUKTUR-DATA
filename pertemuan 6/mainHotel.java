public class mainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        hotel h1 = new hotel("oyo kebangsaan", "malang", 200000, 5);
        hotel h2 = new hotel("oyo harapan", "malang", 250000, 5);
        hotel h3 = new hotel("oyo china", "malang", 235000, 4);
        hotel h4 = new hotel("oyo italia", "malang", 240000, 2);
        hotel h5 = new hotel("oyo german", "malang", 150000, 1);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("data hotel sebelum sorting = ");
        list.tampil();

        System.out.println("data hotel setelah sorting desc bedasarkan ipk");
        list.bubleShort();
        list.tampil();

        System.out.println("data hotel setelah sorting asc bedasarkan ipk");
        list.bubbleSortAscending();
        list.tampil();

        System.out.println("data hotel setelah soritng asc berdasarkan ipk");
        list.selectionShort();
        list.tampil();

        System.out.println("data hotel setelah soritng desc berdasarkan ipk");
        list.selectionSortDiscending();
        list.tampil();
    }
}
