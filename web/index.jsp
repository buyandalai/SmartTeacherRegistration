<%-- 
    Document   : index
    Created on : Mar 11, 2014, 12:27:41 PM
    Author     : mushabe
--%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teacher Registration</title>
    </head>
    <body>
      
        <form name="" method="post" action="/Smart/DisplayTeacher">   
        <table width="718" border="0">
    <tr>
      <td colspan="3"><div align="center">
        <h2><strong>SMART TEACHER REGISTRATION  STEP 1 OF 3</strong></h2>
      </div></td>
    </tr>
    <tr>
      <td width="278">&nbsp;</td>
      <td width="259">&nbsp;</td>
      <td width="167">&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <input name="fname" type="text" id="textfield" placeholder="First Name">
      </div></td>
      <td>
        <input type="text" name="surname" id="textfield2" placeholder="Surname">
      </td>
      <td>
        <input type="text" name="otherName" id="textfield3" placeholder="Other Name">
      </td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Choose Your Username :</div></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <input type="text" name="username" id="textfield4" placeholder="Username">
      </div></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Create Password :</div></td>
      <td><div align="left">Confirm Password :</div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <input type="text" name="password" id="textfield5" placeholder="Password">
      </div></td>
      <td><div align="left">
        <input type="text" name="textfield6" id="textfield6" placeholder="re-enter Password">
      </div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Date Of Birth :</div></td>
      <td><div align="left"></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <select name="mob" id="select">
          <option>Month</option>
          <option value="January">January</option>
          <option value="February">February</option>
          <option value="March">March</option>
          <option value="April">April</option>
          <option value="May">May</option>
          <option value="June">June</option>
        </select>
      </div></td>
      <td><div align="left">
        <select name="yob" id="select2">
          <option>Year</option>
          <option value="2000">2000</option>
          <option value="2001">2001</option>
          <option value="2003">2003</option>
          <option value="2004">2004</option>
          <option value="2005">2005</option>
          <option value="2006">2006</option>
        </select>
      </div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Gender :</div></td>
      <td><div align="left"></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <select name="gender" id="select3">
          <option value=""> Select Gender</option>
          <option value="Male">Male</option>
          <option value="Female">Female</option>
          
        </select>
      </div></td>
      <td><div align="left"></div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Mobile Number :</div></td>
      <td><div align="left">Location :</div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">
        <input name="telNo" type="text" id="textfield8" placeholder="+256">
      </div></td>
      <td><div align="left">
        <select name="location" id="select4">
          <option>-- Select --</option>
          <option value="Kampala"> Kampala</option>
          <option value="Jinja">Jinja</option>
          <option value="Mukono">Mukono</option>
        </select>
      </div></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><div align="left">Your Current Email Address:
        <input type="text" name="email" id="textfield7" placeholder="Email Address">
      </div></td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
   
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td >
          <div align="center">
        <label>
          
            <input type="submit" name="Submit" value="Submit" />
          
        </label>
              </div>
      
      </td>
    </tr>
  </table>
        </form>
        
    </body>
</html>
