package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        //when
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertEquals(memberA, findMember);
    }
}
