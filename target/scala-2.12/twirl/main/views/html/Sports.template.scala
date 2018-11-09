
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

object Sports extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Sports")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<!-- Here is where we will auto the name of the sport League-->
  <h1>Sport Stats</h1>
<body>



  <div class="nav">
  <a href="Players.scala.html"></a>
  <a href="Teams.scala.html"></a><br>
  </div>


</body>


""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 09 15:24:05 EST 2018
                  SOURCE: /Users/nicholas/Google Drive/PSU/Semester 7/IST 411/playtest411/app/views/Sports.scala.html
                  HASH: 327ec6248944c6993aa844ea02ec017e4ac508b9
                  MATRIX: 942->1|1038->3|1068->8|1090->22|1129->24|1161->30|1419->258
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|51->19
                  -- GENERATED --
              */
          