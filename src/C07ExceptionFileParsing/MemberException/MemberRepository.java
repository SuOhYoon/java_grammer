package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();
    //    회원가입
    public void register(Member member){
        memberList.add(member);
    }

    public Optional<Member> findByEmail(String email){
        return memberList.stream().filter(m->m.getEmail().equals(email)).findFirst();
    }
    //    회원상세조회
    public Optional<Member> findById(Long id){
        return memberList.stream().filter(m->m.getId()==id).findFirst();
    }

    //    회원목록조회
    public List<Member> findAll(){
        return memberList;
    }
}