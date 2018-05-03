package com.datalogs

import org.scalatra._

case class User(id: Int, name: String)

class test_servlet1 extends ScalatraServlet {

  var users: List[User]  = List(User(1, "John"), User(2, "Todd"), User(3, "Chris"))

  get("/") {
    views.html.hello()
  }

  get("/users") {
    users
  }

}
