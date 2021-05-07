package learn.prototype;


public class ProtoTypeTest {
public static void main(String[] args) {
	Backlog backlog= new Backlog();
	backlog.setTitle("cloning feature");
	backlog.setTeam("Team Avengers");
	backlog.setDescription("Team Avengers clone feature");
	backlog.setReleaseVersion("2021.H1");
	
	Backlog backlog2= backlog.clone();
	backlog2.setTitle("new clone feature");
	backlog2.setTeam("Team X");
	System.out.println(backlog2.getTitle());
	System.out.println(backlog2.getTeam());
	System.out.println(backlog.getTeam());
	System.out.println(backlog.getTitle());
}
}
