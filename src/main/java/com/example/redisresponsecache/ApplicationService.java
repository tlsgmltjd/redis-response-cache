package com.example.redisresponsecache;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    @CachePut(cacheNames = "application", key = "#result.id")
    @Transactional
    public Application create(String field) {
        return applicationRepository.save(Application.builder()
                .veryImportantField1(field)
                .veryImportantField2("행복은 선택")
                .veryImportantField3("포기하지 마")
                .veryImportantField4("사랑은 나눔")
                .veryImportantField5("성공은 준비")
                .veryImportantField6("긍정의 힘")
                .veryImportantField7("도전은 기회")
                .veryImportantField8("미래는 오늘")
                .veryImportantField9("변화는 기회")
                .veryImportantField10("지혜는 힘")
                .veryImportantField11("평화는 가능")
                .veryImportantField12("꿈을 꿔라")
                .veryImportantField13("성장은 경험")
                .veryImportantField14("행복을 찾아")
                .veryImportantField15("용기를 가져")
                .veryImportantField16("미소는 약")
                .veryImportantField17("인내는 미덕")
                .veryImportantField18("긍정적 사고")
                .veryImportantField19("희망을 품어")
                .veryImportantField20("사랑은 영원")
                .build());
    }

    @CachePut(cacheNames = "application", key = "#id")
    @Transactional
    public Application update(Long id, String field) {
        Application application = applicationRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        application.update(field);
        return applicationRepository.save(application);
    }

    @CacheEvict(cacheNames = "application", key = "#id")
    @Transactional
    public Long delete(Long id) {
        applicationRepository.deleteById(id);
        return id;
    }

    @Transactional(readOnly = true)
    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    @Cacheable(cacheNames = "application", key = "#id")
    @Transactional(readOnly = true)
    public Application find(Long id) {
        return applicationRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
