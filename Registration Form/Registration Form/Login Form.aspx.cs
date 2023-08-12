using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Registration_Form
{
    public partial class Login_Form : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (TextBox1.Text == "Shreyash" && TextBox2.Text == "1809")
            {
                Response.Redirect("Registration.aspx");
            }
       

            else
            {
                Label4.Text = "Enter valid User Name or Password";
            }
        }
    }
}