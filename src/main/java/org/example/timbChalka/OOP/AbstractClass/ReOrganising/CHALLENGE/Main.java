package org.example.timbChalka.OOP.AbstractClass.ReOrganising.CHALLENGE;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("StormBringer","Deep purple");
        album.addSong("Storm Bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.2);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Solder of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 3.25);
        album.addSong("I put the finger on you", 5.44);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowball", 4.51);
        album.addSong("Evil walk", 3.45);
        album.addSong("C . O . D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new Vector<Song>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holy man",playList);
        albums.get(0).addToPlayList("Speed king",playList); //Dose not exist.
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList); //Does not exist.

        play(playList);


    }
    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No song on playlist");
            return;
        }
        else {
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        else forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }
                    else {
                        System.out.println("You have reached the end of the play-list");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying "+ listIterator.previous().toString());
                            forward = false;
                        }
                        else System.out.println("We are at the start of the list");
                    }
                    else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying :"+ listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We have the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next());
                        }
                        else if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available action : \n press");
        System.out.println("0 - to quit\n"+
                        "1 - to play next song\n"+
                        "2 - to play previous song\n"+
                        "3 - to replay current song\n"+
                        "4 - list songs in the play list\n"+
                        "5 - print available actions\n"+
                        "6 - delete current song from play list");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==============================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================================");
    }
}
