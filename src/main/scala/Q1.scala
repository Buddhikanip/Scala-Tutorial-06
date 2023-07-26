import scala.io.StdIn.readLine

object Q1  extends App(){

  def encrypt(s:String,key:Int):String = {
    if (!s.isEmpty) {
      (s.head + key).toChar + encrypt(s.tail,key)
    }
    else ""
  }

  def decrypt(s: String,key:Int):String = {
    if (!s.isEmpty) {
      (s.head - key).toChar + decrypt(s.tail, key)
    }
    else ""
  }

  print("Enter String you want to encrypt or decrypt : ")
  val str = readLine()

  print("Enter key : ")
  val key = readLine().toInt

  print("If you want to encrypt this press 1 , want to decrypt press 2 : ")
  val meth = readLine().toInt

   if(meth == 1 || (0<key && key<26)) print(encrypt(str,key))
   else if (meth == 2 || (0<key && key<26)) print(decrypt(str,key))
   else print("Wrong input")
}
