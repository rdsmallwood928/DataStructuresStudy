package time;

import time.Time24;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class FootBallBroadcast {

    public static void main(String[] args) {
        Time24 startGame = new Time24(13, 15);
        Time24 timeOfGame =  new Time24(3,23);
        Time24 startNews = Time24.parseTime("17:00");
        Time24 endGame;
        Time24 timeForInterviews;

        endGame = new Time24(startGame.getHour(), startGame.getMinute());
        int minutesOfGame = timeOfGame.getHour()*60 + timeOfGame.getMinute();
        endGame.addTime(minutesOfGame);
        timeForInterviews = endGame.interval(startNews);

        System.out.println("The game begins at " + startGame);
        System.out.println("The game ends at " + endGame);
        System.out.println("Post game interviews last " + timeForInterviews);

    }
}
