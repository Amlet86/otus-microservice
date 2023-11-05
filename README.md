Создать минимальный сервис, который:

- отвечает на порту 8000
- имеет http-метод:  
  GET /health/  
  RESPONSE: {"status": "OK"}

Cобрать локально образ приложения в докер контенер под архитектуру AMD64. Запушить образ в dockerhub

Собрать образ

    docker build -t amlet/spring-boot-app:healthcheck .

Отправить образ в dockerhub

    docker push amlet/spring-boot-app:healthcheck

Выкачать образ с dockerhub

    docker pull amlet/spring-boot-app:healthcheck

Запустить контейнер

    docker run -p 8000:8000 --name healthcheck amlet/spring-boot-app:healthcheck

Проверить приложение

    http://localhost:8000/health
