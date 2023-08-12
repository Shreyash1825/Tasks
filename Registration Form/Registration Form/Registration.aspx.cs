using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Registration_Form
{
    public partial class Registration : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void ListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void RadioButtonList1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Session["Fname"] = TextBox1.Text + " " + TextBox2.Text + " " + TextBox3.Text;
            Session["UID"] = TextBox4.Text;
            Session["E-mail"] = TextBox7.Text;
            Session["MOB"] = TextBox8.Text;
            Session["DOB"] = TextBox9.Text;
            Session["Gender"] = RadioButtonList1.SelectedValue;
            

            Response.Redirect("Registration Details.aspx");
        }
    }
}