package app;

import app.book.BookController;
import app.book.BookDao;
import app.index.IndexController;
import app.login.LoginController;
import app.user.UserDao;
import app.util.Filters;
import app.util.HerokuUtil;
import app.util.Path;
import app.util.ViewUtil;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Main {

    // Declare dependencies
    public static BookDao bookDao;
    public static UserDao userDao;

    public static void main(String[] args) {


        // Instantiate your dependencies
        bookDao = new BookDao();
        userDao = new UserDao();

        Javalin app = Javalin.create()
            .port(HerokuUtil.getHerokuAssignedPort())
            .enableStaticFiles("/public")
            .enableRouteOverview("/routes")
            .start();

        app.routes(() -> {
            before(Filters.handleLocaleChange);
            before(LoginController.ensureLoginBeforeViewingBooks);
            get(Path.Web.INDEX, IndexController.serveIndexPage);
            get(Path.Web.BOOKS, BookController.fetchAllBooks);
            get(Path.Web.ONE_BOOK, BookController.fetchOneBook);
            get(Path.Web.LOGIN, LoginController.serveLoginPage);
            post(Path.Web.LOGIN, LoginController.handleLoginPost);
            post(Path.Web.LOGOUT, LoginController.handleLogoutPost);
        });

        app.error(404, ViewUtil.notFound);
    }

}
