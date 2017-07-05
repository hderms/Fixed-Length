package com.github.atais.read

/**
  * Created by msiatkowski on 23.06.17.
  */
trait Read[A] extends Serializable {
  def read(str: String): Either[Throwable, A]
}

object Read {

  def read[A](f: String => Either[Throwable, A]): Read[A] = new Read[A] {
    override def read(str: String): Either[Throwable, A] = f(str)
  }

}

