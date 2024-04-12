package br.com.alura.audioapp.mediamodels;

public class Audio implements Likeble {

    protected String name;
    protected int likes, durationInMinutes, totalPlays;
    protected double classification, durationInHours;
    protected boolean played, canLike;

    public Audio(String name, int durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.played = false;
        this.setDurationInHours();
        this.canLike = true;
    }

    public Audio(String name, double durationInHours) {
        this.name = name;
        this.durationInHours = durationInHours;
        this.played = false;
        this.canLike = true;
    }

    public void play() {
//...play audio code
        this.totalPlays++;
        this.played = true;
    }

    public void showDetailsAbout() {
        System.out.println(String.format("""
                        Nome:       %s
                        Duração:    %dmin
                        Likes:      %d
                        Tocadas:    %d
                                        
                        //~//~//~//~////
                        """,
                this.name,
                this.durationInMinutes,
                this.likes,
                this.totalPlays
        ));
    }

    public void rate() {
        if (totalPlays == 0) {
            this.classification = 0.0;
        } else {
            this.classification = (double) this.likes / this.totalPlays * 100;
        }
    }

    public void publicOpinion(boolean includeName) {
        this.rate();

        String message = "As pessoas estão gostando! ";
        String secondMessage = "Vale a pena tentar";

        if (includeName) {
            message += this.name;
            secondMessage += this.name;
        }

        if (this.classification > 50.0) {
            System.out.println(message);
        } else {
            System.out.println(secondMessage);
        }
    }

    @Override
    public void like() {
        if (!played) {
            System.out.println("Assista antes de curtir: " + this.name);
            return;
        } else if (this.canLike) {
            this.likes++;
            this.canLike = false;
        }
    }

    @Override
    public void unLike() {
        if (this.likes < 0) {
            likes = 0;
        } else {
            this.likes--;
            this.canLike = true;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    @Override
    public boolean isLiked() {
        if(!canLike) {
            return true;
        } else {
            return false;
        }
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    protected void setDurationInHours() {
        this.durationInHours = this.durationInMinutes / 60;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }


    public int getTotalPlays() {
        return totalPlays;
    }

}
