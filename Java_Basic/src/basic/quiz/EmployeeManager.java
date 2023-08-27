package basic.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[5];
		String[] names = new String[5];
		int[] ages = new int[5];
		String[] departments = new String[5];

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


				boolean flag = false;
				outer : while(true) {
					for(int i=0; i<= count; i++) {
						System.out.print("사번을 입력해주세요: ");
						String userNum = sc.next();
						if(userNum.equals(userNums[i])) {
							System.out.println("중복된 사번입니다. 다시 입력해주세요.");
							flag = true;
							continue outer;
						}else {
							flag = false;
							if(!flag) {
								for(int j=count; j<=count; j++) {
									userNums[j] = userNum;
									break outer;
								}
							}
						}
					}
				}


				System.out.print("이름을 입력해 주세요: ");
				String name = sc.next();
				names[count] = name;

				System.out.print("나이를 입력해 주세요: ");
				int age = sc.nextInt();
				ages[count] = age;

				System.out.print("부서명을 입력해 주세요: ");
				String department = sc.next();
				departments[count] = department;

				/*
				System.out.println(Arrays.toString(userNums)
						+Arrays.toString(names)
						+Arrays.toString(ages)
						+Arrays.toString(departments));
				 */
				count++;
			}else if(menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					break;
				}else {
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
					}
				}//else end


				/*
				for(int i=0; i<count; i++) {
					if(count == 0) {
						System.out.println("등록된 사원 정보가 없습니다.");
					}else {
						System.out.println("사번 : " + userNums[i]);
						System.out.println("이름 : " + names[i]);
						System.out.println("나이 : " + ages[i]);
						System.out.println("부서명 : " + departments[i]);
						System.out.println("===================");
					}
				}
				 */
			}else if(menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				//인덱스 번호를 받으라는 소리
				System.out.print("사번을 입력하세요 : ");
				String userNum = sc.next();

				for(int i=0; i<=count; i++)	{
					if(userNum.equals(userNums[i])) {
						System.out.println("=========================");
						System.out.println("사번 : " + userNums[i]);
						System.out.println("이름 : " + names[i]);
						System.out.println("나이 : " + ages[i]);
						System.out.println("부서명 : " + departments[i]);
						System.out.println("=========================");
						break;
					}
					if(i == count-1 || count == 0){
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
						int num = sc.nextInt();

						int[] temp1 = new int[100];
						String[] temp2 = new String[100];

						if(num == 1) {
							System.out.println("변경하려는 나이를 입력해 주세요\n> ");
							int age = sc.nextInt();
							for(int j=i; j<=i; j++) {
								ages[j] = age;
								break outer;
							}

							/*
							for(int j=i; j<=ages.length-1; j++) {
								ages[j] = ages[j+1];
								break;
							}
							for(int k=0; k<temp1.length; k++) {
								temp1[k] = ages[k];
							}
							ages = temp1;
							Arrays.fill(temp1, 0);
							 */

						}else if(num == 2) {
							System.out.println("변경하려는 부서명을 입력해 주세요\n> ");
							String department = sc.next();
							for(int j=i; j<=i; j++) {
								departments[j] = department;
								break outer;
							}
						}else {
							break;
						}
					}else {
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
				
				outer : for(int i=0; i<count; i++) {
					outer1 : if(userNum.equals(userNums[i])) {
						for(int j=i; j<=count-1; j++) {
							System.out.println("정말 삭제하시겠습니까? [Y/N]");
							String answer = sc.next();
							if(answer.equals("Y") || answer.equals("y")) {
								userNums[i] = userNums[i+1];
								names[i] = names[i+1];
								ages[i] = ages[i+1];
								departments[i] = departments[i+1];
								break outer1;
							}else {
								break outer;
							}
						}
						
					}
					
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













