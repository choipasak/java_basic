package oop.inter.good;

public class Delete implements IUserService {

	@Override
	public void excute() {
		System.out.println("사용자의 아이디를 받아서 DB에서 찾아서 삭제 조치 ...");

	}

}
