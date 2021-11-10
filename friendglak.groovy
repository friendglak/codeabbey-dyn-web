/*
  groovyc friendglak.groovy
*/

def main () {
  def scanner = new Scanner(System.in)
  String data = System.in.newReader().readLines()
  def split = data.findAll(/\d{1,8}(?:\.\d{1,10})?/)
  int secret = Integer.parseInt(split[0])
  def rangeMin = Math.ceil(10000 / secret)
  def rangeMax = Math.floor(99999999 / secret)
  def answer = (Math.floor(Math.random() * (rangeMax - rangeMin))
  + rangeMin) * secret
  //print "Random value is " + Math.round(answer)
  print ""
}

main()

/*
  cat DATA.lst | groovy friendglak.groovy
    
*/
