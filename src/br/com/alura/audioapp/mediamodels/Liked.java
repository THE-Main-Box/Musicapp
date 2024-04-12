package br.com.alura.audioapp.mediamodels;

public class Liked {
    public Liked(Audio... audios){
        for(Audio audio : audios){
            if(audio.isLiked()) {
                System.out.println("A media("+audio.name+") está entre o seus curidos");
            }else{
                return;
            }
        }
    }
}
