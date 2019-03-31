package models

import java.net.URL

case object UrlModel {
  def apply(url: URL): UrlModel = {
    val authority = url.getAuthority
    val protocol = url.getProtocol
    val topLevelDomain = s"$protocol://$authority"
    val filePath = url.getPath
    UrlModel(topLevelDomain, filePath)
  }
}
case class UrlModel(topDomain: String, filePath: String)