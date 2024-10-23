<html>
<head>
    <title>Ingreso de Valores</title>
</head>
<body>
    <h2>Datos Personales</h2>
    <form action="DatosServlet" method="post">
        Nombre: <input type="text" name="nombre"><br>
        Dirección: <input type="text" name="direccion"><br>
        Empresa: <input type="text" name="empresa"><br>
        Ciudad: <input type="text" name="ciudad"><br>
        País: <input type="text" name="pais"><br>

        <h3>Detalle de productos</h3>
        <table border="1">
            <tr>
                <th>Producto</th>
                <th>Precio Unidad</th>
                <th>Cantidad</th>
            </tr>
            <tr>
                <td>Producto A</td>
                <td>50</td>
                <td><input type="text" name="cantidad1"></td>
            </tr>
            <tr>
                <td>Producto B</td>
                <td>100</td>
                <td><input type="text" name="cantidad2"></td>
            </tr>
        </table>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
