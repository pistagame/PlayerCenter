package com.pistagame.playercenter;

import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Mono;

public interface UserInfoRepository extends ReactiveElasticsearchRepository<UserInfo, Long> {
    UserInfo findById(long id);
    UserInfo findByName(String name);
}
