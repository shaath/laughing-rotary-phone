package functionalDriven;

import java.io.IOException;

import commonUtils.BusinessMethods;

public class UserRegTc {

	public static void main(String[] args) throws InterruptedException, IOException {

		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgUserReg("Vinay SP", "AAAVinaySP851467", "Test@5432167890");
		System.out.println("User Registration "+res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.orgClose();
		System.out.println("Application closed Successfully");

	}

}
