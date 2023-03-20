<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div id="header">
    <h2>FreeMarker Spring MVC Hello World</h2>
</div>
<div id="content">
    <fieldset>
        <legend>Add Car</legend>
        <form name="car" action="add" method="post">
            Make : <input type="text" name="make" /><br/>
            Model: <input type="text" name="model" /><br/>
            <input type="submit" value="Save" />
        </form>
    </fieldset>
    <br/>
    <table class="datatable">

        <#assign test = 4>

        <#list carList as car>
            <tr>
                <td>${car_index}</td>
                <td>${car.name}</td>
                <td>${car.type}</td>
                <td>${car.value}</td>
                <td>${test}</td>
            </tr>
        </#list>

        <#if test < 3>
            <p>У нас есть параметр ${test}</p>
            <#elseif test < 5>
                <p>Параметр больше 3</p>
            <#else>
            <p>Параметр больше 5</p>
        </#if>

            <#import "test.ftl" as pTest>

        <@pTest.testP v1="Hello" v2="World"/>

    </table>
</div>
</body>
</html>