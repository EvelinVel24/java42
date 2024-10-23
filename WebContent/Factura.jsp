<html>
<head>
    <title>Factura</title>
</head>
<body>
    <h2>Resumen de Facturación</h2>
    <p>Nombre: ${nombre}</p>
    <p>Empresa: ${empresa}</p>
    <p>Ciudad: ${ciudad}</p>
    <p>País: ${pais}</p>

    <h3>Detalle de Compra</h3>
    <table border="1">
        <tr>
            <th>Producto</th>
            <th>Cantidad</th>
            <th>Precio</th>
        </tr>
        <tr>
            <td>Producto A</td>
            <td>${cantidad1}</td>
            <td>50</td>
        </tr>
        <tr>
            <td>Producto B</td>
            <td>${cantidad2}</td>
            <td>100</td>
        </tr>
        <tr>
            <td colspan="2">Total</td>
            <td>${total}</td>
        </tr>
        <tr>
            <td colspan="2">Descuento 10%</td>
            <td>${discount}</td>
        </tr>
        <tr>
            <td colspan="2">Total con Descuento</td>
            <td>${totalAfterDiscount}</td>
        </tr>
    </table>
</body>
</html>
