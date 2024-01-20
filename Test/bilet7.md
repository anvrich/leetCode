# Билет 7
### 2) JSTL - что это, зачем это, если есть JSP-элементы, основные теги
`JSTL` - расширение JSP, позволяющее решать типовые задачи. В сочетании с EL сокращает объем кода и упрощает форматирование JSP ввиду того, что это - теги синтаксиса xml. 
`Пример:`
```html
<c:set var=”minSalary” scope=”session” value=”${23400*2}
<c:forEach var=”user” items=”${users}”>
<c:if test=”${user.salary > minSalary}”>
<p>Salary: <c:out value=”${user.salary}/></p>
</c:if>
</c:forEach>
```

### 3) Написать структуру HTTP запроса, отправляющего логин и пароль пользователя
```azure
GET https://site.ru/signin?login=Petya%20Vasechkin&password=qwerty123 HTTP/1.1
Host: site.ru
Referer: https://site.ru/signin
Cookie: income=1
```









    
    






   