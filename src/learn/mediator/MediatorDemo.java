package learn.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
	Mediator mediator=new Mediator();
	
	Light bedroomLight= new Light("Bedroom");
	Light hallLight= new Light("Hall");
	
	mediator.registerLights(bedroomLight);
	mediator.registerLights(hallLight);
	
	Command onmd=new AllLightOnCommand(mediator);
	onmd.execute();

	Command offcmd=new AllLightOffCommand(mediator);
	offcmd.execute();

	
	}

}
