
public class CameraTypeState implements PhoneCameraState {
	
	@Override
	public void preparePhoneCamera(CameraContext c) {
		System.out.println("Camera Types - Smart Series: Samsung, Iphone, OnePlus");
		c.setPhoneCameraState(this);
		
	}

	public String toString()
	{
		return "Camera Types State\n";
	}


}
