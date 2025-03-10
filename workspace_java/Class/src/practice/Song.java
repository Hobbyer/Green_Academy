package practice;

import java.util.Arrays;

public class Song {
  String title, artist, album, year;
  String[] composer;

  public void setSongInfo(String a, String b, String c, String d, String[] e){
    title = a;
    artist = b;
    album = c;
    year = d;
    composer = e;
  }

  public void printSongInfo(){
    System.out.println("노래 제목 : " + title);
    System.out.println("가수 : " + artist);
    System.out.println("앨범 제목 : " + album);
    System.out.println("발매 연도 : " + year);
    System.out.println("작곡가 : " + Arrays.toString(composer));
  }
}
