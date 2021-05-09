package learn.mediator;

public class AllLightOnCommand implements Command {
	private Mediator mediator;

	public AllLightOnCommand(Mediator mediator) {

		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.allLightsOn();
	}

}
