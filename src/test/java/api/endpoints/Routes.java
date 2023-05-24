package api.endpoints;

/* swagger  url --https://petstore.swagger.io
 create user post -- https://petstore.swagger.io/v2/user
 * Get user  --  https://petstore.swagger.io/v2/user/{username}
 * Update user -- https://petstore.swagger.io/v2/user/{username}
 * Delete user --- https://petstore.swagger.io/v2/user/{username}
 * 
 */
public class Routes {
	
	//maintain url only in this class
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	
	
	//1.USER MODULE
	
	public static String post_url = base_url +"/user";
	public static String get_url = base_url +"/user/{username}";
	public static String update_url = base_url +"/user/{username}";
	public static String delete_url = base_url +"/user/{username}";







	
	
	//STORE MODULE
	//PET MODULE
}
