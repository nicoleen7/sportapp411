
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

"""),_display_(/*3.2*/main("Sport App 411")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="jumbotron">
            <h3>Sports App</h3>
            <button data-toggle="modal" data-target="#squarespaceModal" class="btn btn-primary">
                <i class="glyphicon glyphicon-plus"></i>Add new</button>
        </div>

        <table align="center" id="example" class="table table-striped table-bordered table-hover" cellspacing="0" width="80%">
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
            <tfoot>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                </tr>
            </tfoot>
        </table>
    </div>

        <!-- line modal -->
    """),format.raw/*33.29*/("""
    """),format.raw/*34.5*/("""<div class="modal fade" id="squarespaceModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add to the database</h3>
                </div>
                <form method="POST" action=""""),_display_(/*42.46*/routes/*42.52*/.HomeController.addPlayer()),format.raw/*42.79*/("""" id="formedit" enctype="multipart/form-data">

                    <div class="modal-body">
                            <!-- content goes here -->
                        <input type="hidden" name="id" id="id">

                        <div class="form-group">
                            <label for="fnamePlayer">First Name</label>
                            <input type="text" class="form-control" name="firstname" placeholder="Enter the first name" required>
                        </div>
                        <div class="form-group">
                            <label for="lnamePlayer">Last Name</label>
                            <input type="text" class="form-control" name="lastname" placeholder="Enter the last name" required>
                        </div>
                        <div class="form-group">
                            <label for="agePlayer">Age</label>
                            <input type="text" class="form-control" name="age" placeholder="Enter the age" required>
                        </div>
                    <div class="modal-footer">
                        <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button type="submit" id="saveImage" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                    Submit</button>
                            </div>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>
    """),format.raw/*76.21*/("""
    """),format.raw/*77.5*/("""<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                    <h4 class="modal-title custom_align" id="Heading">Delete this player</h4>
                </div>
                <form action="/deletePlayer/" id="formdel">
                    <div class="modal-body">

                        <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span>
                            Are you sure you want to delete this player?</div>

                    </div>
                    <div class="modal-footer ">
                        <button type="submit" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>
                             Yes</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>
                             No</button>
                    </div>
                </form>
            </div>

                <!-- /.modal-content -->
        </div>
            <!-- /.modal-dialog -->
    </div>
    """),format.raw/*104.27*/("""
    """),format.raw/*105.5*/("""<div id="modalAffich" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <img src="" class="img-responsive" id="coverid">
                </div>
            </div>
        </div>
    </div>


""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 13 17:06:52 EST 2018
                  SOURCE: C:/Users/super/Google Drive/PSU/Semester 7/IST 411/playtest411/app/views/index.scala.html
                  HASH: 85a0c7767ee606386f8688ffe167689f515f862b
                  MATRIX: 941->1|1037->3|1067->8|1096->29|1135->31|1167->37|2131->997|2164->1003|2776->1588|2791->1594|2839->1621|4744->3514|4777->3520|6243->4979|6277->4985
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|65->33|66->34|74->42|74->42|74->42|108->76|109->77|136->104|137->105
                  -- GENERATED --
              */
          