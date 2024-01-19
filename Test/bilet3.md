# Билет 3

## 1) PHP особенности синтаксиса, использование в веб-приложениях



PHP - это объектно-ориентированный скриптовый язык. Интерпретатор выполняет код, находящийся внутри блока `<?php ?>`

Имена переменных начинаются с символа “$”, а инструкции разделяются символом “;”, а из-за того, что PHP - язык с динамической типизацией, при объявлении тип не указывается:
>$a = “Hello”;
><br>$b = “World”;
><br>$c = $a + “ ” + $b;

6 скалярных (integer, float, double, boolean, string и NULL, диапазон зависит от платформы), 3 нескалярных (ресурс, массив и объект) и 4 псевдотипа (mixed, number, callback и void)

Суперглобальные массивы - предопределенные массивы, доступные отовсюду:
- $_GLOBALS - все глобальные переменные
- $_SERVER - параметры, получаемые при запуске от ОС
- $_ENV - переменные среды ОС
- $_GET, $_POST — параметры GET- и POST-запроса
- $_FILES — сведения об отправленных методом POST файлах.
- $_COOKIE - куки
- $_REQUEST - состоит из элементов $_GET, $POST, $COOKIE и $_FILES

Поддержка ООП 
- реализованы основные механизмы ООП: инкапсуляция, полиморфизм и наследование
- private (только внутри класса), public (по дефолту) и protected (в наследниках) поля
- final и abstract методы
- есть трейты, но нет множественного наследования
- объекты передаются по ссылке


## 2) Long Polling и Websockets зачем нужны, сходства и различия
##### Есть самый простой способ получения данных от сервера - запрос всех накопившихся данных с некоторым промежутком времени между запросами. Из минусов можно во-первых выделить постоянную атаку сервера этими запросами и во-вторых, если даже это компенсировать низкой частотой запросов, сама частота запросов - мы получаем данные не сразу.

#### Long Polling же подразумевает создание соединения и отправку по нему запроса от клиента, который сервер придержит до появления новых данных (или окончания таймаута), а затем оформит ответ и отправит по этому соединению. Решаются обе эти проблемы, хоть и появляются накладные расходы на создание и поддержку соединения.

#### WebSocket, в отличие от Long Polling, имеет полнодуплексное соединение (по нему может отправлять запрос не только сервер, но и клиент), также оно имеет одно это соединение на множество запросов, в то время как Long Polling открывает и закрывает соединение на каждый новый запрос

## 3) Написать JSP страницу, которая выводит количество пользователей, которые отправляли запросы, за последние 60 секунд

~~~
<%@ page import="java.util.*, javax.servlet.http.*" %>
<%!
// Класс для хранения информации о пользователе и времени его последнего запроса
class UserSession {
String sessionId;
long lastRequestTime;

        public UserSession(String sessionId, long lastRequestTime) {
            this.sessionId = sessionId;
            this.lastRequestTime = lastRequestTime;
        }
    }

    // Метод для подсчета пользователей, сделавших запросы за последние 60 секунд
    private int countRecentUsers(List<UserSession> userSessions) {
        long currentTime = System.currentTimeMillis();
        int count = 0;

        for(UserSession userSession : userSessions) {
            if(currentTime - userSession.lastRequestTime <= 60000) { // 60 секунд в миллисекундах
                count++;
            }
        }
        return count;
    }
%>
<%
// Список для хранения сессий пользователей
// В реальном приложении это должно быть глобальным хранилищем
    List<UserSession> userSessions = (List<UserSession>) application.getAttribute("userSessions");
    if(userSessions == null) {
    userSessions = new ArrayList<UserSession>();
    application.setAttribute("userSessions", userSessions);
    }

    // Получение текущей сессии пользователя
    HttpSession session = request.getSession(true);
    String sessionId = session.getId();
    long currentTime = System.currentTimeMillis();

    // Обновление или добавление информации о пользователе
    boolean sessionExists = false;
    for(UserSession userSession : userSessions) {
        if(userSession.sessionId.equals(sessionId)) {
            userSession.lastRequestTime = currentTime;
            sessionExists = true;
            break;
        }
    }

    if(!sessionExists) {
        userSessions.add(new UserSession(sessionId, currentTime));
    }

    // Подсчет пользователей, сделавших запросы за последние 60 секунд
    int recentUserCount = countRecentUsers(userSessions);
%>

<html>
<body>
    <h2>Количество пользователей, отправивших запросы за последние 60 секунд: <%= recentUserCount %></h2>
</body>
</html>
~~~
Этот код делает следующее:
    Определяет класс `UserSession` для хранения информации о сессиях пользователей.
    Содержит метод `countRecentUsers` для подсчета пользователей, активных в последние `60` секунд.
    В блоке кода JSP обновляет или добавляет информацию о сессии текущего пользователя в глобальный список userSessions.
    Выводит количество пользователей, которые были активны в последние 60 секунд.