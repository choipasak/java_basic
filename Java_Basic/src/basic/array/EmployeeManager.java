package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");            
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt();

			if(menu == 1) {

				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)


				boolean flag = false;// 이것도 안으로 넣어줘야함, 그래야 사번이 틀렸을때 다시 플래그가 false가 되니까
				outer : while(true) {
					for(int i=0; i<= count; i++) {
						// for문 말고 forEach문으로 하는게 맞았음
						// 'forEach + flag'형태가 배열의 무한중복체크 의 형태인듯
						System.out.print("등록할 사번을 입력해주세요: ");
						String userNum = sc.next();
						if(userNum.equals(userNums[i])) {
							System.out.println("중복된 사번입니다. 다시 입력해주세요.");
							flag = true;
							break; //원래는 continue outer
						}else {
							flag = false;
							if(!flag) {
								for(int j=count; j<=count; j++) { // 이렇게 조건for문 하지말고 그냥 
									userNums[j] = userNum; // userNum[count] = userNum; 하면된다.
									break outer;
								}
							}
						}
					}
				}

				System.out.print("등록할 이름을 입력해 주세요: ");
				/*
				String name = sc.next();
				names[count] = name;
				 */
				names[count] = sc.next();

				System.out.print("등록할 나이를 입력해 주세요: ");
				ages[count] = sc.nextInt();

				System.out.print("등록할 부서명을 입력해 주세요: ");
				departments[count] = sc.next();

				// 친절하게 안내말 올려주기!
				System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");

				count++;
				// 다음 사람은 다음 인덱스에 저장하기 위해 미리 조치.

			}else if(menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					break;
				}else { 
					// QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ
					System.out.println("사번> ");
					for(String un : userNums) {
						if(un == null) break;

						System.out.print(un + " ");
					}
					System.out.println("\n이름> ");
					for(String n : names) {
						if(n == null) break;

						System.out.println(n + " ");
					}
					System.out.println("\n나이> ");
					for(int a : ages) {
						if(a == 0) break;

						System.out.println(a + " ");
					}
					System.out.println("\n부서명> ");
					for(String dp : departments) {
						if(dp == null) break;

						System.out.println(dp + " ");
					} //이렇게 다 for문으로 하지말고 printf를 통해서 한명씩 가로로 한줄씩 출력하는 방법도 있다!
				}//else end

			}else if(menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				//인덱스 번호를 받으라는 소리
				System.out.print("사번을 입력하세요 : ");
				String userNum = sc.next();

				for(int i=0; i<count; i++)	{ //몇번째 인덱스인지 알아야하기때문에 조건식이 있는 for문을 사용하는 것이 좋음.
					// QQQQQQQQQQQQQQQQQQQQQQQQQ
					if(userNum.equals(userNums[i])) {
						System.out.println("=========================");
						System.out.println("사번 : " + userNums[i]);
						System.out.println("이름 : " + names[i]);
						System.out.println("나이 : " + ages[i]);
						System.out.println("부서명 : " + departments[i]);
						System.out.println("=========================");
						break;
					}
					if(i == count-1 || count == 0){ // 이것도 flag를 통해 작성해줄수잇음 그러면 저렇게 if에 조건을 넣지 않아도된다.
						System.out.println("조회하신 사원의 정보가 없습니다.");
					}
				}



			}else if(menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				//받은 값이랑 기존거와 교체를 해주면댐. 여기서 새로운 값을 받?
				System.out.println("조회를 원하는 사번을 입력해 주세요: ");
				String userNum	= sc.next();

				outer : for(int i=0; i<count; i++) {
					if(userNum.equals(userNums[i])) {

						System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]\n> ");
						// 만약 여기서 계속 다시 수정하고 싶게 하고싶다면 while(true)를 열어서 취소를 누르기전까지 계속 반복하게 설계
						// 근데 대부분 둘 다 수정 바로바로할 수 있게 while(true)로 가능하게 만들어준다.
						int num = sc.nextInt();

						//switch-case문으로 해줘도 된다. 명확한 값이 있으니까!
						if(num == 1) { // case 1:
							System.out.println("변경하려는 나이를 입력해 주세요\n> ");
							int age = sc.nextInt();
							for(int j=i; j<=i; j++) { //이런 말도안되는 조건으로 안해줘도된다.
								ages[j] = age; // 그냥 위에서 내려온 i값그대로 사용해도 됌
								break outer;
							}

						}else if(num == 2) { // case 2:
							System.out.println("변경하려는 부서명을 입력해 주세요\n> ");
							String department = sc.next();
							for(int j=i; j<=i; j++) { //이정도면 for문 못써서 죽은듯
								departments[j] = department;
								break outer;
							}
						}else { // case 3:
							break;
						}// default로 다른 번호 선택했을때를 만들어줘도 좋을듯!
					}else { //이런걸 flag로 처리해주는듯. 이런거를 미리써줘도 된다. 그게 덜 헷갈림. 그대신 flag의 값이 흐름에 어떤값인지를 조심
						System.out.println("조회하신 사번은 존재하지 않습니다.");
					}
				}

			}else if(menu == 5) {
				//사번을 입력받아서 존재한다면
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				System.out.println("사번을 입력하세요: ");
				String userNum = sc.next();

				//여기서도 flag를 써주면 좋았을듯 :탐색했을때 true해줄꺼임
				outer : for(int i=0; i<count; i++) {
					outer1 : if(userNum.equals(userNums[i])) {
						//또 for문을 주는게아니라 1. 여기서 바로 질문, 입력받기
						// 그리고 if문 or switch문 아무거나로 진행
						// 기준은 answer
						
						for(int j=i; j<=count-1; j++) { // 어 이거사용하는거 맞는데? 뒤의 값을 앞으로 밀기위한 장치
							System.out.println("정말 삭제하시겠습니까? [Y/N]");
							String answer = sc.next();
							
							if(answer.equals("Y") || answer.equals("y")) { // switch로도가능. 
								// case로 하면 다중case작성이 가능하기 때문에 ||보단 쉽게 작성 가능.
								
								//뒤의 값을 앞으로 1칸씩 밀어줌.
								// 여기에서 i=99일때, 대입되는 i가 100이 되기 때문에
								// else로 빼서 따로 조건을 달아야함.
								// 처음 if는 
								userNums[i] = userNums[i+1];
								names[i] = names[i+1];
								ages[i] = ages[i+1];
								departments[i] = departments[i+1];
								
								//근데 만약 바꿔야 할 값이 마지막인덱스면? 뒤에서 땡겨올 값이 없는데 어캄
								// 이게 예외 상황이된다.
								// 그래서 if문으로 따로 작성해줘야함 (조건 : 혹시 i가 배열길이-1 이냐?)
								// 마지막 인덱스는 개발자가 직접 내용을 넣어줘야함
								// 데이터 타입에 맞는 빈칸값을 다 직접 입력해줘야함(초기화)
								// 중요!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@
								// 이게 예외처리!
								
								break outer1;
							}else {
								break outer;
							}
						}

					}
					// 여기 밑에는 필요가 없는데????머임
					// QQQQQQQQQQQQQQQQQQQQQQQQQQ
					int[] temp = new int[ages.length];
					String[] temp1 = new String[userNums.length];
					String[] temp2 = new String[names.length];
					String[] temp3 = new String[departments.length];
					for(int k=i; k<temp.length; k++) {
						temp1[k] = userNums[k];
						temp2[k] = names[k];
						temp[k] = ages[k];
						temp3[k] = departments[k];
					}
					userNums = temp1;
					names = temp2;
					ages = temp;
					departments = temp3;
					temp1 = null;
					temp2 = null;
					temp3 = null;
					Arrays.fill(temp, 0);
					System.out.println("삭제가 완료되었습니다!");
					break;
				}

				count--;
			}else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while(true)의 브레이크
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}// end while(true)
	}// main
}













