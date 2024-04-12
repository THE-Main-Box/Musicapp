package br.com.alura.audioapp.mediamodels;

public class Podcast extends Audio {

    private String about;

    public Podcast(String name, double durationInHours, String about) {
        super(name, durationInHours);
        this.about = about;
    }

    @Override
    public void showDetailsAbout() {
        this.publicOpinion(false);

        System.out.println(String.format("""
                        Assunto:    %s
                        Nome:       %s
                        Duração:    %.2fH
                        Likes:      %d
                        Tocadas:    %d
                                        
                        //~//~//~//~////
                        """,
                this.about,
                this.name,
                this.durationInHours,
                this.likes,
                this.totalPlays
        ));
    }


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
