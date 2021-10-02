public class MyCameraState implements PhoneCameraState{
	
	@Override
	public void preparePhoneCamera(CameraContext c) {
		System.out.println("Camera: NOKIA, SAMSUNG, IPHONE, BLACKBERRY");
		c.setPhoneCameraState(this);
		
	}
	
	public String toString()
	{
		return "My Camera State\n";
	}



}
