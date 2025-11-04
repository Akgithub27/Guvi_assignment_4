package voter;

public class VoterMain {
    public static void main(String[] args) {
        try {
            Voter voter = new Voter(1,"Ramesh",17);
            voter.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
