
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Spots Stats</h1>
<body>
  Sports: <br/>
  <div class="nav">
  <a href="NFL.scala.html"><img src= "NFL.gif" height="65" width="85" alt="NFL"></a>
  <a href="NBA.scala.html"><img src= "NBA.gif" height="65" width="85" alt="NBA"></a>
  <a href="NHL.scala.html"><img src= "NHL.gif" height="65" width="85" alt="NHL"></a><br>
  </div>
</body>
""")))}),format.raw/*13.2*/("""
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
                  DATE: Sun Oct 28 23:42:46 EDT 2018
                  SOURCE: C:/Users/super/Google Drive/PSU/Semester 7/IST 411/playtest411/app/views/index.scala.html
                  HASH: 559d29111fc4b9fd14e699f051c2870f1834e21b
                  MATRIX: 941->1|1037->3|1067->8|1098->31|1137->33|1167->37|1547->387
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|45->13
                  -- GENERATED --
              */
          