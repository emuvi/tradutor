<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
<form action="<%= request.getContextPath() %>/service" method="post">
    <label for="palavra">Palavra:</label>
    <input type="text" name="palavra" id="palavra">
    <input type="submit" value="Traduzir">
</form>
</body>

</html>