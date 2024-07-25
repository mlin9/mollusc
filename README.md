# Mollusc
### JPA Springboot + PostgreSQL + Docker example

1. Compile and run the PostgreSQL Docker container `docker compose up`

2. Compile and run the JPA Springboot service with `./gradlew build` and `./gradlew bootRun`

Test the connection with POST and GET cURLs:
```shell
curl -s -X POST http://localhost:8080/products -H "Content-Type: application/json" -d '{"name": "foo", "price": 1.234 }'
curl http://localhost:8080/all
```

Exit the PostgreSQL container with `docker compose down`