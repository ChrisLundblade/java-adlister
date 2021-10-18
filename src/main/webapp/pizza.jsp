<%--
  Created by IntelliJ IDEA.
  User: christopherlundblade
  Date: 10/15/21
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
    <form action="/pizza-order" method="POST" name="pizza" id="pizza">
        <label>Crust</label>
        <select name="crust">
            <option>Thin</option>
            <option>Standard</option>
            <option>Stuffed</option>
            <option>Chicago</option>
        </select>
        <br>
        <label>Sauce</label>
        <select name="sauce-type">
            <option>Tomato-Sauce</option>
            <option>Alfredo</option>
            <option>None</option>
        </select>
        <br>
        <label>Size</label>
        <select name="size">
            <option>Small 12"</option>
            <option>Medium 14"</option>
            <option>Large 16"</option>
            <option>X-Large 18"</option>
        </select>
        <br>
        <label>Toppings</label><br>
        <input type="checkbox" id="Pepperoni" name="toppings" value="pepperoni">
        <label for="Pepperoni"> Pepperoni</label><br>
        <input type="checkbox" id="Sausage" name="toppings" value="sausage">
        <label for="Sausage"> Sausage</label><br>
        <input type="checkbox" id="Jalapenos" name="toppings" value="jalapenos">
        <label for="Jalapenos"> Jalapeno</label><br>
        <input type="checkbox" id="Anchovies" name="toppings" value="anchovies">
        <label for="Anchovies"> Anchovies</label><br>
        <input type="checkbox" id="salami" name="toppings" value="salami">
        <label for="salami"> Salami</label><br>
        <br>
        <input name="address" type="text">
        <br>
        <button type="submit">Order</button>
    </form>
</body>
</html>
