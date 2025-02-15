
# Билет 2
___
<div>

[//]: # (Fast-CGI &#40;Fast Common Gateway Interface&#41; – это протокол, предназначенный для улучшения взаимодействия веб-серверов и скриптов, обычно используемых для создания динамического контента на веб-сайтах. Он представляет собой усовершенствованную версию CGI &#40;Common Gateway Interface&#41;.)

[//]: # (Что это такое?)

[//]: # ()
[//]: # (CGI позволяет веб-серверу передавать запросы пользовательскому скрипту, обрабатывать их и возвращать результат. Однако в традиционном CGI для каждого запроса создается новый процесс, что может быть неэффективно и затратно по ресурсам. Fast-CGI решает эту проблему, позволяя скрипту оставаться в памяти и обрабатывать множество запросов, что значительно повышает производительность.)

[//]: # (Зачем это нужно?)

[//]: # ()
[//]: # (    Производительность: Fast-CGI сокращает время и ресурсы, необходимые для создания нового процесса для каждого запроса.)

[//]: # (    Эффективность: Скрипты могут оставаться загруженными в памяти, что ускоряет их выполнение.)

[//]: # (    Масштабируемость: Fast-CGI лучше подходит для сайтов с высокой нагрузкой, так как может обрабатывать большое количество запросов более эффективно.)

[//]: # ()
[//]: # (Как пользоваться?)

[//]: # ()
[//]: # (    Установка и настройка: Сначала необходимо установить Fast-CGI на сервере. Это может включать установку специального модуля для веб-сервера &#40;например, mod_fastcgi для Apache&#41;.)

[//]: # ()
[//]: # (    Конфигурация веб-сервера: Вам нужно настроить веб-сервер для работы с Fast-CGI. Это включает в себя указание, какие скрипты должны обрабатываться через Fast-CGI и настройку путей.)

[//]: # (Давайте рассмотрим пример интеграции Fast-CGI скрипта с веб-сервером Apache на примере PHP-скрипта.)

[//]: # (Предварительные условия:)

[//]: # ()
[//]: # (    Установленный веб-сервер Apache.)

[//]: # (    Установленный PHP с поддержкой FastCGI &#40;обычно включен по умолчанию в современных версиях PHP&#41;.)

[//]: # ()
[//]: # (Шаги:)

[//]: # ()
[//]: # (    Установка модуля FastCGI для Apache:)

[//]: # (    В зависимости от вашей операционной системы, это может быть выполнено через пакетный менеджер. Например, на Debian-подобных системах это может быть командой:)

[//]: # ()
[//]: # (    sudo apt-get install libapache2-mod-fcgid)

[//]: # ()
[//]: # (Активация модуля:)

[//]: # (После установки активируйте модуль с помощью команды:)

[//]: # ()
[//]: # (>sudo a2enmod fcgid)

[//]: # ()
[//]: # (Настройка Apache:)

[//]: # (Откройте файл конфигурации Apache &#40;например, /etc/apache2/sites-available/000-default.conf&#41; и добавьте следующие строки для включения обработки PHP через FastCGI:)

[//]: # ()
[//]: # (apache)

[//]: # (~~~ )

[//]: # (<IfModule mod_fcgid.c>)

[//]: # (   AddHandler fcgid-script .php)

[//]: # (   FCGIWrapper /usr/lib/cgi-bin/php .php)

[//]: # (   Options +ExecCGI)

[//]: # (   DirectoryIndex index.php)

[//]: # (</IfModule>)

[//]: # (~~~)

[//]: # ()
[//]: # (Это указывает Apache обрабатывать файлы .php с помощью FastCGI.)

[//]: # ()
[//]: # (Перезапуск Apache:)

[//]: # (После внесения изменений перезапустите Apache, чтобы применить настройки:)

[//]: # ()
[//]: # (>sudo systemctl restart apache2)

[//]: # ()
[//]: # (Создание PHP-скрипта:)

[//]: # (Создайте PHP-скрипт в директории, доступной через веб-сервер. Например, создайте файл test.php в корневой директории веб-сервера &#40;/var/www/html/&#41;:)

[//]: # ()
[//]: # (php)

[//]: # ()
[//]: # (    <?php)

[//]: # (    echo "Hello, FastCGI World!";)

[//]: # (    ?>)

[//]: # ()
[//]: # (    Тестирование:)

[//]: # (    Откройте браузер и перейдите к созданному скрипту, например, http://your_server_ip/test.php. Вы должны увидеть вывод скрипта: "Hello, FastCGI World!".)

[//]: # ()
[//]: # (Этот пример иллюстрирует базовую настройку FastCGI для PHP-скриптов на сервере Apache. Конфигурация может варьироваться в зависимости от конкретной среды и требований.)
</div>

<div>

 ###  2) Что такое FreeMarker template engine, механизм работы и особенности.


FreeMarker - шаблонизатор на Java для генерации текстового содержимого, в основном HTML, через заданные шаблоны и данные. Основная цель - разделение логики приложения и представления, что улучшает структурированность в веб-разработке.
### Механизм работы:
- **Подготовка данных**: Сначала данные для шаблона подготавливаются (например, строки, числа, списки, карты).
- **Создание шаблона**: Шаблон создается с использованием специального синтаксиса FreeMarker (файлы с расширением .ftl), который позволяет вставлять данные и управлять их отображением. 
- **Обработка шаблона**: Движок FreeMarker заменяет плейсхолдеры в шаблоне соответствующими данными при выполнении программы.
- **Вывод**: Результатом является сгенерированный текст (например, HTML-код), который можно использовать в приложении.

#### Пример использования:

Шаблон (example.ftl):
~~~
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to FreeMarker</title>
</head>
<body>
    <h1>Hello, ${user}!</h1>
    <p>Here is a list of your tasks:</p>
    <ul>
        <#list tasks as task>
            <li>${task.name} - <i>${task.status}</i></li>
        </#list>
    </ul>
</body>
</html>
~~~

Java-код:
~~~
Map<String, Object> dataModel = new HashMap<>();
dataModel.put("user", "Alice");
List<Task> tasks = new ArrayList<>();
tasks.add(new Task("Buy groceries", "pending"));
tasks.add(new Task("Read a book", "completed"));
dataModel.put("tasks", tasks);

// Здесь происходит обработка шаблона с использованием FreeMarker
~~~

Результат (HTML):
~~~
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to FreeMarker</title>
</head>
<body>
    <h1>Hello, Alice!</h1>
    <p>Here is a list of your tasks:</p>
    <ul>
        <li>Buy groceries - <i>pending</i></li>
        <li>Read a book - <i>completed</i></li>
    </ul>
</body>
</html>
~~~
В этом примере пользователь и список задач передаются из Java-кода в шаблон FreeMarker, который затем генерирует соответствующий HTML-код.
</div>



<div>

### 3) Написать фрагмент кода html и стили css, которые блокируют определенный контент при ширине экрана < 1024 пикселей.

~~~
<div class="content">
</div>
    @media only screen and(max-width: 1023px){
        .content{display:none;}
    }
~~~

</div>




