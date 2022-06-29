package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPakr = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		Member memberKim = new Member(1004, "김덕배");

		memberArrayList.addmember(memberLee);
		memberArrayList.addmember(memberSon);
		memberArrayList.addmember(memberPakr);
		memberArrayList.addmember(memberHong);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberID());
		memberArrayList.showAllMember();

		memberArrayList.insertMember(memberKim, 2);
		memberArrayList.showAllMember();

	}

}
