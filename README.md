Описание:
---
```
Создать сервис, который обращается к сервису курсов валют, и отдает gif в ответ:  

если курс по отношению к рублю за сегодня стал выше вчерашнего,  
то отдаем рандомную отсюда https://giphy.com/search/rich  
если ниже - отсюда https://giphy.com/search/broke  
Ссылки  
REST API курсов валют - https://docs.openexchangerates.org/  
REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide  
Must Have  
Сервис на Spring Boot 2 + Java / Kotlin  
Запросы приходят на HTTP endpoint, туда передается код валюты  
Для взаимодействия с внешними сервисами используется Feign  
Все параметры (валюта по отношению к которой смотрится курс,   
адреса внешних сервисов и т.д.) вынесены в настройки  
На сервис написаны тесты   
(для мока внешних сервисов можно использовать @mockbean или WireMock)   
Для сборки должен использоваться Gradle  
Результатом выполнения должен быть репо на GitHub с инструкцией по запуску  
Nice to Have  
Сборка и запуск Docker контейнера с этим сервисом
```  
Endpoints:
---  
Получить список кодов для валют:
```
    GET /alex/vis/getcodes
```  
Получить гифку  
(пример ответа: https://api.giphy.com/v1/gifs/random?api_key=WXpCt1X1tDwup2N1YRcBqfI38edEvweb&tag=rich):
```
GET /alex/vis/getgif/{Char Code}
```  
Простой html+js доступен по localhost:8080/

Запуск .jar:
---
```
java -jar Gif-Getter-By-Currency-0.0.1.jar
```
Docker:
---
Для создания образа Docker перейти в корневую директорию проекта,  
где лежит фаил Dockerfile:
```  
docker build -t kassiopeya/gif_getter_image:latest .  
```
Запуск:
```
docker run -p 8080:8080 kassiopeya/gif_getter_image:latest
``` 
Или получить образ с DockerHub:
```
docker pull kassiopeya/gif_getter_image:latest 
```
Запуск:
``` 
docker run -p 8080:8080 --name gif_getter kassiopeya/gif_getter_image:latest
```