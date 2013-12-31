package lila.chat

private[chat] object actorApi {

case class Command(chanOption: Option[Chan], member: ChatMember, text: String)

case class Tell(member: ChatMember, text: String)

case class SetOpen(member: ChatMember, value: Boolean)

case class Query(member: ChatMember, username: String)

case class Join(member: ChatMember, chan: Chan)

case class Activate(member: ChatMember, chan: Chan)
case class DeActivate(member: ChatMember, chan: Chan)
}