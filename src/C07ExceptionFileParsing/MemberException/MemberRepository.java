package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;

// 저장소역할을 하는 계층
// DB에 CRUD를 수행하는 계층
public class MemberRepository {
    static List<Member> memberList = new ArrayList<>();

    Member member = new Member();
    public void register(String name, String email, String password){
        member.setName(name);
        member.setEmail(email);
        member.setPassword(password);
    }
    
    public Member
}
