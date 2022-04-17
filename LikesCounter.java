public class LikesCounter {
    public static void main(String[] args) {
        int myLikes = likesCounter(10, "i like this", true);
        System.out.println(myLikes);
    }

    public static int likesCounter(int currentLikes, String comment, boolean doILike) {
        if (doILike) {
            currentLikes++;
        }
        return currentLikes;
    }

}
