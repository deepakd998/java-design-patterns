package learn.prototype;

public class Backlog implements Cloneable {
private String title;
private String team;
private String releaseVersion;
private String description;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getReleaseVersion() {
	return releaseVersion;
}
public void setReleaseVersion(String releaseVersion) {
	this.releaseVersion = releaseVersion;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@Override
public Backlog clone() {

	try {
		return (Backlog) super.clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return null;
}




}
