package chapter9

import java.io.File

object FileMatcher {
  private def filesHere = (new File(".")).listFiles()
  def fileMathcing(query: String,
                   matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(query, file.getName))
      yield file
  }
  def filesEnding(query: String) = {
    fileMathcing(query, _.endsWith(_))//same as: fileMatching(query, (filename: String, query: String) => filename.endWith(query))
                                      //same as: fileMatching(query, (filename, query) => filename.endWith(query))
                                      //cause mathcer already define the args type
  }
  def fileContaining(query: String) =
    fileMathcing(query, _.contains(_))
  def fileRegex(query: String) =
    fileMathcing(query, _.matches(_))


}
