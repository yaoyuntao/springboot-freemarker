<!DOCTYPE html>

<html lang="en">

<body>
City List<br>
<#list cityview as city>
City: ${city.cityName}! <br>
Q:Why I like? <br>
A:${city.description}!<br>
${city.provinceId}

</#list>
</body>

</html>