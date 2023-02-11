package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {


    // 미사용시 close projection -> 정확하게 매칭
//    @Value("#{target.username + ' ' + target.age}") // open projection 전체 조회
    String getUsername();
}
