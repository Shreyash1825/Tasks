<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Registration Details.aspx.cs" Inherits="Registration_Form.Registration_Details" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        #form1 {
            background-color: #FFCCCC;
        }
    </style>
</head>
<body style="background-color: #FFCCCC">
    <form id="form1" runat="server">
        <br />
&nbsp;&nbsp;&nbsp;&nbsp; First&nbsp;&nbsp; Name&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="fname" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
        <br />
&nbsp;&nbsp;&nbsp; Username /ID&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Username" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
&nbsp;&nbsp;
        <br />
&nbsp;&nbsp;&nbsp;&nbsp; E-Mail ID&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Email" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;
        <br />
&nbsp;&nbsp;&nbsp;&nbsp; Mobile No&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Mobile" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; DOB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="DOB" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Gender" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button1" runat="server" BackColor="Black" ForeColor="White" Height="40px" OnClick="Button1_Click" Text="Logout" Width="109px" />
        <br />
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
</body>
</html>
