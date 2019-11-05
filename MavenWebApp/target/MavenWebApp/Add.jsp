<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add college</title>
</head>
<body>
	<form action="add.do" id="frm" method="post">
		<table>
			<tr>
				<td>Enter Cid:</td>
				<td><input type="text" name="cid" id="cid"></td>
			</tr>
			<tr>
				<td>Enter College Name</td>
				<td><input type="text" name="cname" id="cname"></td>
			</tr>
			<tr>
				<td>Enter course type</td>
				<td><input type="text" name="ctype" id="ctype"></td>
			</tr>
			<tr>
				<td>Enter city</td>
				<td><input type="text" name="city" id="city"></td>
			</tr>
			<tr>
				<td>Enter fees</td>
				<td><input type="text" name="fees" id="fees"></td>
			</tr>
			<tr>
				<td>Enter pincode</td>
				<td><input type="text" name="pincode" id="pincode"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" ></td>
			</tr>
		</table>
	</form>
</body>
</html>