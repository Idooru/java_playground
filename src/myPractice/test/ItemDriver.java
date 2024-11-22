import java.lang.reflect.Array;

abstract class Item {
    Long id;
    String name;
    int price;
    String pan;

    Item(Long id, String name, int price, String pan) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pan = pan;
    }
}

class Album extends Item {
    String artist;

    public Album(Long id, String name, int price, String pan, String artist) {
        super(id, name, price, pan);
        this.artist = artist;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Album{");
        sb.append("artist='").append(artist).append('\'');
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", pan='").append(pan).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Movie extends Item {
    String director;
    String actor;

    public Movie(Long id, String name, int price, String pan, String director, String actor) {
        super(id, name, price, pan);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Movie{");
        sb.append("director='").append(director).append('\'');
        sb.append(", actor='").append(actor).append('\'');
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", pan='").append(pan).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class NoQualifyCondition extends Exception {
    public NoQualifyCondition(String message) {
        super(message);
    }
}

class ItemBuilder {
    Long id;
    String name;
    int price;
    String pan;
    String artist;
    String director;
    String actor;


    public ItemBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ItemBuilder setPan(String pan) {
        this.pan = pan;
        return this;
    }

    public ItemBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public ItemBuilder setDirector(String director) {
        this.director = director;
        return this;
    }

    public ItemBuilder setActor(String actor) {
        this.actor = actor;
        return this;
    }

    public Album generateAlbum() throws NoQualifyCondition {
        if (artist == null) throw new NoQualifyCondition("actist가 설정되지 않음");
        return new Album(id, name, price, pan, artist);
    }

    public Movie generateMovie() throws NoQualifyCondition {
        if (director == null || actor == null) throw new NoQualifyCondition("director 혹은 actor가 설정되지 않음");
        return new Movie(id, name, price, pan, director, actor);
    }
}


public class ItemDriver {
    public static void main(String[] args) throws NoQualifyCondition {
        ItemBuilder itemBuilder = new ItemBuilder();

        Item album = itemBuilder
                .setId(1L)
                .setName("잉 기모링")
                .setPrice(10000)
                .setArtist("shlee")
                .generateAlbum();

        Item movie = itemBuilder
                .setId(2L)
                .setName("잉 기무투")
                .setPrice(30000)
                .setDirector("shlee")
                .setActor("slee")
                .generateMovie();

        System.out.println("album = " + album);
        System.out.println("movie = " + movie);
    }
}
