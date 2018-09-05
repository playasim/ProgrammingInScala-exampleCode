import java.io.File

val fileshere = (new File(".")).listFiles()
for (file <- fileshere)
  println(file)
for (i <- 1 to 4)
  println("Iteration " + i)

for (i <- 1 until 4) //until不包含上界 4 输出 1，2，3
  println("Iteration " + i)

//filter
for (file <- fileshere
  if file.isFile
  if file.getName.endsWith(".scala"))
  println(file)
//使用嵌套迭代时，要在每层后加一个分号
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList
def grep(pattern: String) =
  for (
    file <- fileshere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  )
    println(file + ": " + line.trim)
grep(".*gcd.*")

def scalaFiles =
  for {
    file <- fileshere
    if file.getName.endsWith(".scala")
  } yield file
//yield 使得for有返回值
val forLineLengths =
  for {
    file <- fileshere
    if file.getName.endsWith(".bat")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

//match
val firstArg = "salt"

val friend =
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "???"
  }
println("friend: " + friend)

//avoid break & continue
var i = 0
var foundIt = false
val strings = List("qwe","+asd","-dzdas+")
while (i < strings.length && !foundIt) {
  if (!strings(i).startsWith("-")) {
    if (strings(i).endsWith("+"))
      foundIt = true
  }
  i += 1
}