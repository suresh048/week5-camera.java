
public class CameraTestDemo {
	
	public static void main(String[] args) {
		CameraContext c=new CameraContext();
		CameraTypeState type=new CameraTypeState();
		type.preparePhoneCamera(c);
		System.out.println(c.getPhoneCameraState().toString());
	
		MyCameraState cds=new MyCameraState();
		cds.preparePhoneCamera(c);
		System.out.println(c.getPhoneCameraState().toString());
		
		CameraCostType cost=new CameraCostType();
		cost.preparePhoneCamera(c);
		System.out.println(c.getPhoneCameraState().toString());

	}
}

