
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-2.2.0.min.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
        <script type='text/javascript' src='"""),_display_(/*10.46*/routes/*10.52*/.Assets.at("javascripts/index.js")),format.raw/*10.86*/("""'></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery.dataTables.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/dataTables.bootstrap.min.js")),format.raw/*13.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/dropzone.js")),format.raw/*14.66*/("""" type="text/javascript"></script>

        <link rel="stylesheet" type="text/css" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*16.104*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*17.55*/routes/*17.61*/.Assets.at("stylesheets/dataTables.bootstrap.min.css")),format.raw/*17.115*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.at("stylesheets/model.css")),format.raw/*18.96*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/dropzone.css")),format.raw/*19.99*/("""'>
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 13 17:06:52 EST 2018
                  SOURCE: C:/Users/super/Google Drive/PSU/Semester 7/IST 411/playtest411/app/views/main.scala.html
                  HASH: e075f147838856f98fd9719333ea3d5fa49d07a7
                  MATRIX: 952->1|1077->31|1107->35|1188->90|1213->95|1307->163|1321->169|1373->201|1425->227|1439->233|1504->278|1612->359|1627->365|1682->399|1744->434|1759->440|1822->482|1907->540|1922->546|1993->596|2078->654|2093->660|2167->713|2252->771|2267->777|2325->814|2444->906|2459->912|2524->955|2609->1013|2624->1019|2700->1073|2785->1131|2800->1137|2856->1172|2941->1230|2956->1236|3015->1274|3080->1312|3108->1319|3141->1325
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|54->22|54->22|55->23
                  -- GENERATED --
              */
          