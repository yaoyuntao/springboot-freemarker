<!DOCTYPE html>

<html lang="en">

<body>
City List<br>
<#list cityList as city>
City: ${city.cityName}! <br>
Q:Why I like? <br>
A:${city.description}!<br>
${city.provinceId}

</#list>
</body>

</html>