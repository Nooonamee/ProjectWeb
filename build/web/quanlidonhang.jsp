<%-- 
    Document   : quanlidonhang
    Created on : Jun 19, 2022, 5:27:50 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Các đơn hàng</title>
    </head>
    <body>
        <table>
            <%
                List<SanPham> list= (List<SanPham>) request.getAtribute("list");
                for(Student i:list){
            %>
            <tr>
                <td><%= i.getTen() %></td>
                <td><%= i.getDaBan() %></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
