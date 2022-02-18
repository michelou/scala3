// Generated by https://github.com/tanishiking/semanticdb-for-scala3
// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal._
import scala.annotation.internal.sharable

sealed abstract class Language(val value: _root_.scala.Int)  extends SemanticdbGeneratedEnum  derives CanEqual {
  type EnumType = Language
  def isUnknownLanguage: _root_.scala.Boolean = false
  def isScala: _root_.scala.Boolean = false
  def isJava: _root_.scala.Boolean = false
  
  final def asRecognized: _root_.scala.Option[dotty.tools.dotc.semanticdb.Language.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[dotty.tools.dotc.semanticdb.Language.Recognized])
}

object Language  {
  sealed trait Recognized extends Language
  
  @SerialVersionUID(0L)
  case object UNKNOWN_LANGUAGE extends Language(0) with Language.Recognized {
    val index = 0
    val name = "UNKNOWN_LANGUAGE"
    override def isUnknownLanguage: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SCALA extends Language(1) with Language.Recognized {
    val index = 1
    val name = "SCALA"
    override def isScala: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object JAVA extends Language(2) with Language.Recognized {
    val index = 2
    val name = "JAVA"
    override def isJava: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int)  extends Language(unrecognizedValue) with SemanticdbUnrecognizedEnum
  
  lazy val values = scala.collection.immutable.Seq(UNKNOWN_LANGUAGE, SCALA, JAVA)
  def fromValue(__value: _root_.scala.Int): Language = __value match {
    case 0 => UNKNOWN_LANGUAGE
    case 1 => SCALA
    case 2 => JAVA
    case __other => Unrecognized(__other)
  }
  
  
}