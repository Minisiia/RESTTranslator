## RESTTranslator
Implement your first simple REST word translation services. The service knows about 20 words in English. You enter a word in Ukrainian, and the service gives an answer in English.

## 6. Web service. 4. rest & soap

## Задание 4

Реализуйте свои первые простые RESTfull сервисы для перевода слов. Сервис знает около 20 слов на английском языке. Вы вводите слово на украинском, а сервис дает ответ на английском.

## Заметки

### Строка запроса

http://localhost:8080/RESTTranslator/rest/translator?ukrainian_word=привіт

### Особенности

1. hibernate.properties, а не hibernate.cfg.xml
2. в HibernateUtil.java

   ```
factory = new Configuration()
          .addAnnotatedClass(Translations.class)
          .buildSessionFactory();
   ```
