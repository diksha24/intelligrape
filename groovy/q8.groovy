new File("file2.txt").eachLine({
line,it->
if(it%2==1)
println("Line"+it+":"+line)
})
