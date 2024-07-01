# Spring EnableSpringDataWebSupport issue reproduce demo

steps:

```shell
./gradlew bootBuildImage
docker run --network=host issue-reproduction
curl http://localhost:8080
```

result: see "Internal Server Error

log:

```
2024-07-01T09:06:31.220Z  WARN 1 --- [nio-8080-exec-1] .c.j.MappingJackson2HttpMessageConverter : Failed to evaluate Jackson serialization for type [class org.springframework.data.domain.PageImpl]: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.data.web.config.SpringDataJacksonConfiguration$PageModule$PageModelConverter': Failed to instantiate [org.springframework.data.web.config.SpringDataJacksonConfiguration$PageModule$PageModelConverter]: No default constructor found
```
