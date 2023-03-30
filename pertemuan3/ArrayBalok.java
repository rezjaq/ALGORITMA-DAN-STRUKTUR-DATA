<<<<<<< HEAD
class ArrayBalok{
    public static void main(String[] args) {
        balok[] b1Array = new balok[3];
        b1Array[0] = new balok(10, 20, 30);
        b1Array[1] = new balok(40, 50, 60);
        b1Array[2] = new balok(70, 80, 90);

        for(int i=0; i<3; i++){
            System.out.println("volume balok ke-"+i+": "+b1Array[i].hitungLuas());
        }
    }
=======
class ArrayBalok{
    public static void main(String[] args) {
        balok[] b1Array = new balok[3];
        b1Array[0] = new balok(10, 20, 30);
        b1Array[1] = new balok(40, 50, 60);
        b1Array[2] = new balok(70, 80, 90);

        for(int i=0; i<3; i++){
            System.out.println("volume balok ke-"+i+": "+b1Array[i].hitungLuas());
        }
    }
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
}