package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import java.net.URL

import scala.concurrent.{ Future, ExecutionContext }

/**
 * A repository for people.
 *
 * @param dbConfigProvider The Play db config provider. Play will inject this for you.
 */
@Singleton
class UrlPathRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  // We want the JdbcProfile for this provider
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  import dbConfig._
  import profile.api._

  private class UrlPathTable(tag: Tag) extends Table[UrlPathRow](tag, "UrlPath") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def path = column[String]("path")

    def parentId = column[Option[Long]]("parent_id")

    def * = (id, path, parentId) <> ((UrlPathRow.apply _).tupled, UrlPathRow.unapply)
  }

  private val urlPaths = TableQuery[UrlPathTable]

  // TBD
//  def create(url: UrlModel): Future[UrlPathRow] = db.run {
//  }

  // TBD
  def listById(id: Long) = {
    // Implement recursive CTE vs 'h' DB calls where h is the depth of the tree
  }
}
