
public class CameraCostType implements PhoneCameraState {
	
	@Override
	public void preparePhoneCamera(CameraContext c) {
		System.out.println("Cost: &20 to $100 per unit depends on model");
		c.setPhoneCameraState(this);
		
	}
	
	public String toString()
	{
		return "Camera Cost State";
	}



}
