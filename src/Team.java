package src;
public class Team {

    Member member; 
    
    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member myMember = new Member("khara", "khara", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
    }

}

class Member {

    private String name;
    private String type;
    private int level; 
    private int rank; 

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank; 
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getLevel() { return level; }
    public int getRank() { return rank; } 

}

