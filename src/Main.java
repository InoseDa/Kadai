import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie(1,"鬼滅の刃 無限列車編", "外崎春雄", "日本", 2020);
        Movie movie2 = new Movie(2,"千と千尋の神隠し", "宮崎駿", "日本", 2001);
        Movie movie3 = new Movie(3,"タイタニック", "ジェームズ・キャメロン", "アメリカ", 1997);

        Movie[] movies = {movie1,movie2,movie3};

        List<Movie> movieList = new ArrayList<>();

        for (Movie cnt1 : movies){
            movieList.add(cnt1);
        }

        for (Movie cnt2 : movieList){
            cnt2.sayDetail();
        }
    }
}




