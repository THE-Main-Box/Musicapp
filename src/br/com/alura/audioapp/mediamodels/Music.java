package br.com.alura.audioapp.mediamodels;

public class Music extends Audio{

    private String creator, album;

    public Music(String name, int duration, String creator, String album) {
        super(name, duration);

        this.album = album;
        this.creator = creator;
    }

    @Override
    public void showDetailsAbout(){
        this.publicOpinion(false);
        System.out.println(String.format("""
                Autor:      %s
                Album       %s""",
                this.creator,
                this.album
        ));
        super.showDetailsAbout();
    }


    public String getCreator() {
        return creator;
    }

    public String getAlbum() {
        return album;
    }

}
