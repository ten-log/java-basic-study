package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//componentScan을 service와repository가아닌 직접설정
@Configuration
public class SpringConfig {
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
}
