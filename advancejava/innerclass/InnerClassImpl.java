package advancejava.innerclass;

class Songs {
    void displaySong() {
        System.out.println("Currently Playing:- Humble");
    }

    class Genre {
        void displayGenre() {
            System.out.println("Genre of the Song:- Rap");
        }
    }
}

public class InnerClassImpl {
    public static void main(String[] args) {
        Songs user1 = new Songs();
        /*
         * if you want to create an object for inner class, you need to create an object
         * for external class and use . operator to access the inner class. Only then,
         * you can create an object for inner class
         */
        Songs.Genre user1genre = user1.new Genre();
        user1genre.displayGenre();
    }

}
