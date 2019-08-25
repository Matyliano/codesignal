package islandOfKnowledge;

public class AreEquallyStrong {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        return ((Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight))
                && (Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight)));

}

    public static void main(String[] args) {
        AreEquallyStrong a = new AreEquallyStrong();
        System.out.println(a.areEquallyStrong(10,15,5,20));
    }
}