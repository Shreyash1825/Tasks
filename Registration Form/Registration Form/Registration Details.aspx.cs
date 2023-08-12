using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Registration_Form
{
    public partial class Registration_Details : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            fname.Text = (String)Session["Fname"];
            Username.Text = (String)Session["UID"];
            Email.Text = (String)Session["E-mail"];
            Mobile.Text = (String)Session["MOB"];
            DOB.Text = (String)Session["DOB"];
            Gender.Text = (String)Session["Gender"];
            

        }

        protected void Button4_Click(object sender, EventArgs e)
        {
            

            Response.Redirect("Login Form.aspx");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            {


                Response.Redirect("Login Form.aspx");
            }
        }
    }
}