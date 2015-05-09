new File("file2.txt").eachLine({
line->
println(line.replaceAll("\\s",""))
})