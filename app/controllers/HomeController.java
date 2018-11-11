package controllers;

import models.player;
import play.mvc.*;
import views.html.index;
import play.Logger;
import play.api.Play;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import javax.inject.Inject;
import java.io.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import static play.libs.Json.toJson;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final FormFactory formFactory;
    private final JPAApi jpaApi;

    @Inject
    public HomeController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    @Transactional
    public Result addPlayer() {
        player player = formFactory.form(player.class).bindFromRequest().get();
        System.out.println(player.toString());
        jpaApi.em().persist(player);

        return redirect(routes.HomeController.index());
    }

    @Transactional
    public Result editPlayer(Long id) {
        player oldplayer = jpaApi.em().find(player.class, id);
        player player = formFactory.form(player.class).bindFromRequest().get();

        oldplayer.firstName = player.firstName;
        oldplayer.lastName = player.lastName;
        oldplayer.age = player.age;
        return redirect(routes.HomeController.index());

    }

    @Transactional
    public Result deletePlayer(Long id) {
        jpaApi.em().remove(jpaApi.em().find(player.class, id));
        return redirect(routes.HomeController.index());
    }

    @Transactional(readOnly = true)
    public Result getPlayers() {
        List<player> players = (List<player>) jpaApi.em().createQuery("select p from player p").getResultList();
        return ok(toJson(players));
    }
    
    @Transactional(readOnly = true)
    public Result getPlayer(Long id1) {
        player player = jpaApi.em().find(player.class, id1);
        return ok(toJson(player));

    }
}
