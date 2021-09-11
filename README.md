# mortgage
 
1. микросервис на Spring по подаче заявки на предоставление ипотеки
1.1. с указанием, суммы кредита, срока, объекта  и общей стоимости покупки, данных покупателя (физическое лицо) и продавца (юридическое лицо или физическое лицо). При проектировании модели следуйте принципам ООП 
1.2. При сохранении заявки, реализовать валидацию входных бизнес-данных, в т.ч. сумм, дат исходя из бизнес-смысла. Особая просьба - реализовать проверку контрольной цифры в ИНН продавца квартиры (ИНН может быть только у ЮР лица).
2. Сохранять данные, в h2 или SQLite. Так же необходимо предоставить скрипты  создания таблиц для хранения данных по тестовому заданию. Структура БД должна содержать не менее 2 таблиц
3. Подготовить автотесты для проверки  API.Тесты должны проверять создание заявки(в том числе валидность данных), получение заявки и её состав
4. В README описать состав API сервиса, привести примеры входных данных
5. Дистрибутив оформить
5.1. ИЛИ в виде WAR для разворачивания к контейнере сервлетов (tomkat, jetty)
5.2. ИЛИ в виде JAR  для разворачивания docker-контейнера. Подготовить dockerfile
6. Результаты выложить на GitHub, 
