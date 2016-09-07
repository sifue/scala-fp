object ImplicitParamStudy {

  class Connection {
    def executeQuery(query: String): Unit = println(s"Execute: ${query}")
  }

  def createTitle(title: String)(implicit conn: Connection) = conn.executeQuery(s"create title='${title}'")

  def selectTitle(implicit conn: Connection) = conn.executeQuery(s"select")

  def updateTitle(title: String)(implicit conn: Connection) = conn.executeQuery(s"update title='${title}'")

  def deleteTitle(title: String)(implicit conn: Connection) = conn.executeQuery(s"delete title='${title}'")

}