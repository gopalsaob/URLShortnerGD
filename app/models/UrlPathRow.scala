package models

import play.api.libs.json._

case class UrlPathRow(id: Long, path: String, parentId: Option[Long])

object UrlPathRow {
  implicit val personFormat = Json.format[UrlPathRow]
}
