public class nodeTugas2 {
    int id;
    String judulFilm;
    double rating;

    nodeTugas2 prev, next;

    nodeTugas2(nodeTugas2 prev, int id, String judulFilm, double rating, nodeTugas2 next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}
