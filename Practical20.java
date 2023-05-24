package Practicals;

class VideoTape {
    String title;
    int length;
    boolean available;

    VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    VideoTape() {
        System.out.println("VideoTape created......");
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + Integer.toString(length));
        System.out.print("Status: ");
        if (available)
            System.out.println("Available");
        else
            System.out.println("Not Available");
    }
}

class Movie extends VideoTape {
    float directorRating;

    Movie(String title, int length, boolean available, float directorRating) {
        super(title, length, available);
        this.directorRating = directorRating;
    }

    public void show() {
        super.show();
        System.out.println("Director rating: " + directorRating);
    }
}

class MusicVideo extends VideoTape {
    String category;

    MusicVideo(String title, int length, boolean available, String category) {
        super(title, length, available);
        this.category = category;
    }

    public void show() {
        super.show();
        System.out.println("Artist category: " + category);
    }
}

public class Practical20 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Openheimer", 120, false, 9);
        m1.show();
        MusicVideo mv1 = new MusicVideo("Make you mine!", 3, true, "Romantic");
        mv1.show();
    }
}
