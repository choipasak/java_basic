package etc.exception.custom;

public class MainClass {

	public static void main(String[] args) {
		
		LoginUser user = new LoginUser("abc123", "aaa111!");
		
		String result;
		try {
			result = user.loginValidate("abc1233", "aaa111!");
			System.out.println(result);
		} catch (LoginValidateException e) {
			System.out.println(e.getMessage());
			// 객체를 생성하면서 생성자의 매개값으로 전달한 메세지가 나옴.
			//e.printStackTrace(); 그냥 이것만 쳐도 똑같이 입력해놨던 메세지가 나옴
		}

	}

}
