package learn.mediator;

public class AllLightOffCommand implements Command {
	private Mediator mediator;

	public AllLightOffCommand(Mediator mediator) {

		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.allLightsOff();
	}

}
